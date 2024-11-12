package com.mnn.llm;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Chat mChat;
    private Intent mIntent;
    private Button mLoadButton;
    private TextView mModelInfo;
    private EditText mEditTextPath;
    private Spinner mSpinnerModels;
    private Handler mHandler;
    private final String mSearchPath = "/data/user/0/com.mnn.llm/files/";
    private String mModelName = "Qwen-1_8B-Chat-MNN";
    private String mModelDir = mSearchPath + mModelName;
    @SuppressLint("HandlerLeak")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mIntent = new Intent(this, Conversation.class);
        mModelInfo = findViewById(R.id.model_info);
        mLoadButton = findViewById(R.id.load_button);
        mHandler = new Handler(Looper.getMainLooper());
        mEditTextPath = findViewById(R.id.edit_text_path);
        mSpinnerModels = findViewById(R.id.spinner_models);
        mModelDir = this.getCacheDir() + "/" + mModelName;
        mEditTextPath.setText(mSearchPath);

        String inputPath = mEditTextPath.getText().toString().trim();
        // Create the directory Qwen-1_8B-Chat-MNN
        File modelDirectory = new File(mSearchPath, mModelName);
        if (!modelDirectory.exists()) {
            mLoadButton.setClickable(false);
            mLoadButton.setBackgroundColor(Color.parseColor("#2454e4"));
            mLoadButton.setText("Downloading model...");
            modelDirectory.mkdirs();
            Log.d("ModelCopy", "Created directory: " + modelDirectory.getAbsolutePath());
            new Thread(new Runnable() {
                @Override
                public void run() {
                    copyAssetsFolderToInternalStorage("Qwen-1_8B-Chat-MNN", modelDirectory.getAbsolutePath());
                    mHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            mLoadButton.setClickable(true);
                            mLoadButton.setBackgroundColor(Color.parseColor("#0077FF"));
                            mLoadButton.setText("Load Model");
                        }
                    });
                }
            }).start();

        }
        populateFoldersSpinner(inputPath);populateFoldersSpinner(inputPath);
        mSpinnerModels.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position > 0) {
                    mModelName = (String) parent.getItemAtPosition(position);
                    mModelInfo.setText(String.format("Selected model: %s", mModelName));
                    mModelInfo.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });
    }

    public void loadModel(View view) {
        onCheckModels();
        mLoadButton.setClickable(false);
        mLoadButton.setBackgroundColor(Color.parseColor("#2454e4"));
        mLoadButton.setText("Loading model...");
        Log.d("configPath", mSearchPath + mModelName + "/config.json");

        new Thread(() -> {
            mChat = new Chat();
            mChat.Init(mSearchPath + mModelName + "/config.json");
            runOnUiThread(() -> {
                mIntent.putExtra("chat", mChat);
                startActivity(mIntent);
            });

        }).start();
    }

    private void onCheckModels() {
        boolean modelReady = checkModelsReady();
        if (!modelReady) {
            try {
                mModelDir = Common.copyAssetResource2File(this, mModelName);
                modelReady = checkModelsReady();
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if (!modelReady) {
            mModelInfo.setVisibility(View.VISIBLE);
            mModelInfo.setText(String.format("%sModel files ready, loading model", mModelName));
            mLoadButton.setText("Loading model...");
        }
    }

    private boolean checkModelsReady() {
        File dir = new File(mModelDir);
        return dir.exists();
    }


    private void copyAssetsFolderToInternalStorage(String folderName, String outputPath) {
        Log.d("ModelCopy", "Start copying assets from: " + folderName);
        try {
            String[] assets = getAssets().list(folderName);
            if (assets != null) {
                for (String asset : assets) {
                    InputStream is = getAssets().open(folderName + "/" + asset);
                    File outFile = new File(outputPath, asset);
                    // Check if the asset is a directory
                    if (isDirectory(folderName + "/" + asset)) {
                        // Create the directory if it doesn't exist
                        outFile.mkdirs();
                        // Recursively copy the directory contents
                        copyAssetsFolderToInternalStorage(folderName + "/" + asset, outFile.getAbsolutePath());
                    } else {
                        // Copy the file
                        FileOutputStream fos = new FileOutputStream(outFile);
                        byte[] buffer = new byte[1024];
                        int length;
                        while ((length = is.read(buffer)) > 0) {
                            fos.write(buffer, 0, length);
                        }
                        fos.close();
                        Log.d("ModelCopy", "Copied asset: " + asset);
                    }
                    is.close();
                }
            }
        } catch (IOException e) {
            Log.e("ModelCopy", "Failed to copy assets", e);
        }
    }

    private boolean isDirectory(String assetName) {
        try {
            String[] subAssets = getAssets().list(assetName);
            return subAssets != null && subAssets.length > 0;
        } catch (IOException e) {
            return false;
        }
    }

    private ArrayList<String> getFoldersList(String path) {
        File directory = new File(path);
        File[] files = directory.listFiles();
        ArrayList<String> foldersList = new ArrayList<>();
        if (files != null) {
            for (File file : files) {
                Log.d("FolderName", "Found folder: " + file.getName());
                if (file.isDirectory()) {
                    foldersList.add(file.getName());
                }
            }
        }
        return foldersList;
    }

    private void populateFoldersSpinner(String path) {
        ArrayList<String> folders = getFoldersList(path);
        folders.add(0, getString(R.string.spinner_prompt));
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, folders);
        mSpinnerModels.setAdapter(adapter);
    }
}

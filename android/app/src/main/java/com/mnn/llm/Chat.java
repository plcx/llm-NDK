package com.mnn.llm;

import java.io.Serializable;

public class Chat implements Serializable {
    public native boolean Init(String modelDir);
    public native String Submit(String input);
    public native byte[] Response();
    public native void Done();
    public native void Reset();

    static {
        System.loadLibrary("llm");
        //System.load("/data/user/0/com.mnn.llm/files/libllm.so");
        //System.load("/data/user/0/com.mnn.llm/files/libMNN_CL.so");
        //System.load("/data/user/0/com.mnn.llm/files/libMNN_Express.so");
        //System.load("/data/user/0/com.mnn.llm/files/libMNN.so");
    }

}

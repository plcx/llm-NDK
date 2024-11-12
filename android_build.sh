# 4. build mnn-llm android
TOOLCHAIN_FILE="C:/Users/User/AppData/Local/Android/Sdk/ndk/21.4.7075529/build/cmake/android.toolchain.cmake"
mkdir android_build

cd android_build

cmake .. \
-DCMAKE_TOOLCHAIN_FILE="$TOOLCHAIN_FILE" \
-DANDROID_STL=c++_static \
-DANDROID_ABI="arm64-v8a" \
-DANDROID_NATIVE_API_LEVEL=android-21  \
-DMNN_ARM82=ON \
-DCMAKE_BUILD_TYPE=Release \
-DBUILD_FOR_ANDROID=ON \

cd ..
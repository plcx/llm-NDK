# Set the NDK path
export ANDROID_NDK="C:/Users/User/AppData/Local/Android/Sdk/ndk/21.4.7075529"

cmake .. \
-DCMAKE_TOOLCHAIN_FILE=$ANDROID_NDK/build/cmake/android.toolchain.cmake \
-DANDROID_STL=c++_static \
-DANDROID_ABI="arm64-v8a" \
-DANDROID_NATIVE_API_LEVEL=android-21  \
-DMNN_ARM82=ON \
-DCMAKE_BUILD_TYPE=Release \
-DBUILD_FOR_ANDROID=ON
make -j4
cd ..

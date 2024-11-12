![mnn-llm](../resource/logo.png)

# mnn-llm

`mnn-llm`是基于MNN开发的LLM推理引擎，支持目前主流的开源LLM模型。


## 模型导出与下载

llm模型导出`onnx`和`mnn`模型请使用[llm-export](https://github.com/wangzhaode/llm-export)

`modelscope`模型下载：

<details>
  <summary>qwen</summary>

- [modelscope-qwen-1.8b-chat]
- [modelscope-qwen-7b-chat]
- [modelscope-qwen-vl-chat]
- [modelscope-qwen1.5-0.5b-chat]
- [modelscope-qwen1.5-1.8b-chat]
- [modelscope-qwen1.5-4b-chat]
- [modelscope-qwen1.5-7b-chat]
- [modelscope-qwen2-0.5b-instruct]
- [modelscope-qwen2-1.5b-instruct]
- [modelscope-qwen2-7b-instruct]
- [modelscope-qwen2-vl-2b-instruct]
- [modelscope-qwen2-vl-7b-instruct]
- [modelscope-qwen2.5-0.5b-instruct]
- [modelscope-qwen2.5-1.5b-instruct]
- [modelscope-qwen2.5-3b-instruct]
- [modelscope-qwen2.5-7b-instruct]
- [modelscope-qwen2.5-coder-1.5b-instruct]
- [modelscope-qwen2.5-coder-7b-instruct]
- [modelscope-qwen2.5-math-1.5b-instruct]
- [modelscope-qwen2.5-math-7b-instruct]
- [modelscope-reader-lm-0.5b]
- [modelscope-reader-lm-1.5b]

</details>

<details>
  <summary>glm</summary>

- [modelscope-chatglm-6b]
- [modelscope-chatglm2-6b]
- [modelscope-codegeex2-6b]
- [modelscope-chatglm3-6b]
- [modelscope-glm4-9b-chat]

</details>

<details>
  <summary>llama</summary>

- [modelscope-llama2-7b-chat]
- [modelscope-llama3-8b-instruct]
- [modelscope-llama3.2-1b-instruct]
- [modelscope-llama3.2-3b-instruct]
- [modelscope-baichuan2-7b-chat]
- [modelscope-internlm-chat-7b]
- [modelscope-yi-6b-chat]
- [modelscope-deepseek-7b-chat]
- [modelscope-tinyllama-1.1b-chat]

</details>

<details>
  <summary>phi</summary>

- [modelscope-phi-2]

</details>

<details>
  <summary>embedding</summary>

- [modelscope-bge-large-zh]
- [modelscope-gte_sentence-embedding_multilingual-base]

</details>

[modelscope-qwen-1.8b-chat]: https://modelscope.cn/models/zhaode/Qwen-1_8B-Chat-MNN/files
[modelscope-qwen-7b-chat]: https://modelscope.cn/models/zhaode/Qwen-7B-Chat-MNN/files
[modelscope-qwen-vl-chat]: https://modelscope.cn/models/zhaode/Qwen-VL-Chat-MNN/files
[modelscope-qwen1.5-0.5b-chat]: https://modelscope.cn/models/zhaode/Qwen1.5-0.5B-Chat-MNN/files
[modelscope-qwen1.5-1.8b-chat]: https://modelscope.cn/models/zhaode/Qwen1.5-1.8B-Chat-MNN/files
[modelscope-qwen1.5-4b-chat]: https://modelscope.cn/models/zhaode/Qwen1.5-4B-Chat-MNN/files
[modelscope-qwen1.5-7b-chat]: https://modelscope.cn/models/zhaode/Qwen1.5-7B-Chat-MNN/files
[modelscope-qwen2-0.5b-instruct]: https://modelscope.cn/models/zhaode/Qwen2-0.5B-Instruct-MNN/files
[modelscope-qwen2-1.5b-instruct]: https://modelscope.cn/models/zhaode/Qwen2-1.5B-Instruct-MNN/files
[modelscope-qwen2-7b-instruct]: https://modelscope.cn/models/zhaode/Qwen2-7B-Instruct-MNN/files
[modelscope-qwen2-vl-2b-instruct]: https://modelscope.cn/models/zhaode/Qwen2-VL-2B-Instruct-MNN/files
[modelscope-qwen2-vl-7b-instruct]: https://modelscope.cn/models/zhaode/Qwen2-VL-7B-Instruct-MNN/files
[modelscope-qwen2.5-0.5b-instruct]: https://modelscope.cn/models/zhaode/Qwen2.5-0.5B-Instruct-MNN/files
[modelscope-qwen2.5-1.5b-instruct]: https://modelscope.cn/models/zhaode/Qwen2.5-1.5B-Instruct-MNN/files
[modelscope-qwen2.5-3b-instruct]: https://modelscope.cn/models/zhaode/Qwen2.5-3B-Instruct-MNN/files
[modelscope-qwen2.5-7b-instruct]: https://modelscope.cn/models/zhaode/Qwen2.5-7B-Instruct-MNN/files
[modelscope-qwen2.5-coder-1.5b-instruct]: https://modelscope.cn/models/zhaode/Qwen2.5-Coder-1.5B-Instruct-MNN/files
[modelscope-qwen2.5-coder-7b-instruct]: https://modelscope.cn/models/zhaode/Qwen2.5-Coder-7B-Instruct-MNN/files
[modelscope-qwen2.5-math-1.5b-instruct]: https://modelscope.cn/models/zhaode/Qwen2.5-Math-1.5B-Instruct-MNN/files
[modelscope-qwen2.5-math-7b-instruct]: https://modelscope.cn/models/zhaode/Qwen2.5-Math-7B-Instruct-MNN/files
[modelscope-reader-lm-0.5b]: https://modelscope.cn/models/zhaode/reader-lm-0.5b-MNN/files
[modelscope-reader-lm-1.5b]: https://modelscope.cn/models/zhaode/reader-lm-1.5b-MNN/files

[modelscope-chatglm-6b]: https://modelscope.cn/models/zhaode/chatglm-6b-MNN/files
[modelscope-chatglm2-6b]: https://modelscope.cn/models/zhaode/chatglm2-6b-MNN/files
[modelscope-codegeex2-6b]: https://modelscope.cn/models/zhaode/codegeex2-6b-MNN/files
[modelscope-chatglm3-6b]: https://modelscope.cn/models/zhaode/chatglm3-6b-MNN/files
[modelscope-glm4-9b-chat]: https://modelscope.cn/models/zhaode/glm-4-9b-chat-MNN/files

[modelscope-llama2-7b-chat]: https://modelscope.cn/models/zhaode/Llama-2-7b-chat-MNN/files
[modelscope-llama3-8b-instruct]: https://modelscope.cn/models/zhaode/Llama-3-8B-Instruct-MNN/files
[modelscope-llama3.2-1b-instruct]: https://modelscope.cn/models/zhaode/Llama-3.2-1B-Instruct-MNN/files
[modelscope-llama3.2-3b-instruct]: https://modelscope.cn/models/zhaode/Llama-3.2-3B-Instruct-MNN/files
[modelscope-baichuan2-7b-chat]: https://modelscope.cn/models/zhaode/Baichuan2-7B-Chat-MNN/files
[modelscope-internlm-chat-7b]: https://modelscope.cn/models/zhaode/internlm-chat-7b-MNN/files
[modelscope-yi-6b-chat]: https://modelscope.cn/models/zhaode/Yi-6B-Chat-MNN/files
[modelscope-deepseek-7b-chat]: https://modelscope.cn/models/zhaode/deepseek-llm-7b-chat-MNN/files
[modelscope-tinyllama-1.1b-chat]: https://modelscope.cn/models/zhaode/TinyLlama-1.1B-Chat-MNN/files
[modelscope-phi-2]: https://modelscope.cn/models/zhaode/phi-2-MNN/files

[modelscope-bge-large-zh]: https://modelscope.cn/models/zhaode/bge-large-zh-MNN/files
[modelscope-gte_sentence-embedding_multilingual-base]: https://modelscope.cn/models/zhaode/gte_sentence-embedding_multilingual-base-MNN/files

## 构建

CI构建状态：

[![Build Status][pass-linux]][ci-linux]
[![Build Status][pass-macos]][ci-macos]
[![Build Status][pass-windows]][ci-windows]
[![Build Status][pass-android]][ci-android]
[![Build Status][pass-ios]][ci-ios]
[![Build Status][pass-python]][ci-python]

[pass-linux]: https://github.com/wangzhaode/mnn-llm/actions/workflows/linux.yml/badge.svg
[pass-macos]: https://github.com/wangzhaode/mnn-llm/actions/workflows/macos.yml/badge.svg
[pass-windows]: https://github.com/wangzhaode/mnn-llm/actions/workflows/windows.yml/badge.svg
[pass-android]: https://github.com/wangzhaode/mnn-llm/actions/workflows/android.yml/badge.svg
[pass-ios]: https://github.com/wangzhaode/mnn-llm/actions/workflows/ios.yml/badge.svg
[pass-python]: https://github.com/wangzhaode/mnn-llm/actions/workflows/python.yml/badge.svg
[ci-linux]: https://github.com/wangzhaode/mnn-llm/actions/workflows/linux.yml
[ci-macos]: https://github.com/wangzhaode/mnn-llm/actions/workflows/macos.yml
[ci-windows]: https://github.com/wangzhaode/mnn-llm/actions/workflows/windows.yml
[ci-android]: https://github.com/wangzhaode/mnn-llm/actions/workflows/android.yml
[ci-ios]: https://github.com/wangzhaode/mnn-llm/actions/workflows/ios.yml
[ci-python]: https://github.com/wangzhaode/mnn-llm/actions/workflows/python.yml



### 4. 执行

```bash
# linux/macos
./cli_demo ./Qwen2-1.5B-Instruct-MNN/config.json # cli demo
./web_demo ./Qwen2-1.5B-Instruct-MNN/config.json ../web # web ui demo

# windows
.\Debug\cli_demo.exe ./Qwen2-1.5B-Instruct-MNN/config.json
.\Debug\web_demo.exe ./Qwen2-1.5B-Instruct-MNN/config.json ../web

# android
adb push libs/*.so build/libllm.so build/cli_demo /data/local/tmp
adb push model_dir /data/local/tmp
adb shell "cd /data/local/tmp && export LD_LIBRARY_PATH=. && ./cli_demo ./Qwen2-1.5B-Instruct-MNN/config.json"
```
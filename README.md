# OkHttpUtils
最简单的okhttp封装，CallBack方法执行在UI线程。支持get请求，post请求，支持文件上传和下载。

## 使用方法：
代码很简单，只有三个Java文件，建议下载后将Java文件拷贝到工程中使用。

## 封装的功能有：
###### 一般的get请求
###### 一般的post请求
###### 一般的put请求
###### 一般的delete请求
###### 上传单个文件(包含进度)
###### 上传list集合文件
###### 上传map集合文件
###### 文件下载(包含进度)
###### 图片下载(实现了图片的压缩)

## 使用示例
### GET请求
    String url = "https://www.baidu.com/";
    OkhttpUtil.okHttpGet(url, new CallBackUtil.CallBackString() {
        @Override
        public void onFailure(Call call, Exception e) {}

        @Override
        public void onResponse(String response) {
            Toast.makeText(MainActivity.this,"Success",Toast.LENGTH_SHORT).show();
            Log.d("kwwl",response);
        }
    });
### POST请求
    String url = "https://www.baidu.com/";
    HashMap<String, String> paramsMap = new HashMap<>();
    paramsMap.put("title","title");
    OkhttpUtil.okHttpPost(url, paramsMap, new CallBackUtil.CallBackString() {
        @Override
        public void onFailure(Call call, Exception e) {

        }

        @Override
        public void onResponse(String response) {

        }
    });

### PUT请求
    String url = "https://www.baidu.com/";
    HashMap<String, String> paramsMap = new HashMap<>();
    paramsMap.put("title","title");
    OkhttpUtil.okHttpPut(url, paramsMap, new CallBackUtil.CallBackString() {
        @Override
        public void onFailure(Call call, Exception e) {

        }

        @Override
        public void onResponse(String response) {

        }
    });

### DELETE请求
    String url = "https://www.baidu.com/";
    HashMap<String, String> paramsMap = new HashMap<>();
    paramsMap.put("title","title");
    OkhttpUtil.okHttpDelete(url, paramsMap, new CallBackUtil.CallBackString() {
        @Override
        public void onFailure(Call call, Exception e) {

        }

        @Override
        public void onResponse(String response) {

        }
    });

### 上传文件
    File file = new File(Environment.getExternalStorageDirectory()+"/kwwl/abc.jpg");
    HashMap<String, String> paramsMap = new HashMap<>();
    paramsMap.put("title","title");
    OkhttpUtil.okHttpUploadFile(url, file, "image", OkhttpUtil.FILE_TYPE_IMAGE, paramsMap, new CallBackUtil.CallBackString() {
        @Override
        public void onFailure(Call call, Exception e) {

        }

        @Override
        public void onProgress(float progress, long total) {

        }

        @Override
        public void onResponse(String response) {

        }
    });

### 下载文件
    OkhttpUtil.okHttpDownloadFile("url", new CallBackUtil.CallBackFile("fileDir","fileName") {
        @Override
        public void onFailure(Call call, Exception e) {

        }

        @Override
        public void onProgress(float progress, long total) {
        }

        @Override
        public void onResponse(File response) {

        }
    });

















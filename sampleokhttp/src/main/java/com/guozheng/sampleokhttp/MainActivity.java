package com.guozheng.sampleokhttp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.guozheng.okhttputils.okhttp.CallBackUtil;
import com.guozheng.okhttputils.okhttp.OkhttpUtil;

import java.util.HashMap;

import okhttp3.Call;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void click(View v){
        String url = "https://www.baidu.com/";
        getData(url);

        //postData(url);

    }

    private void postData(String url) {
        HashMap<String, String> paramsMap = new HashMap<>();
        paramsMap.put("title","title");
        paramsMap.put("desc","desc");
        OkhttpUtil.okHttpPost(url, paramsMap, new CallBackUtil.CallBackString() {
            @Override
            public void onFailure(Call call, Exception e) {

            }

            @Override
            public void onResponse(String response) {

            }
        });
    }

    private void getData(String url) {
        OkhttpUtil.okHttpGet(url, new CallBackUtil.CallBackString() {
            @Override
            public void onFailure(Call call, Exception e) {}

            @Override
            public void onResponse(String response) {
                Toast.makeText(MainActivity.this,"Success",Toast.LENGTH_SHORT).show();
                Log.d("kwwl",response);
            }
        });
    }
}

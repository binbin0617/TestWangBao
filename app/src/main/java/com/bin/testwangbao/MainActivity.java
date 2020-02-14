package com.bin.testwangbao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import com.bin.mylibrary.aty.MainAty;
import com.bin.mylibrary.base.BaseWebAty;
import com.bin.mylibrary.utils.LogUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String data = "{\"yhlx\":\"Teacher\",\"isSuccess\":\"1\",\"message\":\"成功\",\"rybh\":\"007289\",\"schoolid\":\"1\",\"bmbh\":\"58001\",\"uname\":\"张俊艳\",\"bmmc\":\"科研院1组\",\"yztUrl\":\"http://114.115.168.37:8081/YZT/HKELocalSignAndVerify\",\"userName\":\"张俊艳\",\"schoolName\":\"神州浩天(测试演示)\",\"userid\":\"007289\",\"loginUrl\":\"http://114.115.204.49\",\"ccp\":\"0\"}";
        setUserinfo(data);
    }

    public void click(View view) {
        BaseWebAty.init("http://114.115.181.185:8080/wsyy/index.html");
        startActivity(new Intent(MainActivity.this, MainAty.class));
    }

    public void setUserinfo(String data) {
        LogUtils.e("userinfoTest", "data   =" + data);
        SharedPreferences.Editor editor = this.getSharedPreferences("userinfoTest", Context.MODE_PRIVATE).edit();
        editor.putString("data", data);
        editor.commit();
    }

}

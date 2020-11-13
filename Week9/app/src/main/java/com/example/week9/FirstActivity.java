package com.example.week9;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_frist);

        Button btn1 = findViewById(R.id.Button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle bundle = new Bundle();
                bundle.putString("name","李依玲");
                bundle.putInt("id",41807737);
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                intent.putExtra("Message",bundle);
                startActivity(intent);

                /*String data = "Hello SecondActivity!";
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                intent.putExtra("hello",data);
                intent.putExtra("id",123);
                startActivityForResult(intent,1);传数据方法一*/

                /*Intent intent1 = new Intent(Settings.ACTION_SETTINGS);
                startActivity(intent1);打开手机的设置界面*/

                /*Uri uri = Uri.parse(("geo:39.9,116.3"));
                Intent intent1 = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent1);打开谷歌地图查找39.9，116.3的位置*/

               /*  Intent intent1 = new Intent(Intent.ACTION_DIAL);
                intent1.setData(Uri.parse("tel:10086"));
                startActivity(intent1);点击打电话*/

                /*Intent intent1 = new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("https://www.koolearn.com/?a_id=ec84c8399f0e47b2b444b208ff204ad6&ctx=&basePath=https%3A%2F%2Fun.koolearn.com%3A443%2F"));
                startActivity(intent1);点击跳转到网页*/

               /* Intent intent1 = new Intent("com.example.week9.MY_ACTION");
                intent1.addCategory("android.intent.category.DEFAULT");
                startActivity(intent1);点击跳转页面方法二*/

               /* Intent intent1 = new Intent(FirstActivity.this,SecondActivity.class);
                startActivity(intent1);点击跳转页面方法一*/

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LYL","FirstActivity的onStart()函数被调用");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case 1:
                if (requestCode == RESULT_OK){
                    String returnedData = data.getStringExtra("data_return");
                    Log.d("LYL",returnedData);
                }
        }
    }
}
package com.example.administrator.testgradle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String APP_ID=BuildConfig.APPLICATION_ID;


    Show showFlavor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((TextView) findViewById(R.id.appid_tv)).setText("APP_ID"+APP_ID);

        showFlavor=new ShowImp();
        ((TextView) findViewById(R.id.flavor_tv)).setText("flavor:"+showFlavor.getStr());


        ((TextView) findViewById(R.id.package_tv)).setText("package:"+getApplicationContext().getPackageName());

    }
}

package com.example.shengsheng.activitylifecycletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.util.Log;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button StartNormalActivity=(Button)findViewById(R.id.start_normal_activity);
        Button StartDialogActivity=(Button)findViewById(R.id.start_dialog_activity);
        StartDialogActivity.setOnClickListener(new View.OnClickListener()
        {
            @Override
                    public void onClick(View v)
            {
                Intent intent=new Intent(MainActivity.this.DialogActivity.class);
                StartActivity(intent);
            }
        });
        StartNormalActivity.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(MainActivity.this.DialogActivity.class);
                StartActivity(intent);
            }

        });
    }
    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d(TAG,"onStart");
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d(TAG,"onResume");
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d(TAG,"onPause");
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d(TAG,"onStop");
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d(TAG,"onStop");
    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }
    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d(TAG,"onRestart");
    }
}

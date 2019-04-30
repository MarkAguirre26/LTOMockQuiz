package com.drive.q;

import android.app.Activity;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.drive.q.com.drive.q.utils.Screen;

public class LauncherActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Screen.setFullScreen(this);
        setContentView(R.layout.activity_launcher);


        new CountDownTimer(3000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                Screen.setNextScreen(LauncherActivity.this,getApplicationContext());
//                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
//                overridePendingTransition(0, 0);
//                finish();
            }
        }.start();





    }
}

package com.example.user.localgrabsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CoverPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cover_page);

        Thread thread = new Thread()
        {
            @Override
            public void run() {
                try
                {
                    sleep(7000);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }

                finally {
                    Intent intent = new Intent(CoverPageActivity.this, MainActivity.class);
                    startActivity(intent);
                }

            }
        };
        thread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}

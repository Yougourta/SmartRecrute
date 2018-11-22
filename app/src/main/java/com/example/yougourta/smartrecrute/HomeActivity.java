package com.example.yougourta.smartrecrute;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * A login screen that offers login via email/password.
 */
public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    public void loginCandidat(View v){
        Intent intentLogin = new Intent(this, LoginCandidatActivity.class);
        startActivity(intentLogin);
    }
}


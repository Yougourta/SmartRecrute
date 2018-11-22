package com.example.yougourta.smartrecrute;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Yougourta on 22/11/2018.
 */

public class LoginCandidatActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void loginToOffers(View v){
        Intent intentOffers = new Intent(this, OffersActivity.class);
        startActivity(intentOffers);
    }
}

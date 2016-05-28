package com.aggarwalankur.myportfolioapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * 
 */
public class PortfolioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
    }


    public void appButtonClickListener(View v){
        Button clickedButton = (Button) v;

        String appName = clickedButton.getText().toString();

        Toast.makeText(this, "Will launch app named "+appName, Toast.LENGTH_LONG).show();

    }
}

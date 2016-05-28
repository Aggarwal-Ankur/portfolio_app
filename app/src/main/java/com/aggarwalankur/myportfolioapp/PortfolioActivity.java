package com.aggarwalankur.myportfolioapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Ankur on 28May, 2016
 *
 * This is the main activity for the project 0 of Android nanodegree
 */
public class PortfolioActivity extends AppCompatActivity {

    private static final String TAG = AppCompatActivity.class.getSimpleName();

    /*Toast to be used in the app*/
    private Toast myToast = null;

    /**
     * This is the entry point for this activity
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i(TAG, "onCreate()");

        setContentView(R.layout.activity_portfolio);
    }


    /**
     * onClickListener for all the buttons in the app
     * @param v
     */
    public void appButtonClickListener(View v){
        Log.i(TAG, "Button clicked");

        Button clickedButton = (Button) v;

        String appName = clickedButton.getText().toString();

        if(myToast != null){
            myToast.cancel();
        }

        myToast = Toast.makeText(this, "Will launch app named "+appName, Toast.LENGTH_LONG);

        myToast.show();

    }
}

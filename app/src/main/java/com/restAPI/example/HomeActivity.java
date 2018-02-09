package com.restAPI.example;

/**
 * Created by Avinash on 25-01-2018.
 */

import android.app.Activity;
import android.os.Bundle;
/**
 *
 * Home Screen Activity
 */
public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Displays Home Screen
        setContentView(R.layout.home);
    }

}
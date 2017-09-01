package com.example.cdzhangruize.test0901;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    static boolean mIsLight = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("isLight " + mIsLight);
        setTheme(mIsLight ? R.style.AppThemeDark : R.style.AppThemeLight);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        mIsLight = !mIsLight;
        recreate();
    }
}

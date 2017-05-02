package com.example.shraaboni.loginsignupnew;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Fragment fragment = new MainPage();
        FragmentManager fm1 = getSupportFragmentManager();
        FragmentTransaction ft1=fm1.beginTransaction();
        ft1.add(R.id.mainpage,fragment);
        ft1.addToBackStack(null);
        ft1.commit();*/
    }


    public void ChangeState(View view) {
        Fragment fragment = null;

        switch (view.getId()){

            case R.id.b2:
                fragment= new Login();
                break;
            case R.id.b1:
                fragment= new Signup();
                break;
        }

        FragmentManager fm1 = getSupportFragmentManager();
        FragmentTransaction ft1=fm1.beginTransaction();
        ft1.add(R.id.mainpage,fragment);
        ft1.addToBackStack(null);
        ft1.commit();

    }
}

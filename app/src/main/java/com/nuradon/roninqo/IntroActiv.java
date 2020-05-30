package com.nuradon.roninqo;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.nuradon.roninqo.util.OnSwipeTouchListener;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class IntroActiv extends AppCompatActivity {

    private OnSwipeTouchListener swipeTouchListener = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        setContentView(R.layout.activity_intro);

        swipeTouchListener = new OnSwipeTouchListener(this);

        ConstraintLayout relativeLayout = (ConstraintLayout) findViewById(R.id.container_constraint);

        relativeLayout.setOnTouchListener(new OnSwipeTouchListener(IntroActiv.this) {
            public void onSwipeTop() {
                // Toast.makeText(IntroActiv.this, "top", Toast.LENGTH_SHORT).show();
            }

            public void onSwipeRight() {
                // Toast.makeText(IntroActiv.this, "right", Toast.LENGTH_SHORT).show();
            }

            public void onSwipeLeft() {
                Intent Intro = new Intent(getApplicationContext(),MainActivity.class);
                startActivityForResult(Intro,1);
                //  Toast.makeText(IntroActiv.this, "left", Toast.LENGTH_SHORT).show();
            }

            public void onSwipeBottom() {
                //  Toast.makeText(IntroActiv.this, "bottom", Toast.LENGTH_SHORT).show();
            }

        });
    }

}


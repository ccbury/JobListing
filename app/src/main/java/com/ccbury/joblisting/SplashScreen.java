package com.ccbury.joblisting;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

import androidx.appcompat.app.AppCompatActivity;



public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Animation fadeInAnimationObject = new AlphaAnimation(0.1f, 1.00f); //From fully transparent to no transparency
        fadeInAnimationObject.setDuration(2000); // 2 seconds
        fadeInAnimationObject.setAnimationListener(new Animation.AnimationListener() {
            public void onAnimationStart(Animation animation) {
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationEnd(Animation animation) {
                startActivity(new Intent(SplashScreen.this, MainActivity.class));
                finish();
            }
        });

        findViewById(R.id.laptop_icon).startAnimation(fadeInAnimationObject);
        findViewById(R.id.title1).startAnimation(fadeInAnimationObject);
        findViewById(R.id.title2).startAnimation(fadeInAnimationObject);
    }

}

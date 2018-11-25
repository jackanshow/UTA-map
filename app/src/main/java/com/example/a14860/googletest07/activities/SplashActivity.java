package com.example.a14860.googletest07.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;

import com.example.a14860.googletest07.MainActivity;
import com.example.a14860.googletest07.R;
import com.example.a14860.googletest07.activities.login.LoginActivity;
import com.example.a14860.googletest07.utils.SPUtils;

import butterknife.BindView;
import butterknife.ButterKnife;


public class SplashActivity extends AppCompatActivity {

    //动画持续时间,单位ms
    private static final int AnimTime = 2000;

    @BindView(R.id.iv)
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);
        startAnimAndGoToMain();
    }

    //开启动画，动画结束跳转到主界面
    private void startAnimAndGoToMain() {
        ScaleAnimation scaleAnimation =
                new ScaleAnimation(1,2,1,2,
                        Animation.RELATIVE_TO_SELF,0.5f,
                        Animation.RELATIVE_TO_SELF,0.5f);
        scaleAnimation.setDuration(AnimTime);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                goToMainActivity();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        iv.startAnimation(scaleAnimation);
    }

    private void goToMainActivity() {
        finish();
        boolean already_logged = (boolean) SPUtils.get(this, SPUtils.AlreadyLogged, false);
        Intent intent;
        if(already_logged) {
            intent = new Intent(SplashActivity.this, MainActivity.class);
        } else {
            intent = new Intent(SplashActivity.this, LoginActivity.class);
        }
        startActivity(intent);
    }

}

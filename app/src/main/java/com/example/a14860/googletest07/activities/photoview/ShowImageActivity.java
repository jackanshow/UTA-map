package com.example.a14860.googletest07.activities.photoview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.a14860.googletest07.R;
import com.github.chrisbanes.photoview.PhotoView;

import butterknife.BindView;
import butterknife.ButterKnife;


public class ShowImageActivity extends AppCompatActivity {

    public static String ImagePath = "image_path";
    public static String carImagePath = "school_car.png";
    public static String mapImagePath = "school_map.png";

    @BindView(R.id.iv)
    PhotoView photoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showimage);
        ButterKnife.bind(this);
    }

}

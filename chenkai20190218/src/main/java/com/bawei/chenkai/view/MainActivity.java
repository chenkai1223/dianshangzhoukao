package com.bawei.chenkai.view;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.bawei.chenkai.R;
import com.bawei.chenkai.view.IMainActivity;
import com.nostra13.universalimageloader.core.ImageLoader;

public class MainActivity extends AppCompatActivity implements IMainActivity {

    private TextView name;
    private View img;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        img = this.<View>findViewById(R.id.img);



    }

    @Override
    public void Imainactivity() {

    }
}

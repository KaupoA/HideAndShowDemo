package com.kast.hideandshowdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView showHideText;

    public void showClick (View view) {

        showHideText.setVisibility(View.VISIBLE);

    }

    public void hideClick (View view) {

        showHideText.setVisibility(View.INVISIBLE);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showHideText = (TextView)findViewById(R.id.showHideText);

    }
}

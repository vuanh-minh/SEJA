package com.example.jrmyyang.seja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import hugo.weaving.DebugLog;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.TP1) Button buttonTP1; //Bouton TP1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @OnClick(R.id.TP1)
    @DebugLog public void submit() {
        Toast.makeText(MainActivity.this,
                "Launch TP1", Toast.LENGTH_SHORT).show();
        Intent intentTP1 = new Intent(MainActivity.this, TP1.class);
        startActivity(intentTP1);
    }
}

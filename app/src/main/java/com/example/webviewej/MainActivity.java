package com.example.webviewej;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.txtURL);
    }

    public void switchActivities() {
        Intent switchAct =new Intent(this, MainActivity2.class);
        switchAct.putExtra("url",tv1.getText().toString());
        startActivity(switchAct);
    }

    public void switchActivity(View view) {
        switchActivities();
    }
}
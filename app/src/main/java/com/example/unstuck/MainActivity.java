package com.example.unstuck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button appsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        appsButton = (Button) findViewById(R.id.appsButton);
        appsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openAppsActivity();
            }

        });
    }
    public void openAppsActivity(){
        Intent intent = new Intent(this, AppsActivity.class);
        startActivity(intent);
    }
}
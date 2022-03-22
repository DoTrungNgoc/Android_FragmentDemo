package com.example.fragmentdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnMain;
    private TextView txtMain;
    private FragmentA fragmentA;
    private FragmentB fragmentB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMain = findViewById(R.id.buttonMain);
        txtMain = findViewById(R.id.textViewMain);

        FragmentManager fragmentManager = getSupportFragmentManager();

        fragmentA = (FragmentA) fragmentManager.findFragmentById(R.id.fragmentA);
        fragmentB = (FragmentB) fragmentManager.findFragmentById(R.id.fragmentB);

        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentA.changeText("Change by Main");
            }
        });
    }
}
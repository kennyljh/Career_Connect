package com.example.careerconnect.LoginSignupElements;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.careerconnect.R;

public class CareerClusterSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career_cluster_selection);

        Button infoButton = findViewById(R.id.career_cluster_info_btn);

        infoButton.setOnClickListener(v -> {

            CareerClusterInfoDialogFragment dialog = new CareerClusterInfoDialogFragment();
            dialog.show(getSupportFragmentManager(), "Information");
        });
    }
}

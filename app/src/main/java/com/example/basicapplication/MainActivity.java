package com.example.basicapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void edit_option (View view){
        Toast.makeText(this, "Editing..", Toast.LENGTH_SHORT).show();
    }

    public void save_option (View view){
        Toast.makeText(this, "Saving..", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
package com.example.appmenu.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appmenu.R;

public class modifyTypeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modify_type);
    }
    public void modifyType(View view){
        Intent intent = new Intent(this, DisplayTypes.class);

        startActivity(intent);
    }
    public void cancel(View view){
        Intent intent = new Intent(this, DisplayTypes.class);

        startActivity(intent);
    }

}

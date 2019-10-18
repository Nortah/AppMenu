package com.example.appmenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class modifyTypeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modify_type);
    }
    public void addType(View view){
        Activity parentClass = this.getParent();
        Intent intent = new Intent(this, DisplayTypes.class);

        startActivity(intent);
    }
    public void cancel(View view){
        Intent intent = new Intent(this, DisplayTypes.class);

        startActivity(intent);
    }

}

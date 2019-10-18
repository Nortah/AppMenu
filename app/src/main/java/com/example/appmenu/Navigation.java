package com.example.appmenu;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class Navigation extends AppCompatActivity
{
    public void goToAddTypeActivity(){
        Intent intent = new Intent(this, addTypeActivity.class);
        startActivity(intent);
    }

    public void goToModifyTypeActivity(){
        Intent intent = new Intent(this, modifyTypeActivity.class);
        startActivity(intent);
    }
}

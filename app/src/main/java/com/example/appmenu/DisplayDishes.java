package com.example.appmenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

public class DisplayDishes extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_dishes);

        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "Menu").build();


    }

    public void goToAddDishes(View view){
        Intent intent = new Intent(this, addDishActivity.class);
        startActivity(intent);
    }
}

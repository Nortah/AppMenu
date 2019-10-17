package com.example.appmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class DisplayTypes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_types);
    }

    public void goToDisplayDishes(View view){
        Intent intent = new Intent(this, DisplayDishes.class);
        startActivity(intent);
    }

    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.actionbar, menu);
        return  super.onCreateOptionsMenu(menu);
    }
}

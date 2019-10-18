package com.example.appmenu;

import android.content.Intent;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appmenu.ui.addDishActivity;

public class Menu  extends AppCompatActivity
{
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                // User chose the "Settings" item, show the app settings UI...
                return true;

            case R.id.action_add_dish:
                Intent intent = new Intent(this, addDishActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_add_type:
                // User chose the "Settings" item, show the app settings UI...
                return true;

            case R.id.action_modify_dish:
                // User chose the "Favorite" action, mark the current item
                // as a favorite...
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }
}

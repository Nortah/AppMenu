package com.example.appmenu.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appmenu.Navigation;
import com.example.appmenu.R;

public class DisplayTypes extends AppCompatActivity
{
    Navigation nav = new Navigation();
    ListView mListView;



    int[] images = {

            R.drawable.burgers,
            R.drawable.coffees,
            R.drawable.pizzas,
            R.drawable.salads,
            R.drawable.pastas
    };

    String[] Names = {

            "Burgers",
            "Coffees",
            "Pizzas",
            "Salads",
            "Pastas",

    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_types);

        mListView = findViewById(R.id.Listview);

        CustomAdaptor customAdaptor= new CustomAdaptor();
        mListView.setAdapter(customAdaptor);
    }

    class CustomAdaptor extends BaseAdapter{

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            view = getLayoutInflater().inflate(R.layout.customlayout, null);

            ImageView mImageView = view.findViewById(R.id.imageView);
            TextView mTextView = view.findViewById(R.id.textView);

            mImageView.setImageResource(images[i]);
            mTextView.setText(Names[i]);

            return view;
        }
    }
//navigation methods

    public void goToAddTypeActivity(){
        Intent intent = new Intent(this, addTypeActivity.class);
        startActivity(intent);
    }
    public void goToModifyTypeActivity(){
        Intent intent = new Intent(this, modifyTypeActivity.class);
        startActivity(intent);
    }


    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.actionbar, menu);
        return  super.onCreateOptionsMenu(menu);
    }
    //set menu options
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                // User chose the "Settings" item, show the app settings UI...
                return true;

            case R.id.action_add_type:
                goToAddTypeActivity();
                    return true;

            case R.id.action_modify_type:
                goToModifyTypeActivity();
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }
}

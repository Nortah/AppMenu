package com.example.appmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class DisplayTypes extends AppCompatActivity {

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

    public void goToDisplayDishes(View view){
        Intent intent = new Intent(this, DisplayDishes.class);
        startActivity(intent);
    }

    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.actionbar, menu);
        return  super.onCreateOptionsMenu(menu);
    }
}

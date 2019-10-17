package com.example.appmenu;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class addDishActivity extends AppCompatActivity {
    ImageView importedImage;
    Bitmap bitmap;
    View view;
    ByteArrayOutputStream bytearrayoutputstream;
    File file;
    FileOutputStream fileoutputstream;
    private static final int RESULT_LOAD_IMAGE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_dish);

        importedImage = (ImageView) findViewById(R.id.dishImage);

    }
    //open the gallery
    public void importImage(View view)
    {
        Intent galleryIntent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(galleryIntent, RESULT_LOAD_IMAGE);
        System.out.println("I'm in import Image");
    }
    //Select the Image
    public void onImportResult(int requestCode, int resultCode, Intent data)
    {
        ImageView image = findViewById(R.id.dishImage);
        Uri selectedImage = null;
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == RESULT_LOAD_IMAGE && resultCode == RESULT_OK && data == null)
        {
            selectedImage = data.getData();
            importedImage.setImageURI(selectedImage);
        }
        System.out.println("I'm in on import Image");
    }
    //Add a dish in the database and brings you back to the data base
    public void addDish(View view){
        //return to previous page once you add the dish
        Intent intent = new Intent(this, DisplayDishes.class);
      /*  //build the database
        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "Menu").build();

        Dish dish = new Dish();
        EditText dishName = (EditText) findViewById(R.id.dish_name);
        EditText dishDescription = (EditText) findViewById(R.id.dish_description);
        byte[] dishImage = conv.convertImageToByte(importedView);
        dish.setDishName(dishName.getText().toString());
        dish.setDishDescription(dishDescription.getText().toString());
        dish.setDishImage(dishImage);

        AppDatabase.AddDish(db, dish );
*/


        startActivity(intent);
    }
    //Cancel button call the intent brings you back to the direct parent (used for every "cancel" button
    public void cancel(View view){
        Activity parentClass = this.getParent();
        Intent intent = new Intent(this, DisplayDishes.class);

        startActivity(intent);
    }
}

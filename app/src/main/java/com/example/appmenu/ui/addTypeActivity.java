package com.example.appmenu.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appmenu.R;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class addTypeActivity extends AppCompatActivity {
    private static final int RESULT_LOAD_IMAGE = 1;
    ImageView importedImage;
    Bitmap bitmap;
    View view;
    ByteArrayOutputStream bytearrayoutputstream;
    File file;
    FileOutputStream fileoutputstream;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_type);

        importedImage = (ImageView) findViewById(R.id.typeImage);
        bytearrayoutputstream = new ByteArrayOutputStream();
        TextView importImageText = (TextView)findViewById(R.id.ImportImageText) ;


        importImageText.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                // TODO Auto-generated method stub


                Drawable drawable = getResources().getDrawable(R.drawable.add_image);

                Bitmap bitmap = ((BitmapDrawable)drawable).getBitmap();

                bitmap.compress(Bitmap.CompressFormat.PNG, 60, bytearrayoutputstream);

                file = new File( Environment.getExternalStorageDirectory() + "/SampleImage.png");

                try

                {
                    file.createNewFile();

                    fileoutputstream = new FileOutputStream(file);

                    fileoutputstream.write(bytearrayoutputstream.toByteArray());

                    fileoutputstream.close();

                }

                catch (Exception e)

                {

                    e.printStackTrace();

                }
                Toast.makeText(addTypeActivity.this, "Image Saved Successfully", Toast.LENGTH_LONG).show();

            }
        });

    }
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
    public void addType(View view){
        Intent intent = new Intent(this, DisplayTypes.class);

        startActivity(intent);
    }
    public void cancel(View view){
        Intent intent = new Intent(this, DisplayTypes.class);

        startActivity(intent);
    }

}


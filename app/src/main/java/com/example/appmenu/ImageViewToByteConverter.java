package com.example.appmenu;

import android.graphics.Bitmap;
import android.widget.ImageView;

import java.io.ByteArrayOutputStream;

public class ImageViewToByteConverter
{
    public byte[] convertImageToByte(ImageView image)
    {
        image.setDrawingCacheEnabled(true);

        image.buildDrawingCache();

        Bitmap bm = image.getDrawingCache();

        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bm.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();

        return byteArray;
    }
}

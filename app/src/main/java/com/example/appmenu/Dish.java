package com.example.appmenu;

import android.media.Image;
import android.widget.ImageView;

import androidx.room.*;

import static androidx.room.ForeignKey.CASCADE;
@Entity(foreignKeys = @ForeignKey(entity = Type.class, parentColumns = "typeId",
        childColumns = "dish_type", onDelete = CASCADE))
public class Dish {
    @PrimaryKey
    private int dishId;

    @ColumnInfo(name = "dish_name")
    private String dishName;

    @ColumnInfo(name = "dish_description")
    private String dishDescription;

    @ColumnInfo(name = "dish_image")
    public byte[] dishImage;



    @ColumnInfo(name = "dish_type")
    public int dishType;


    public int getDishId() {
        return dishId;
    }

    public void setDishId(int uid) {
        this.dishId = dishId;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getDishDescription() {
        return dishDescription;
    }

    public void setDishDescription(String dishDescription) { this.dishDescription = dishDescription; }

    public byte[] getDishImage() {
        return dishImage;
    }

    public void setDishImage(byte[] dishImage) {
        this.dishImage = dishImage;
    }

    public int getDishType() {
        return dishType;
    }

    public void setDishType(int dishType) {
        this.dishType = dishType;
    }
}

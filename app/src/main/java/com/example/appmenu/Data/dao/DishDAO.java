package com.example.appmenu.Data.dao;

import android.database.sqlite.SQLiteConstraintException;

import androidx.room.*;

import com.example.appmenu.Data.entity.Dish;

import java.util.List;
@Dao
public interface DishDAO
{
    @Query("SELECT * FROM Dish  ")
    public List<Dish> getAll() ;

    @Query("SELECT * FROM Dish WHERE dishId In (:dishIds) ")
    public List<Dish> loadAllByIds(int[] dishIds) ;


    @Insert
    public void insertAll (Dish...dishes);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertDish(Dish dish ) throws SQLiteConstraintException;

    @Delete
    public void update (Dish dish);

    @Delete
    public void delete (Dish dish);

    @Query("DELETE FROM Dish")
    void deleteAll();
}

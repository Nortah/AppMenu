package com.example.appmenu;

import androidx.room.*;

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
    public void insertDish(Dish dish );


    @Delete
    public void delete (Dish dish);
}

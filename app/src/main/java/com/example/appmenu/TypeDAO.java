package com.example.appmenu;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface TypeDAO
{
    @Query("SELECT * FROM Type  ")
    public List<Type> getAll() ;

    @Query("SELECT * FROM Type WHERE TypeId In (:typeIds) ")
    public List<Type> loadAllByIds(int[] typeIds) ;


    @Insert
    public void insertAll(Type... types);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertType(Type type);


    @Delete
    public void delete(Type type);
}

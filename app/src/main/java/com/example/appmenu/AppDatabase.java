package com.example.appmenu;

import android.provider.BaseColumns;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import java.util.Iterator;
import java.util.List;

@Database(entities = {Dish.class, Type.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase
{
    public abstract DishDAO dishDAO();
    public abstract TypeDAO typeDAO();

    public static Dish AddDish(final AppDatabase db, Dish dish) {
        db.dishDAO().insertDish(dish);
        return dish;
    }
    public static void displayAll(final AppDatabase db) {
        List<Dish> dishes = db.dishDAO().getAll();
        if (dishes == null)
            System.out.println("dishes is null");
        else {
            for (Dish dish : dishes) {
                System.out.println(dish.getDishName());
            }
        }
    }
        //types

        public static Type AddType(final AppDatabase db, Type type) {
            db.typeDAO().insertType(type);
            return type;
        }
        public static void displayAllTypes(final AppDatabase db) {
            List<Type> types = db.typeDAO().getAll();
            if(types == null)
                System.out.println("dishes is null");
            else {for (Type type:types)
            {
                System.out.println(type.getTypeName());
            }
        }
    }
}

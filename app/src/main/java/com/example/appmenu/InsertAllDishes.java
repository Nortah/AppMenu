package com.example.appmenu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class InsertAllDishes
{
    private static Dish addUser(final AppDatabase db, Dish dish) {
        db.dishDAO().insertAll(dish);
        return dish;
    }

    public static void populateWithTestData(AppDatabase db) {
        ArrayList<Dish> dishes = new ArrayList<Dish>();

        Dish dish = new Dish();
        dish.setDishId(0);
        dish.setDishName("Pizza Margarita");
        dish.setDishDescription("a fresh pizza");
        dish.setDishType(0);
        addUser(db, dish);

        dish.setDishId(1);
        dish.setDishName("Pizza Proscuito");
        dish.setDishDescription("A fresh pizza with ham");
        dish.setDishType(0);
        addUser(db, dish);

        dish.setDishId(2);
        dish.setDishName("Beef burger");
        dish.setDishDescription("a burger with beef");
        dish.setDishType(1);
        addUser(db, dish);

        dish.setDishId(2);
        dish.setDishName("Cheese Burger");
        dish.setDishType(1);
        addUser(db, dish);
    }
}

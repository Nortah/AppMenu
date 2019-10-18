package com.example.appmenu;

import com.example.appmenu.Data.AppDatabase;
import com.example.appmenu.Data.entity.Type;

public class InsertAllTypes
{


    public static void populateWithTestData(AppDatabase db) {

        Type type = new Type();
        type.setTypeId(0);
        type.setTypeName("Pizza");
        AppDatabase.AddType(db, type);

        type.setTypeId(1);
        type.setTypeName("Burger");
        AppDatabase.AddType(db, type);

    }
}

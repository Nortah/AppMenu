package com.example.appmenu;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Type
{
    @PrimaryKey
    private int typeId;

    @ColumnInfo(name = "type_name")
    private String typeName;

    @ColumnInfo(name = "type_image")
    public byte[] typeImage;

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public byte[] getTypeImage() {
        return typeImage;
    }

    public void setTypeImage(byte[] dishImage) {
        this.typeImage = dishImage;
    }
}

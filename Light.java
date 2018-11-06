package com.example.dwede.myapplication.data;

import android.media.Image;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "LightTable")
public class Light {
    @PrimaryKey
    @ColumnInfo(name = "LightSkuColumn")
    private String lightSku;

    @ColumnInfo(name = "LightManufactureColumn")
    private String lightMan;

    @ColumnInfo(name = "LightModelColumn")
    private String lightModel;

    @ColumnInfo(name = "LightColorColumn")
    private String lightColor;

    @ColumnInfo(name = "LightImageColumn")
    private Image lightImage;

    @ColumnInfo(name = "LightNameColumn")
    private String lightName;

    @ColumnInfo(name = "LightCostPerColumn")
    private double lightCostPer;

    @ColumnInfo(name = "LightManHoursPerColumn")
    private double lightManHrsPer;
}

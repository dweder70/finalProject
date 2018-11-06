package com.example.dwede.myapplication.data;

import android.media.Image;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "drywallTable")
public class Drywall {
    @PrimaryKey
    @ColumnInfo(name = "DrywallSkuColumn")
    private String drywallSku;

    @ColumnInfo(name = "DrywallManufactureColumn")
    private String drywallMan;

    @ColumnInfo(name = "SkinModelColumn")
    private String drywallModel;

    @ColumnInfo(name = "DrywallColorColumn")
    private String drywallColor;

    @ColumnInfo(name = "DrywallImageColumn")
    private Image drywallImage;

    @ColumnInfo(name = "DrywallNameColumn")
    private String drywallName;

    @ColumnInfo(name = "DrywallCostPerColumn")
    private double drywallCostPer;

    @ColumnInfo(name = "DrywallManHoursPerColumn")
    private double drywallManHrsPer;

}

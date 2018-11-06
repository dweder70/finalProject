package com.example.dwede.myapplication.data;

import android.media.Image;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "TubTable")
public class Tub {

    @PrimaryKey
    @ColumnInfo(name = "TubSkuColumn")
    private String tubSku;

    @ColumnInfo(name = "TubManufactureColumn")
    private String tubMan;

    @ColumnInfo(name = "TubModelColumn")
    private String tubModel;

    @ColumnInfo(name = "TubColorColumn")
    private String tubColor;

    @ColumnInfo(name = "Tub mageColumn")
    private Image tubImage;

    @ColumnInfo(name = "TubNameColumn")
    private String tubName;

    @ColumnInfo(name = "TubCostPerColumn")
    private double tubCostPer;

    @ColumnInfo(name = "TubManHoursPerColumn")
    private double tubManHrsPer;
}

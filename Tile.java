package com.example.dwede.myapplication.data;

import android.media.Image;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "TileTable")
public class Tile {

    @ColumnInfo(name = "TileSkuColumn")
    @PrimaryKey
    private String tileSku;

    @ColumnInfo(name = "TileManufactureColumn")
    private String tileMan;

    @ColumnInfo(name = "TileModelColumn")
    private String tileModel;

    @ColumnInfo(name = "TileColorColumn")
    private String tileColor;

    @ColumnInfo(name = "TileImageColumn")
    private Image tileImage;

    @ColumnInfo(name = "TilePricePerBoxColumn")
    private double tilePricePerBox;

    @ColumnInfo(name = "TileManHoursPerBoxColumn")
    private double tileManHrsPerBox;



}

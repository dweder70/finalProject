package com.example.dwede.myapplication.data;

import android.media.Image;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "SinkTable")
public class Sink {

    @PrimaryKey
    @ColumnInfo(name = "SinkSkuColumn")
    private String sinkSku;

    @ColumnInfo(name = "SinkManufactureColumn")
    private String sinkMan;

    @ColumnInfo(name = "SkinModelColumn")
    private String sinkModel;

    @ColumnInfo(name = "SinkColorColumn")
    private String sinkColor;

    @ColumnInfo(name = "SinkImageColumn")
    private Image sinkImage;

    @ColumnInfo(name = "SinkNameColumn")
    private String sinkName;

    @ColumnInfo(name = "SinkCostPerColumn")
    private double sinkCostPer;

    @ColumnInfo(name = "SinkManHoursPerColumn")
    private double sinkManHrsPer;


}

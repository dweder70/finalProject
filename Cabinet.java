package com.example.dwede.myapplication.data;

import android.media.Image;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "CabinetTable")
public class Cabinet {
    
    @PrimaryKey
    @ColumnInfo(name = "CabinetSkuColumn")
    private String cabinetSku;

    @ColumnInfo(name = "CabinetManufactureColumn")
    private String cabinetMan;

    @ColumnInfo(name = "CabinetModelColumn")
    private String cabinetModel;

    @ColumnInfo(name = "CabinetColorColumn")
    private String cabinetColor;

    @ColumnInfo(name = "CabinetImageColumn")
    private Image cabinetImage;

    @ColumnInfo(name = "CabinetNameColumn")
    private String cabinetName;

    @ColumnInfo(name = "CabinetCostPerColumn")
    private double cabinetCostPer;

    @ColumnInfo(name = "CabinetManHoursPerColumn")
    private double cabinetManHrsPer;
}

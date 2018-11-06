package com.example.dwede.myapplication.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "LightItemsSelected")
public class LightItemsSelected {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "LightSelectedIDColumn")
    private int lightItemID;

    @ForeignKey(entity = Light.class, parentColumns = "LightSkuColumn", childColumns = "lightSku")
    @ColumnInfo(name = "LightSelectedSkuColumn")
    private String lightSelectedSku;

    @ColumnInfo(name = "LightSelectedQuantityColumn")
    private int lightSelectedQty;
    @ColumnInfo(name = "LightSelectedManHoursColumn")
    private double selectedManHrs;
    @ColumnInfo(name = "LightSelectedCostColumn")
    private double lightSelectedCost;
}

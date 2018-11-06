package com.example.dwede.myapplication.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "CabinetItemsForJob")
public class CabinetItemsSelected {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "CabinetSelectedIDColumn")
    private int cabinetItemID;

    @ForeignKey(entity = Cabinet.class, parentColumns = "CabinetSkuColumn", childColumns = "cabinetSkuColumn")
    @ColumnInfo(name = "CabinetSelectedSkuColumn")
    private String cabinetSelectedSku;

    @ColumnInfo(name = "CabinetSelectedQuantityColumn")
    private int cabinteSelectedQty;
    @ColumnInfo(name = "CabinetSelectedManHoursColumn")
    private double cabinetSelectedManHrs;
    @ColumnInfo(name = "CabinetSelectedCostColumn")
    private double cabinetSelectedCost;
}

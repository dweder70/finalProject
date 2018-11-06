package com.example.dwede.myapplication.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "drywallTable")
public class DrywallItemsSelected {
    
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "DrywallSelectedIDColumn")
    private int drywallItemID;

    @ForeignKey(entity = Drywall.class, parentColumns = "DrywallSkuColumn", childColumns = "drywallSku")
    @ColumnInfo(name = "DrywallSelectedSkuColumn")
    private String drywallSelectedSku;

    @ColumnInfo(name = "DrywallSelectedQuantityColumn")
    private int drywallSelectedQty;
    @ColumnInfo(name = "DrywallSelectedManHoursColumn")
    private double drywallSelectedManHrs;
    @ColumnInfo(name = "DrywallSelectedCostColumn")
    private double drywallSelectedCost;
}

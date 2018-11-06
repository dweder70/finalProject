package com.example.dwede.myapplication.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "TubItemsForJob")
public class TubItemsSelected {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "TubSelectedIDColumn")
    private int tubItemID;

    @ForeignKey(entity = Tub.class, parentColumns = "TubSkuColumn", childColumns = "tubSku")
    @ColumnInfo(name = "TubSelectedSkuColumn")
    private String tubSelectedSku;

    @ColumnInfo(name = "TubSelectedQuantityColumn")
    private int tubSelectedQty;
    @ColumnInfo(name = "TubSelectedManHoursColumn")
    private double tubSelectedManHrs;
    @ColumnInfo(name = "Tub electedCostColumn")
    private double tubSelectedCost;
}

package com.example.dwede.myapplication.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "SinkItemsForJob")
public class SinkItemsSelected {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "SinkSelectedIDColumn")
    private int sinkItemID;

    @ForeignKey(entity = Sink.class, parentColumns = "SinkSkuColumn", childColumns = "sinkSkuColumn")
    @ColumnInfo(name = "SinkSelectedSkuColumn")
    private String sinkSelectedSku;

    @ColumnInfo(name = "SinkSelectedQuantityColumn")
    private int sinkSelectedQty;
    @ColumnInfo(name = "SinkSelectedManHoursColumn")
    private double sinkSelectedManHrs;
    @ColumnInfo(name = "SinkSelectedCostColumn")
    private double sinkSelectedCost;
}

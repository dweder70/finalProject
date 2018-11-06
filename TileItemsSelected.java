package com.example.dwede.myapplication.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "TileItemsForJob")
public class TileItemsSelected {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "TileSelectedIDColumn")
    private int tileItemID;

    @ForeignKey(entity = Tile.class, parentColumns = "TileSkuColumn", childColumns = "tileSku")
    @ColumnInfo(name = "TileSelectedSkuColumn")
    private String tileSelectedSku;

    @ColumnInfo(name = "TileSelectedQuantityColumn")
    private int selectedQty;
    @ColumnInfo(name = "TileSelectedManHoursColumn")
    private double tileSelectedManHrs;
    @ColumnInfo(name = "TileSelectedCostColumn")
    private double tileSelectedCost;
}

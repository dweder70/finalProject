package com.example.dwede.myapplication.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "JobTable")
public class Job {

    @PrimaryKey (autoGenerate = true)
    private int jobID;

    @ForeignKey(entity = Contacts.class, parentColumns = "ContactIDColumn", childColumns = "contactID")
    private String contactID;// foreign key from Contacts contact_id

    @ForeignKey(entity = Address.class, parentColumns = "AddressIDColumn", childColumns = "addressID")
    private String addressID;


    // Cabinet entity
    @ForeignKey(entity = CabinetItemsSelected.class, parentColumns = "CabinetSelectedIDColumn", childColumns = "cabinetItemIDColumn")
    private int cabinetID; // foreign key from Cabinet
    @ColumnInfo(name = "CabinetQuantityColumn")
    private int cabinetQty;
    @ColumnInfo(name = "CabinetManHoursColumn")
    private double cabinetManHrs;  // cabinet_qty * Cabinet -> cabinet_man_hrs_per
    @ColumnInfo(name = "TotalCabinetCostColumn")
    private double cabinetCost; // cabinet_qty * cabinet_man_hrs * Csbinet -> cabinet_cost_per

    // Drywall entity
    @ForeignKey(entity = DrywallItemsSelected.class, parentColumns = "DrywallSelectedIDColumn", childColumns = "drywallItemIDColumn")
    private int drywallID; // foreign key from Drywall
    @ColumnInfo(name = "DrywallQuantityColumn")
    private int drywallQty;
    @ColumnInfo(name = "DrywallManHoursColumn")
    private double drywallManHrs;  // drywall_qty * Drywall -> drywall_man_hrs_per
    @ColumnInfo(name = "TotalDrywallCostColumn")
    private double drywallCost;  // drywall_qty * drywall_man_hrs * Drywall -> drywall_cost_per

    // Lights entity
    @ForeignKey(entity = LightItemsSelected.class, parentColumns = "LightSelectedIDColumn", childColumns = "lightItemIDColumn")
    private int lightID; // foreign key from Lights
    @ColumnInfo(name = "LightQuantityColumn")
    private int lightQty;
    @ColumnInfo(name = "LightManHoursColumn")
    private double lightManHrs;  // light_qty * Lights light_man_hrs
    @ColumnInfo(name = "TotalLightCostColumn")
    private double lightCost;  // light_qty * light_man_hrs * Lights light_cost_per

    // Sink entity
    @ForeignKey(entity = SinkItemsSelected.class, parentColumns = "SinkSelectedIDColumn", childColumns = "sinkItemIDColumn")
    @ColumnInfo(name = "Sink ID")
    private int sinkID; // foreign key from Sink
    @ColumnInfo(name = "SinkQuantityColumn")
    private int sinkQty;
    @ColumnInfo(name = "SinkManHoursColumn")
    private double sinkManHrs;
    @ColumnInfo(name = "TotalSinkCostColumn")
    private double sinkCost;

    // Tile entity
    @ForeignKey(entity = TileItemsSelected.class, parentColumns = "TileSelectedIDColumn", childColumns = "tileItemIDColumn")
    @ColumnInfo(name = "Tile ID")
    private String tileSku; // foreign key from Tile
    @ColumnInfo(name = "TileQuantityColumn")
    private int tileQty;
    @ColumnInfo(name = "TileManHoursColumn")
    private double tileManHrs;
    @ColumnInfo(name = "TotalTileCostColumn")
    private double tileCost;

    // Tub entity
    @ForeignKey(entity = TubItemsSelected.class, parentColumns = "TubSelectedIDColumn", childColumns = "tubItemIDColumn")
    @ColumnInfo(name = "TubIDColumn")
    private int tubID; // foreign key from Tub
    @ColumnInfo(name = "TubQuantityColumn")
    private int tubQty;
    @ColumnInfo(name = "TubManHoursColumn")
    private double tubManHrs; // tub_qty * Tub -> tub_man_hrs_per
    @ColumnInfo(name = "TotalTubCostColumn")
    private double tubCost; // tub_qty * tub_man_hrs * Tub -> tub_per_cost


    // Job cost
    @ColumnInfo(name = "JobManHoursColumn")
    private double jobManHrs;  // tile_man_hrs + sink_man_hrs + tub_man_hrs + light_man_hrs
                                 // + drywall_man_hrs + cabinet_man_hrs
    @ColumnInfo(name = "JobCostColumn")
    private double jobCost;   // tile_cost + sink_cost + tub_cost + light_cost + drywall_cost

}

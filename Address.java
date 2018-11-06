package com.example.dwede.myapplication.data;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "addressTable")
public class Address {

    @PrimaryKey (autoGenerate = true)
    @ColumnInfo(name = "AddressIDColumn")
    private int addressID;

    @ColumnInfo(name = "StreetAddressColumn")
    private String street;

    @ColumnInfo(name = "CityColumn")
    private String city;

    @ColumnInfo(name = "StateColumn")
    private String state;

    @ColumnInfo(name = "ZipcodeColumn")
    private int zip;



    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
}

package com.example.dwede.myapplication.data;

import android.provider.ContactsContract;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "ContactsTable")
public class Contacts {

    
    @PrimaryKey (autoGenerate = true)
    @ColumnInfo(name = "ContactIDColumn")
    private int contactID;

    @ColumnInfo(name = "FirstNameColumn")
    private String firstName;

    @ColumnInfo(name = "LastNameColumn")
    private String lastName;

    @ColumnInfo(name = "PhoneNumberColumn")
    private ContactsContract.CommonDataKinds.Phone phoneNumber;


    public void setContactID(int contactID) {
        this.contactID = contactID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ContactsContract.CommonDataKinds.Phone getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(ContactsContract.CommonDataKinds.Phone phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

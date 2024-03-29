package com.example.database.DB

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Login")
data class LoginTableModel (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var Id: Int,

    @ColumnInfo(name = "username")
    var Username: String,

    @ColumnInfo(name = "password")
    var Password: String

) {



}
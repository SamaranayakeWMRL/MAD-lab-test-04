package com.example.room_db.Model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "events")
data class User (
    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val firstName : String,
    val lastName : String
)
package com.example.lab_week_10.database

import androidx.room.Database
import androidx.room.RoomDatabase

// Update version to 2 because we changed the schema
@Database(entities = [Total::class], version = 2, exportSchema = false)
abstract class TotalDatabase : RoomDatabase() {
    abstract fun totalDao(): TotalDao
}
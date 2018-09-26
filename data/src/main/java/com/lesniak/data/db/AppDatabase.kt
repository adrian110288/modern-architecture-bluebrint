package com.lesniak.data.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.lesniak.data.daos.AppEntityDao
import com.lesniak.data.entities.AppEntity

@Database(
    entities = [AppEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun entityDao(): AppEntityDao
}
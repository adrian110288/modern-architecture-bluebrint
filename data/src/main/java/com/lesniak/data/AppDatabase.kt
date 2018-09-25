package com.lesniak.data

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.lesniak.data.appentity.AppEntity
import com.lesniak.data.appentity.AppEntityDao

@Database(
    entities = [AppEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun entityDao(): AppEntityDao
}
package com.lesniak.data.db

import android.app.Application
import android.arch.persistence.room.Room
import dagger.Module
import dagger.Provides

@Module
class DatabaseModule {

    @Provides
    fun appDatabase(application: Application): AppDatabase =
        Room.databaseBuilder(application, AppDatabase::class.java, "app-database")
            .build()
}
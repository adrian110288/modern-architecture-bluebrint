package com.lesniak.data.di

import android.app.Application
import android.arch.persistence.room.Room
import com.lesniak.data.AppDatabase
import com.lesniak.network.BuildConfig
import com.lesniak.network.di.NetworkScope
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class DataModule(private val application: Application) {

    @Provides
    @NetworkScope
    @Named("databaseName")
    fun databaseName() = BuildConfig.DATABASE_NAME

    @Provides
    @DataScope
    fun appDatabase(@Named("databaseName") databaseName: String) =
        Room.databaseBuilder(application, AppDatabase::class.java, databaseName)
            .build()
}
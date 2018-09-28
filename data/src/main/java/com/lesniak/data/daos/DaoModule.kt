package com.lesniak.data.daos

import com.lesniak.data.db.AppDatabase
import com.lesniak.data.db.DatabaseModule
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [DatabaseModule::class])
class DaoModule {

    @Provides
    @Singleton
    fun appEntityDao(database: AppDatabase) =
        database.entityDao()

}
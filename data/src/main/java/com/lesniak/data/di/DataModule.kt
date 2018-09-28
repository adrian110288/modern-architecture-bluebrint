package com.lesniak.data.di

import com.lesniak.data.daos.DaoModule
import dagger.Module

@Module(includes = [DaoModule::class])
class DataModule
package com.lesniak.api

import com.lesniak.api.services.ServicesModule
import dagger.Module

@Module(includes = [ServicesModule::class])
class ApiModule
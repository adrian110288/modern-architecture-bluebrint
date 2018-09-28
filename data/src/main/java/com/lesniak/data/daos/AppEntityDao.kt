package com.lesniak.data.daos

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import com.lesniak.data.daos.base.BaseEntityDao
import com.lesniak.data.entities.AppEntity
import io.reactivex.Single

@Dao
interface AppEntityDao : BaseEntityDao<AppEntity> {

    @Query("SELECT * FROM ${AppEntity.TABLE_NAME}")
    fun getAll(): Single<List<AppEntity>>

    @Query("SELECT * FROM ${AppEntity.TABLE_NAME} WHERE uuid = :uuid")
    fun get(uuid: Long): Single<AppEntity>

}
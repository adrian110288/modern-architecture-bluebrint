package com.lesniak.data.appentity

import android.arch.persistence.room.*
import io.reactivex.Single

@Dao
interface AppEntityDao {

    @Query("SELECT * FROM ${AppEntity.TABLE_NAME}")
    fun getAllAppEntities(): Single<List<AppEntity>>

    @Query("SELECT * FROM ${AppEntity.TABLE_NAME} WHERE uuid = :uuid")
    fun getAppEntity(uuid: Long): Single<AppEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAppEntity(appEntity: AppEntity): Long

    @Delete
    fun deleteAppEntity(appEntity: AppEntity): Int

    @Query("DELETE FROM ${AppEntity.TABLE_NAME}")
    fun eraseTable()
}
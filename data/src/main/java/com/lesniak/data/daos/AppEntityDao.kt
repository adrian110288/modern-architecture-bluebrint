package com.lesniak.data.daos

import android.arch.persistence.room.*
import com.lesniak.data.entities.AppEntity
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
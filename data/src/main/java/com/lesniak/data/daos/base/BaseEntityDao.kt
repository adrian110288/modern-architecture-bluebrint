package com.lesniak.data.daos.base

import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy.REPLACE
import android.arch.persistence.room.Update
import com.lesniak.data.entities.base.BaseEntity

interface BaseEntityDao<in E : BaseEntity> {

    @Insert(onConflict = REPLACE)
    fun insert(entity: E): Long

    @Insert
    fun insertAll(vararg entity: E)

    @Insert
    fun insertAll(entities: List<E>)

    @Update
    fun update(entity: E)

    @Delete
    fun delete(entity: E): Int
}
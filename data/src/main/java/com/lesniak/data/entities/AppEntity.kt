package com.lesniak.data.entities

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.lesniak.data.entities.AppEntity.Companion.TABLE_NAME
import com.lesniak.data.entities.base.BaseEntity

@Entity(tableName = TABLE_NAME)
data class AppEntity(
    @PrimaryKey @ColumnInfo(name = UUID) override val uuid: Long,
    @ColumnInfo(name = NAME) val name: String
) : BaseEntity {

    companion object {
        const val TABLE_NAME = "app_entity"
        const val UUID = "uuid"
        const val NAME = "name"
    }
}
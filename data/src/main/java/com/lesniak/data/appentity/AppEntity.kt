package com.lesniak.data.appentity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.lesniak.data.appentity.AppEntity.Companion.TABLE_NAME

@Entity(tableName = TABLE_NAME)
data class AppEntity(
    @PrimaryKey @ColumnInfo(name = UUID) val uuid: Long,
    @ColumnInfo(name = NAME) val name: String
) {
    companion object {
        const val TABLE_NAME = "app_entity"
        const val UUID = "uuid"
        const val NAME = "name"
    }
}
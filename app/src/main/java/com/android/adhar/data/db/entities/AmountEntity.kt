package com.android.adhar.data.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class AmountEntity(
    @PrimaryKey(autoGenerate = false)
    var uid:Long?=null,
    var amount:Int?=null
)
{
    var id:Int = 0
}
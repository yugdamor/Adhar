package com.android.adhar.data.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TransactionEntity(
        var uid:Long?=null,
        var amount:Int?=null,
        var date:String?=null
)
{
   @PrimaryKey(autoGenerate = true)
   var id:Int = 0
}
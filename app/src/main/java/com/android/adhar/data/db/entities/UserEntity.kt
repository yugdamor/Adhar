package com.android.adhar.data.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class UserEntity(
    @PrimaryKey(autoGenerate = false)
    var uid:Long?=null,
    var name:String?=null,
    var gender:Char?=null,
    var address:String?=null,
    var dob:String?=null
){
    var id:Int =0
}
package com.android.adhar.data.repository

import com.android.adhar.data.db.AppDatabase
import com.android.adhar.data.db.entities.UserEntity
import androidx.lifecycle.LiveData
class UserRepository(private val db:AppDatabase)
{

fun getUser():LiveData<List<UserEntity>>
{
   return db.getDao().getAllUsersLiveData()
}


}
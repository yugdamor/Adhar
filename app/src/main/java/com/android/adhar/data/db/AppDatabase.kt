package com.android.adhar.data.db

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

abstract class AppDatabase():RoomDatabase()
{
    abstract fun getDao():Dao


    companion object
    {

        @Volatile
        private var instance:AppDatabase?=null
        private var LOCK = Any()

        operator fun invoke(context: Context):AppDatabase = instance?: synchronized(LOCK)
        {
            instance?:BuildDatabase(context).also {
                instance = it
            }
        }

        fun BuildDatabase(context: Context) =

             Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                "Mydatabase.db"
            ).build()

    }
}
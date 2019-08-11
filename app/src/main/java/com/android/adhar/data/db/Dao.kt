package com.android.adhar.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.android.adhar.data.db.entities.AmountEntity
import com.android.adhar.data.db.entities.TransactionEntity
import com.android.adhar.data.db.entities.UserEntity
import androidx.lifecycle.LiveData

@Dao
interface Dao
{
//...........................................................................................
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertIntoUser(user:UserEntity):Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertIntoAmount(amount:AmountEntity):Long

    @Insert
    suspend fun insertIntoTransaction(trans:TransactionEntity):Long

//...........................................................................................

    @Query("SELECT * FROM userentity")
    suspend fun getAllUsers():List<UserEntity>

    @Query("SELECT* FROM amountentity")
    suspend fun getAllAmounts():List<AmountEntity>

    @Query("SELECT * FROM transactionentity")
    suspend fun getAllTransactions():List<TransactionEntity>

//...........................................................................................

    @Query("SELECT * FROM userentity WHERE uid LIKE :uid ")
    suspend fun getUser(uid:Long):LiveData<UserEntity>

    @Query("SELECT * FROM amountentity WHERE uid LIKE :uid ")
    suspend fun getAmount(uid: Long):LiveData<AmountEntity>

    @Query("SELECT * FROM transactionentity WHERE uid LIKE :uid")
    suspend fun getTransactions(uid: Long):List<TransactionEntity>

//.............................................................................................

    @Query("SELECT * FROM userentity")
     fun getAllUsersLiveData():LiveData<List<UserEntity>>

}
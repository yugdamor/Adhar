package com.android.adhar.utils

import com.android.adhar.data.db.AppDatabase
import com.android.adhar.data.repository.UserRepository
import com.android.adhar.ui.home.user.UserViewModel
import com.android.adhar.ui.home.user.UserViewModelFactory
import org.koin.core.module.Module
import org.koin.dsl.module

val AppModule = module {
    single { AppDatabase(get()) }
    single { UserRepository(get()) }
    single { UserViewModel(get()) }
    single { UserViewModelFactory(get()) }

}

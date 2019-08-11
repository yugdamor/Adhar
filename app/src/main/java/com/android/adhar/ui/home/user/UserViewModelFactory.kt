package com.android.adhar.ui.home.user
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.android.adhar.data.repository.UserRepository

class UserViewModelFactory(private val userRepository: UserRepository):ViewModelProvider.NewInstanceFactory()
{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return UserViewModel(userRepository) as T
    }
}
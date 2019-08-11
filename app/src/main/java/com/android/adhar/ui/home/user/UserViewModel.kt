package com.android.adhar.ui.home.user

import androidx.lifecycle.ViewModel;
import com.android.adhar.data.repository.UserRepository

class UserViewModel(Repository: UserRepository) : ViewModel() {

    val user = Repository.getUser().value?.get(0)
}

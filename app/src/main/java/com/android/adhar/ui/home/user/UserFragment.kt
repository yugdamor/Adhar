package com.android.adhar.ui.home.user

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil

import com.android.adhar.R
import com.android.adhar.data.db.AppDatabase
import com.android.adhar.data.repository.UserRepository
import com.android.adhar.databinding.UserFragmentBinding
import org.koin.android.ext.android.inject

class UserFragment : Fragment() {


    val factory:UserViewModelFactory by inject<UserViewModelFactory>()

    private lateinit var viewModel: UserViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding:UserFragmentBinding = DataBindingUtil.inflate<UserFragmentBinding>(inflater,R.layout.user_fragment,container,false)
        viewModel = ViewModelProviders.of(this,factory).get(UserViewModel::class.java)
        binding.viewmodel = viewModel
        binding.lifecycleOwner = this
        return binding.root
    }



}

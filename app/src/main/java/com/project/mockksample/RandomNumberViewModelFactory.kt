package com.project.mockksample

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class RandomNumberViewModelFactory(private val repository: RandomNumberRepositoryImpl) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return RandomNumberViewModel(numberRepository = repository) as T
    }
}
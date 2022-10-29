package com.project.mockksample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RandomNumberViewModel(private val numberRepository: RandomNumberRepositoryImpl) : ViewModel() {
    private var _numberData = MutableLiveData<Int>()

    val numberData: MutableLiveData<Int>
        get() = _numberData

    init {
        _numberData.value = 0
    }

    fun shuffleNumber(randomNumberData: RandomNumberData) {
        _numberData.value = numberRepository.shuffleNumber(randomNumberData)
    }
}
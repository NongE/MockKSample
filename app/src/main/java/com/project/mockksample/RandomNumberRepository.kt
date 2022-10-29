package com.project.mockksample

class RandomNumberRepository : RandomNumberRepositoryImpl {

    override fun shuffleNumber(randomNumberData: RandomNumberData): Int {
        return (0..randomNumberData.data).random()
    }
}
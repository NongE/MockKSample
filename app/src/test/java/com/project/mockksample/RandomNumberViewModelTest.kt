package com.project.mockksample

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.Rule
import org.junit.Test

internal class RandomNumberViewModelTest {
    @Rule
    @JvmField
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @Test
    fun shuffleTest() {
        val sample = mockk<RandomNumberData>()
        val repository = mockk<RandomNumberRepositoryImpl>()
        val viewModel = RandomNumberViewModel(repository)

        //relaxed = true
        every { repository.shuffleNumber(sample) } returns 0

        viewModel.shuffleNumber(sample)

        verify { repository.shuffleNumber(sample) }
    }
}
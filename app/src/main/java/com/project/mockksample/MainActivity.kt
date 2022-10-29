package com.project.mockksample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.project.mockksample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val randomNumberViewModel: RandomNumberViewModel by lazy {
        ViewModelProvider(this, RandomNumberViewModelFactory(RandomNumberRepository())).get(RandomNumberViewModel::class.java)
    }

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.number.text = randomNumberViewModel.numberData.value.toString()
        binding.isBig.text = isBig(randomNumberViewModel.numberData.value!!).toString()

        binding.change.setOnClickListener {
            randomNumberViewModel.shuffleNumber(RandomNumberData(100))
        }

        randomNumberViewModel.numberData.observe(this, Observer {
            binding.number.text = it.toString()
            binding.isBig.text = isBig(it).toString()
        })
    }
}
package com.miu.backgroundcolorchanger

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.miu.backgroundcolorchanger.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn.setOnClickListener {
            binding.llMain.setBackgroundColor(Color.rgb(getRandom(), getRandom(), getRandom()));
        }

        binding.imgBtn.setOnClickListener{
            binding.imgBtn.setBackgroundColor(Color.rgb(getRandom(), getRandom(), getRandom()))
        }
    }

    fun getRandom() : Int {
        return (0..255).random()
    }
}
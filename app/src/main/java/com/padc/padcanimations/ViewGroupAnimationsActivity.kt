package com.padc.padcanimations

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.padc.padcanimations.databinding.ActivityViewGroupAnimationsBinding

class ViewGroupAnimationsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityViewGroupAnimationsBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewGroupAnimationsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnFirst.setOnClickListener {
            binding.btnFirst.toggleVisibility()
        }

        binding.btnSecond.setOnClickListener {
            binding.btnSecond.toggleVisibility()
        }

        binding.btnThird.setOnClickListener {
            binding.btnThird.toggleVisibility()
        }

        binding.btnReset.setOnClickListener {
            binding.btnFirst.show()
            binding.btnSecond.show()
            binding.btnThird.show()
        }

        binding.btnAddToCart.setBackgroundResource(R.drawable.animation_images)
        val animation = binding.btnAddToCart.background as AnimationDrawable
        binding.btnAddToCart.setOnClickListener {
            animation.start()
        }
    }
}
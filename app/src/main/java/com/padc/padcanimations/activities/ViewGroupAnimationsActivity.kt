package com.padc.padcanimations.activities

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.padc.padcanimations.R
import com.padc.padcanimations.databinding.ActivityViewGroupAnimationsBinding
import com.padc.padcanimations.extensions.show
import com.padc.padcanimations.extensions.toggleVisibility

class ViewGroupAnimationsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityViewGroupAnimationsBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewGroupAnimationsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // View Group Animations
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

        // Animated Drawables
        binding.btnAddToCart.setBackgroundResource(R.drawable.animation_images)
        val animation = binding.btnAddToCart.background as AnimationDrawable
        binding.btnAddToCart.setOnClickListener {
            animation.start()
        }
    }
}
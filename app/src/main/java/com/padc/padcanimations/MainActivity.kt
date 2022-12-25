package com.padc.padcanimations

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.padc.padcanimations.databinding.ActivityMainBinding
import kotlinx.coroutines.NonCancellable.start

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.btnText.setOnClickListener {
//            // Value Animator
//            ValueAnimator.ofFloat(0.0f, 500.0f).apply {
//                duration = 2000
//                addUpdateListener {
//                    binding.btnText.translationX = it.animatedValue as Float
//                    binding.btnText.translationY = it.animatedValue as Float
//                }
//                start()
//            }

            // Object Animator
            val translateAnimator = ObjectAnimator.ofFloat(binding.btnText, "translationX", 0.0f, 500.0f).apply {
                duration = 2000
            }

            val fadeAnimator = ObjectAnimator.ofFloat(binding.btnText, "alpha", 1.0f, 0.0f).apply{
                duration = 2000
            }

            // Animator Set
            AnimatorSet().apply {
                play(translateAnimator).with(fadeAnimator)
                start()
            }
        }
    }
}
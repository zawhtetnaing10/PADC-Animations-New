package com.padc.padcanimations

import android.animation.Animator
import android.animation.Animator.AnimatorListener
import android.animation.AnimatorListenerAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewAnimationUtils
import com.padc.padcanimations.databinding.ActivityViewAnimationsBinding
import com.padc.padcanimations.databinding.ActivityViewGroupAnimationsBinding
import kotlin.math.hypot

class ViewAnimationsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityViewAnimationsBinding

    val ANIMATION_DURATION = 2000L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewAnimationsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.tvText.hide()
    }

    override fun onStart() {
        super.onStart()

        createCrossFadeAnimation()
    }


    private fun createCrossFadeAnimation() {
        binding.tvText.apply {
            show()
            alpha = 0.0f

            animate()
                .alpha(1.0f)
                .setDuration(ANIMATION_DURATION)
                .setListener(null)
        }

        binding.progressIndicator.apply {
            animate()
                .alpha(0.0f)
                .setDuration(ANIMATION_DURATION)
                .addAnimationEndListener { binding.progressIndicator.hide() }
        }
    }
}
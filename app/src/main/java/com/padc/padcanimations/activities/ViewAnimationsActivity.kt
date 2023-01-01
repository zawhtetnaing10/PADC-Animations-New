package com.padc.padcanimations.activities

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewAnimationUtils
import com.padc.padcanimations.extensions.addAnimationEndListener
import com.padc.padcanimations.databinding.ActivityViewAnimationsBinding
import com.padc.padcanimations.extensions.hide
import com.padc.padcanimations.extensions.show
import kotlin.math.hypot

class ViewAnimationsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityViewAnimationsBinding

    val ANIMATION_DURATION = 2000L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewAnimationsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //binding.tvText.hide()
        binding.progressIndicator.hide()

        binding.btnCircularRevealAnimation.setOnClickListener {
            createCircularRevealAnimation()
        }
    }

    override fun onStart() {
        super.onStart()
        //createCrossFadeAnimation()
    }

    private fun createCircularRevealAnimation() {
        val cx = binding.tvText.width / 2
        val cy = binding.tvText.height / 2

        val initialRadius = hypot(cx.toDouble(), cy.toDouble()).toFloat()

        val anim = ViewAnimationUtils.createCircularReveal(
            binding.tvText,
            cx,
            cy,
            initialRadius,
            0f
        )

        anim.addListener(object : AnimatorListenerAdapter() {

            override fun onAnimationEnd(animation: Animator) {
                super.onAnimationEnd(animation)
                binding.tvText.hide()
            }
        })

        anim.start()
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
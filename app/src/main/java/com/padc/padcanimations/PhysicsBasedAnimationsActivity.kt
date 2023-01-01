package com.padc.padcanimations

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import androidx.dynamicanimation.animation.DynamicAnimation
import androidx.dynamicanimation.animation.SpringAnimation
import androidx.dynamicanimation.animation.SpringForce
import com.padc.padcanimations.databinding.ActivityMainBinding
import com.padc.padcanimations.databinding.ActivityPhysicsBasedAnimationsBinding

class PhysicsBasedAnimationsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPhysicsBasedAnimationsBinding

    var springForce: SpringForce? = null
    var horizontalPositionDifference: Float = 0.0f
    var verticalPositionDifference: Float = 0.0f

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPhysicsBasedAnimationsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set Up Spring Force
        springForce = SpringForce(0f).apply {
            stiffness = SpringForce.STIFFNESS_MEDIUM
            dampingRatio = SpringForce.DAMPING_RATIO_HIGH_BOUNCY
        }

        val springAnimationX = SpringAnimation(
            binding.ivBall,
            DynamicAnimation.TRANSLATION_X
        ).setSpring(springForce)

        val springAnimationY = SpringAnimation(
            binding.ivBall,
            DynamicAnimation.TRANSLATION_Y
        ).setSpring(springForce)

        // Set Up Touch Listener
        binding.ivBall.setOnTouchListener { view, motionEvent ->
            when (motionEvent.action) {
                MotionEvent.ACTION_DOWN -> {
                    horizontalPositionDifference = motionEvent.rawX - (view?.x ?: 0.0f)
                    verticalPositionDifference = motionEvent.rawY - (view?.y ?: 0.0f)

                    springAnimationX.cancel()
                    springAnimationY.cancel()
                }
                MotionEvent.ACTION_MOVE -> {
                    view.x = motionEvent.rawX - horizontalPositionDifference
                    view.y = motionEvent.rawY - verticalPositionDifference
                }
                MotionEvent.ACTION_UP -> {
                    springAnimationX.start()
                    springAnimationY.start()
                }
            }
            true
        }
    }
}
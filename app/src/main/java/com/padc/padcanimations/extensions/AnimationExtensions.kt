package com.padc.padcanimations.extensions

import android.animation.Animator
import android.animation.Animator.AnimatorListener
import android.view.ViewPropertyAnimator

fun ViewPropertyAnimator.addAnimationEndListener(onAnimationEnd: () -> Unit) {
    setListener(object : AnimatorListener {
        override fun onAnimationStart(p0: Animator?) {
            // Do Nothing
        }

        override fun onAnimationEnd(p0: Animator?) {
            onAnimationEnd.invoke()
        }

        override fun onAnimationCancel(p0: Animator?) {
            // Do Nothing
        }

        override fun onAnimationRepeat(p0: Animator?) {
            // Do Nothing
        }
    })
}
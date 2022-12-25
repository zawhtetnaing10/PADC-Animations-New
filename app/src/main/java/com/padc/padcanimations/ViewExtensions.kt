package com.padc.padcanimations

import android.view.View
import android.widget.Button
import com.google.android.material.button.MaterialButton

fun View.toggleVisibility() {
    if (this.isShownOnScreen())
        this.hide()
    else
        this.show()
}

fun View.hide() {
    visibility = View.GONE
}

fun View.show() {
    visibility = View.VISIBLE
}

fun View.isShownOnScreen(): Boolean {
    return visibility == View.VISIBLE
}
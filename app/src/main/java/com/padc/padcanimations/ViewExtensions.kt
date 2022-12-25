package com.padc.padcanimations

import android.view.View
import android.widget.Button
import com.google.android.material.button.MaterialButton

fun MaterialButton.toggleVisibility() {
    if (this.isShownOnScreen())
        this.hide()
    else
        this.show()
}

fun MaterialButton.hide() {
    visibility = View.GONE
}

fun MaterialButton.show() {
    visibility = View.VISIBLE
}

fun MaterialButton.isShownOnScreen(): Boolean {
    return visibility == View.VISIBLE
}
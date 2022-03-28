package com.softgames.iotec.utils

import com.google.android.material.textfield.TextInputLayout

class Extensions {
    var TextInputLayout.text: String
        get() = editText?.text.toString()
        set(value) {
            editText?.setText(value)
        }

    fun TextInputLayout.closeKeyboard() {
        
    }
}
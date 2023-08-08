package com.rithyphavan.shapegenerator.ui.component.shape

import androidx.annotation.StringRes
import com.rithyphavan.shapegenerator.MainApplication
import com.rithyphavan.shapegenerator.R

enum class ShapeType(@StringRes val shapeName: Int) {
    SQUARE(R.string.square), CIRCLE(R.string.circle), RECTANGLE(R.string.rectangle), TRIANGLE(R.string.triangle);

    companion object {
        fun String.shapeByName(): ShapeType? {
            return values().firstOrNull {
                this == MainApplication.getInstance().getString(it.shapeName)
            }
        }
    }
}
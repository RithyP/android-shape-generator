package com.rithyphavan.shapegenerator

import androidx.annotation.StringRes

enum class ShapeType(@StringRes val shapeName: Int) {
    SQUARE(R.string.square),
    CIRCLE(R.string.circle),
    RECTANGLE(R.string.rectangle),
    TRIANGLE(R.string.triangle);
}
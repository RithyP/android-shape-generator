package com.rithyphavan.shapegenerator.ui.component.shape

import android.graphics.Bitmap
import android.graphics.Paint
import com.rithyphavan.shapegenerator.util.ColorUtil.genRandomColor

abstract class Shape {

    abstract fun getSize(): Float
    open fun setSize(size: Float) {

    }

    abstract fun draw(): Bitmap

    protected var paint: Paint = Paint().apply {
        color = genRandomColor()
    }

    open fun setShapePaint(paint: Paint) {
        this.paint = paint
    }

    fun getShapePaint(): Paint {
        return paint
    }

}
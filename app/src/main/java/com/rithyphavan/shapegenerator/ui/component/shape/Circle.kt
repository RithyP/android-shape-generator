package com.rithyphavan.shapegenerator.ui.component.shape

import android.graphics.Bitmap
import android.graphics.Canvas

class Circle(private var size: Float = 100f) : Shape() {

    override fun getSize(): Float = size

    override fun setSize(size: Float) {
        this.size = size
    }

    override fun draw(): Bitmap {
        val squareBitmap =
            Bitmap.createBitmap(getSize().toInt(), getSize().toInt(), Bitmap.Config.ARGB_8888)
        val canvas = Canvas(squareBitmap)

        val paint = getShapePaint()

        canvas.drawCircle(getSize() / 2, getSize() / 2, getSize() / 2, paint)
        return squareBitmap
    }
}
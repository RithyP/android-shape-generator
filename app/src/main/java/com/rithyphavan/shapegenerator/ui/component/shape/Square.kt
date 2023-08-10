package com.rithyphavan.shapegenerator.ui.component.shape

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Rect


class Square(private var size: Float = 100f) : Shape() {

    override fun getSize(): Float {
        return size
    }

    override fun setSize(size: Float) {
        this.size = size
    }

    override fun draw(): Bitmap {
        val squareBitmap =
            Bitmap.createBitmap(getSize().toInt(), getSize().toInt(), Bitmap.Config.ARGB_8888)
        val canvas = Canvas(squareBitmap)

        val paint = getShapePaint()
        val rect = Rect(0, 0, getSize().toInt(), getSize().toInt())

        canvas.drawRect(rect, paint)
        return squareBitmap
    }
}
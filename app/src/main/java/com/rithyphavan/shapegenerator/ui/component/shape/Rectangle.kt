package com.rithyphavan.shapegenerator.ui.component.shape

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Rect

class Rectangle(private var width: Int = 100, private var length: Int = 200) : Shape() {
    fun setWidth(width: Int) {
        this.width = width
    }

    fun getWidth() {
        this.width
    }

    fun setLength(length: Int) {
        this.length = length
    }

    fun getLength() {
        this.length
    }

    override fun getSize(): Float {
        return length.toFloat()
    }

    override fun draw(): Bitmap {
        val squareBitmap = Bitmap.createBitmap(length, length, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(squareBitmap)

        val paint = getShapePaint()

        val top =
            if (length - width < length / 2) length - width else if (width == length / 2) length / 4 else width
        val bottom =
            if (length - width < length / 2) width else if (width == length / 2) (length / 4) + width else length - width
        val rect = Rect(0, top, length, bottom)

        canvas.drawRect(rect, paint)
        return squareBitmap
    }
}
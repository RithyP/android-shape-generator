package com.rithyphavan.shapegenerator.ui.component.shape

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Rect

class Rectangle(private var width: Float = 100f, private var length: Float = 200f) : Shape() {
    init {
        checkIfWidthBiggerThanLength()
    }

    fun setWidth(width: Float) {
        checkIfWidthBiggerThanLength()
        this.width = width
    }

    fun getWidth(): Float {
        return this.width
    }

    fun setLength(length: Float) {
        checkIfWidthBiggerThanLength()
        this.length = length
    }

    fun getLength(): Float {
        return this.length
    }

    private fun checkIfWidthBiggerThanLength() {
        val (newWidth, newLength) = swapSmallerValueWithBiggerValue(width, length)
        this.width = newWidth
        this.length = newLength
    }

    /**
     * This function is for safe check if whether the provided smaller value is bigger than the bigger value
     * so if that the case both value will be swap with each other
     */
    fun swapSmallerValueWithBiggerValue(small: Float, big: Float): Pair<Float, Float> {
        var tempSmall = small
        var tempBig = big
        if (small > big) {
            tempSmall = big.also {
                tempBig = length
            }
        }
        return Pair(tempSmall, tempBig)
    }

    override fun getSize(): Float {
        // Since rectangle dont have a clear size just use the biggest size for now which is length
        return getLength()
    }

    override fun draw(): Bitmap {
        val bitmap =
            Bitmap.createBitmap(getLength().toInt(), getLength().toInt(), Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)

        val paint = getShapePaint()

        val halfLength = getLength() / 2

        val top =
            if (getLength() - getWidth() < halfLength) getLength() - getWidth() else if (getWidth() == getLength() / 2) getLength() / 4 else getWidth()
        val bottom =
            if (getLength() - getWidth() < getLength() / 2) getWidth() else if (getWidth() == getLength() / 2) (getLength() / 4) + getWidth() else getLength() - getWidth()
        val rect = Rect(0, top.toInt(), getLength().toInt(), bottom.toInt())

        canvas.drawRect(rect, paint)
        return bitmap
    }
}
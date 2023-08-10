package com.rithyphavan.shapegenerator.ui.component.shape

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Path


class Triangle(private var size: Float = 100f) : Shape() {
    override fun getSize(): Float {
        return size
    }

    override fun setSize(size: Float) {
        this.size = size
    }

    override fun draw(): Bitmap {
        val halfWidth = getSize() / 2

        val path = Path()
        val x = getSize() / 2
        val y = getSize() / 2
        path.moveTo(x, y - halfWidth)
        path.lineTo(x - halfWidth, y + halfWidth)
        path.lineTo(x + halfWidth, y + halfWidth)
        path.lineTo(halfWidth, y - halfWidth)
        path.close()

        val squareBitmap =
            Bitmap.createBitmap(getSize().toInt(), getSize().toInt(), Bitmap.Config.ARGB_8888)
        val canvas = Canvas(squareBitmap)

        val paint = getShapePaint()
        canvas.drawPath(path, paint)
        return squareBitmap
    }
}
package com.rithyphavan.shapegenerator.ui.component.shape

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.opengl.ETC1.getHeight
import android.opengl.ETC1.getWidth


class Square(size: Int) : Shape() {
    var size: Int = size
        private set

    override fun draw() {
        val squareBitmap = Bitmap.createBitmap(size, size, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(squareBitmap)

        val paint = Paint()
        paint.color = Color.RED
        val rect = Rect(0, 0, size, size)

        canvas.drawRect(rect, paint)
    }
}
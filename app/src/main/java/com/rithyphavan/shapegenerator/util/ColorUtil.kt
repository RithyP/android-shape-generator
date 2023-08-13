package com.rithyphavan.shapegenerator.util

import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Paint
import android.graphics.Shader
import androidx.annotation.ColorInt
import java.util.Random

object ColorUtil {
    @ColorInt
    fun genRandomColor(): Int {
        val random = Random()
        return Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256))
    }

    fun genRandomPaintColor(): Paint {
        val rnd = Random()
        return Paint().apply {
            setARGB(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))
        }
    }

    fun getRandomGradientColor(height: Float): Paint {
        val gradientColors = intArrayOf(
            genRandomColor(),
            genRandomColor(),
            genRandomColor(),
        )
        val gradientColorPos = floatArrayOf(
            0f, 0.5f, 1f
        )
        return Paint().apply {
            shader = LinearGradient(
                0f, 0f, 0f, height, gradientColors, gradientColorPos, Shader.TileMode.MIRROR
            )
        }
    }
}
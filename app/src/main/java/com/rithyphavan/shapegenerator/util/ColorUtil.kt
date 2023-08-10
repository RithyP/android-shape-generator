package com.rithyphavan.shapegenerator.util

import android.graphics.Color
import android.graphics.Paint
import java.util.Random

object ColorUtil {
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
}
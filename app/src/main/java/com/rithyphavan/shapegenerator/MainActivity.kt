package com.rithyphavan.shapegenerator

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Rect
import androidx.activity.viewModels
import com.rithyphavan.shapegenerator.databinding.ActivityMainBinding
import com.rithyphavan.shapegenerator.ui.component.shape.Rectangle
import com.rithyphavan.shapegenerator.util.ColorUtil.genRandomPaintColor
import com.rithyphavan.shapegenerator.util.PixelUtil.dpToPx

class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {

    private val viewModel: MainViewModel by viewModels()

    override fun initView() {
    }

    override fun initAction() {

        binding.generateShapeBtn.setOnClickListener {
            drawShapeOnBitmap()
        }
    }

    private fun drawShapeOnBitmap() {
        val shapeBitmap = Bitmap.createBitmap(
            binding.shapeCanvasCard.width - dpToPx(16),
            binding.shapeCanvasCard.height - dpToPx(16),
            Bitmap.Config.ARGB_8888
        )
        val canvas = Canvas(shapeBitmap)
        var shapeRect: Rect? = null
        for (shape in viewModel.shapes) {
            if (shape is Rectangle) {
                shape.setWidth(100f)
                shape.setLength(200f)
            } else {
                shape.setSize(200f)
            }
            shape.setShapePaint(genRandomPaintColor())
            val bitmap = shape.draw()
            shapeRect = Rect(
                shapeRect?.right ?: 0, 0, bitmap.width + (shapeRect?.right ?: 0), bitmap.height
            )
            canvas.drawBitmap(
                bitmap, null, shapeRect, null
            )
        }
        binding.shapeImage.setImageBitmap(shapeBitmap)
    }

}
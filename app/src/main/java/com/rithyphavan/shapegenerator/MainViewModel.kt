package com.rithyphavan.shapegenerator

import android.graphics.Bitmap
import androidx.lifecycle.ViewModel
import com.rithyphavan.shapegenerator.ui.component.shape.Circle
import com.rithyphavan.shapegenerator.ui.component.shape.Rectangle
import com.rithyphavan.shapegenerator.ui.component.shape.Shape
import com.rithyphavan.shapegenerator.ui.component.shape.ShapeType
import com.rithyphavan.shapegenerator.ui.component.shape.Square
import com.rithyphavan.shapegenerator.ui.component.shape.Triangle
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel : ViewModel() {

    var shapes: List<Shape> = listOf(
        Square(),
        Circle(),
        Rectangle(),
        Triangle(),
    )

    private var selectedShape: ShapeType? = null
    fun setSelectedShape(selectedShape: ShapeType?) {
        this.selectedShape = selectedShape
    }

    fun getSelectedShape() = selectedShape

    private val _shapeBitmap = MutableStateFlow<Bitmap?>(null)
    val shapeBitmap = _shapeBitmap.asStateFlow()
}
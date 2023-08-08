package com.rithyphavan.shapegenerator

import android.graphics.Bitmap
import androidx.lifecycle.ViewModel
import com.rithyphavan.shapegenerator.ui.component.shape.ShapeType
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel : ViewModel() {

    private var selectedShape: ShapeType? = null
    fun setSelectedShape(selectedShape: ShapeType?) {
        this.selectedShape = selectedShape
    }

    fun getSelectedShape() = selectedShape

    private val _shapeBitmap = MutableStateFlow<Bitmap?>(null)
    val shapeBitmap = _shapeBitmap.asStateFlow()
}
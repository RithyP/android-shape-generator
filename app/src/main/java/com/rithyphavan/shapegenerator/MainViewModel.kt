package com.rithyphavan.shapegenerator

import androidx.lifecycle.ViewModel
import com.rithyphavan.shapegenerator.ui.component.shape.Circle
import com.rithyphavan.shapegenerator.ui.component.shape.Rectangle
import com.rithyphavan.shapegenerator.ui.component.shape.Shape
import com.rithyphavan.shapegenerator.ui.component.shape.Square
import com.rithyphavan.shapegenerator.ui.component.shape.Triangle

class MainViewModel : ViewModel() {

    var shapes: List<Shape> = listOf(
        Square(),
        Circle(),
        Rectangle(),
        Triangle(),
    )

}
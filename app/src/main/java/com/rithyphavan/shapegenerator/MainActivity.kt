package com.rithyphavan.shapegenerator

import android.widget.ArrayAdapter
import androidx.activity.viewModels
import com.rithyphavan.shapegenerator.databinding.ActivityMainBinding
import com.rithyphavan.shapegenerator.ui.component.shape.ShapeType
import com.rithyphavan.shapegenerator.ui.component.shape.ShapeType.Companion.shapeByName
import com.rithyphavan.shapegenerator.ui.component.shape.Square

class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {

    private val viewModel: MainViewModel by viewModels()

    private val shapeSelectorAdapter by lazy {
        ArrayAdapter(
            this,
            R.layout.item_menu_drop_down,
            ShapeType.values().map {
                getString(it.shapeName)
            },
        )
    }

    override fun initView() {
        binding.shapeSelectorList.setAdapter(shapeSelectorAdapter)
    }

    override fun initAction() {
        binding.shapeSelectorList.setOnItemClickListener { parent, view, position, id ->
            onShapeSelected(binding.shapeSelectorList.text.toString())
        }
    }

    private fun onShapeSelected(selectedShape: String) {
        viewModel.setSelectedShape(selectedShape.shapeByName())
        when (selectedShape.shapeByName()) {

            ShapeType.SQUARE -> {

            }

            else -> {

            }
        }
    }

}
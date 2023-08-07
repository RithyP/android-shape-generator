package com.rithyphavan.shapegenerator

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.viewbinding.ViewBinding

/**
 * Base class for binding activity.
 * @param viewBindingInflater Activity binding inflate method eg. ExampleBindingActivity::inflate
 */
abstract class BaseActivity<VB : ViewBinding>(
    private val viewBindingInflater: (
        inflater: LayoutInflater,
    ) -> VB
) : AppCompatActivity() {
    private lateinit var _binding: VB
    protected lateinit var binding: VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = viewBindingInflater(layoutInflater)
        binding = _binding
        setContentView(binding.root)
        setStatusBarTransparent()

        initView()
        initObserver()
        initAction()
    }

    private fun setStatusBarTransparent() {
        WindowCompat.setDecorFitsSystemWindows(window, false)
    }

    /**
     * Use for controlling view property or attribute.
     */
    open class initView()

    /**
     * Use this for populating actionable view like on button clicked, on text changed, etc...
     */
    open class initAction()

    /**
     * Use this function only for state observing like listening to LiveData or Coroutine Flow.
     */
    open class initObserver()

}
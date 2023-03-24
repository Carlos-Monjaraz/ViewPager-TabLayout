package com.carlosmonjaraz.devmon.viewpagertablayoutexample

import android.os.Bundle
import android.util.TypedValue
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.carlosmonjaraz.devmon.viewpagertablayoutexample.databinding.FragmentDataBinding
import kotlin.math.roundToInt

class DataFragment : Fragment() {

    private var _binding: FragmentDataBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDataBinding.inflate(inflater, container, false)
        val root: View = binding.root

        initUI()
        return root
    }

    private fun initUI() {
        updateHeight(binding.viewPAC, 90)
        updateHeight(binding.viewDRI, 90)
        updateHeight(binding.viewSHO, 93)
        updateHeight(binding.viewDEF, 35)
        updateHeight(binding.viewPAS, 81)
        updateHeight(binding.viewPHY, 79)
    }

    private fun updateHeight(view: View, stat: Int){
        val params = view.layoutParams
        params.height = pxToDp(stat.toFloat())
        view.layoutParams = params
    }

    private fun pxToDp(px:Float):Int{
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, px, resources.displayMetrics).roundToInt()
    }
}
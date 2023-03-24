package com.carlosmonjaraz.devmon.viewpagertablayoutexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.carlosmonjaraz.devmon.viewpagertablayoutexample.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private val viewPager by lazy { ViewPager(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initUI()
    }

    private fun initUI() {
        Glide.with(this).load("https://pbs.twimg.com/media/FSpUmNgUEAEtdmW.jpg:large").into(binding.imgCR7);

        binding.vp.adapter = viewPager
        val tabLayoutMediator = TabLayoutMediator(binding.tab, binding.vp,
            TabLayoutMediator.TabConfigurationStrategy { tab, position ->
                when(position) {
                    0 -> {
                        tab.setIcon(R.drawable.icon_info)
                    }
                    1 -> {
                        tab.setIcon(R.drawable.icon_chart)
                    }
                    2 -> {
                        tab.setIcon(R.drawable.icon_type)
                    }
                }
            })
        tabLayoutMediator.attach()
    }


}
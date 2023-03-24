package com.carlosmonjaraz.devmon.viewpagertablayoutexample

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPager(fragment: FragmentActivity) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        when(position) {
            0 -> {
                return HistoryFragment()
            }
            1 -> {
                return DataFragment()
            }
            2 -> {
                return TeamsFragment()
            }
        }
        return DataFragment()
    }
}
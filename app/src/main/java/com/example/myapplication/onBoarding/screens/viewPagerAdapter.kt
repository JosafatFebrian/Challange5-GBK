package com.example.myapplication.onBoarding.screens

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter

class viewPagerAdapter (
    val item : ArrayList<Fragment>,
    activity: AppCompatActivity
    ): FragmentStateAdapter (activity) {
    override fun getItemCount(): Int {
        return item.size
    }

    override fun createFragment(position: Int): Fragment {
        return item[position]
    }


}

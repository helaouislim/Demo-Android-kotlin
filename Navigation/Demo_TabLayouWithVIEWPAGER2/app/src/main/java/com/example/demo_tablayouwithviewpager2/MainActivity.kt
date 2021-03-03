package com.example.demo_tablayouwithviewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.itme_view_pager.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images = listOf(
            R.drawable.logo_android,
            R.drawable.logo_flutter,
            R.drawable.logo_reactnative,
            R.drawable.logo_swift
        )

        val adapter = ViewPagerAdapter(images)
        viewPager.adapter = adapter
        TabLayoutMediator(TabLayout, viewPager) { tab, position ->
            tab.text = "Tab ${position + 1}"
        }.attach()

        // you can add event here
        TabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {

            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }


        })


    }
}
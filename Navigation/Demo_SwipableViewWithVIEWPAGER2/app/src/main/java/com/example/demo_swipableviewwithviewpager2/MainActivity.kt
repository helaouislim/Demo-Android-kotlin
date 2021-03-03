package com.example.demo_swipableviewwithviewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*

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

        viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        // Drag automatically
        viewPager.beginFakeDrag()
        viewPager.fakeDragBy(10f)
        viewPager.endFakeDrag()
    }
}
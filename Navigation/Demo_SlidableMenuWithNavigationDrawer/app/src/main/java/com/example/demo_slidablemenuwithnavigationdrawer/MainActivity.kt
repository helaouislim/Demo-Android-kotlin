package com.example.demo_slidablemenuwithnavigationdrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawer = findViewById<DrawerLayout>(R.id.drawerLayout)
        toggle = ActionBarDrawerToggle(this, drawer,R.string.open,R.string.open )
        drawer.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val navView = findViewById<NavigationView>(R.id.nav_view)
        val textView = findViewById<TextView>(R.id.tvActivity)
        navView.setNavigationItemSelectedListener {
            when(it.itemId)
            {
                R.id.miItem1 -> textView.text = "Menu 1"
                R.id.miItem2 -> textView.text = "Menu 2"
                R.id.miItem3 -> textView.text = "Menu 3"
            }
            return@setNavigationItemSelectedListener true
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item))
        {
            return true
        }

        return super.onOptionsItemSelected(item)
    }
}
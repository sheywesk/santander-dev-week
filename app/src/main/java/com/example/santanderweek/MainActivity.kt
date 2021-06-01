package com.example.santanderweek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.ContextCompat
import com.example.santanderweek.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        val view = binding.root
        setContentView(view)
        setSupportActionBar(binding.toolbar)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        binding.toolbar.overflowIcon?.setTint(ContextCompat.getColor(this, R.color.white))
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflate = menuInflater
        inflate.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.item_1 -> {
                Log.d("TAG", "item_1")
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
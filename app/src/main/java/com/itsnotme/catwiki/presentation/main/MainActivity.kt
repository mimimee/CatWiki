package com.itsnotme.catwiki.presentation.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.itsnotme.catwiki.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupBottomNavMenu()
    }

    private fun setupBottomNavMenu() {
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation_view)
        val navController = findNavController(R.id.nav_host_fragment)
        bottomNav.setupWithNavController(navController)
    }
}
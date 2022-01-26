package com.itsnotme.starwars.presentation.main

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.onNavDestinationSelected
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.itsnotme.starwars.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupBottomNavMenu()
    }

    private fun setupBottomNavMenu() {
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation_view)
        val host = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) ?: return
        val navController = host.findNavController()
        bottomNav.setupWithNavController(navController)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return item.onNavDestinationSelected(findNavController(R.id.nav_host_fragment))
                || super.onOptionsItemSelected(item)
    }
}
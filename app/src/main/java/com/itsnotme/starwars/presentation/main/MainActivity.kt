package com.itsnotme.starwars.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.itsnotme.starwars.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

/**
 - создать 3 фрагмента (у каждого разный фон)
 - внедрить боттомнавигейшн бар
 - внедрить навигейшн компонент, чтобы перемещаться между фрагментами
 */
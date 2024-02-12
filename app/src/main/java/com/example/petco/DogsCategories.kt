package com.example.petco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class DogsCategories : AppCompatActivity() {
    private lateinit var ivBackbtn : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dogs_categories)

        ivBackbtn = findViewById(R.id.ivBackbtn)
        ivBackbtn.setOnClickListener{
            val int = Intent(this,ptHomePage::class.java)
            startActivity(int)
        }

    }
}
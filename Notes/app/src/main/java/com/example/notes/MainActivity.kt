package com.example.notes

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.notes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
       binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       binding.addbutton.setOnClickListener{
        val intent = Intent(this, AddNoteActivity::class.java)
       startActivity(intent)
     }


    }
}
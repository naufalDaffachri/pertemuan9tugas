package com.example.pertemuan8tugas1

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.pertemuan8tugas1.databinding.ActivityMainBinding
import com.example.pertemuan8tugas1.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra("username")
        binding.textWelcome.text = "Welcome back, $username"
        binding.root.findViewById<AppCompatButton>(R.id.jempolBawahButton).setOnClickListener {
            Toast.makeText(this, "Oow! Hope things get better!", Toast.LENGTH_SHORT).show()
            true
        }
        binding.root.findViewById<AppCompatButton>(R.id.jempolAtasButton).setOnClickListener {
            Toast.makeText(this, "Yeay! Great to hear that!", Toast.LENGTH_SHORT).show()
            true
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
    menuInflater.inflate(R.menu.menu_options, menu)
    return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
    return when (item.itemId) {
        R.id.action_out -> {
            Toast.makeText(this, "Log-out", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
            true
        }

        else -> super.onOptionsItemSelected(item)
    }
    }
}
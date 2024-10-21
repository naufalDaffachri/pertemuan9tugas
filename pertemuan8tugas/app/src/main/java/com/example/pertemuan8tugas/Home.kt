package com.example.pertemuan8tugas

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.pertemuan8tugas.databinding.ActivityHomeBinding

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra("username")
        val fragment = HomeFragment().apply {
            arguments = Bundle().apply {
                putString("username", username)
            }
        }

        supportFragmentManager.beginTransaction()
            .replace(R.id.view_pager, fragment)
            .commit()

    }
}
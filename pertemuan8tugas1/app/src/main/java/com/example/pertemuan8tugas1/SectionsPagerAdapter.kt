package com.example.pertemuan8tugas1

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class SectionsPagerAdapter(activity: AppCompatActivity) :
    FragmentStateAdapter(activity) {

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> RegisterFragment()
            1 -> LoginFragment()
            else -> throw IllegalStateException("Invalid position")
        }
    }
    override fun getItemCount(): Int {
        return 2
    }
}
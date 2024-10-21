package com.example.pertemuan8tugas1

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pertemuan8tugas1.databinding.FragmentRegisterBinding

// TODO: Rename parameter arguments, choose names that match

class RegisterFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var _binding: FragmentRegisterBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRegisterBinding.inflate(inflater, container, false)

        binding.btnRegister.setOnClickListener {
            val username = binding.editUsername.text.toString()
            val intent = Intent(activity, ResultActivity::class.java)
            intent.putExtra("username", username)
            startActivity(intent)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
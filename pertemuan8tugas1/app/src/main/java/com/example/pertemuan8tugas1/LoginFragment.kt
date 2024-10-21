package com.example.pertemuan8tugas1

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pertemuan8tugas1.databinding.FragmentLoginBinding
import com.example.pertemuan8tugas1.databinding.FragmentRegisterBinding



class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        binding.btnLogin.setOnClickListener {
            val username = binding.editUsernameLogin.text.toString()
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
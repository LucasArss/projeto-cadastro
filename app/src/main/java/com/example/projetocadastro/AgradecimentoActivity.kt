package com.example.projetocadastro

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.app.LoginActivity
import com.example.projetocadastro.databinding.ActivityAgradecimentoBinding

class AgradecimentoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAgradecimentoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAgradecimentoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnVoltar.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }

    }
}
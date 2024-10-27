package com.example.projetocadastro

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.projetocadastro.databinding.ActivityConfirmacaoBinding

class ConfirmacaoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityConfirmacaoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConfirmacaoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent = intent
        val nome = intent.getStringExtra("nome")
        val idade = intent.getStringExtra("idade")
        val email = intent.getStringExtra("email")

        binding.txtViewNome.text = nome
        binding.txtViewIdade.text = idade
        binding.txtViewEmail.text = email

        binding.btnFinalizar.setOnClickListener{
            startActivity(Intent(this, AgradecimentoActivity::class.java))
            finish()
        }




    }
}
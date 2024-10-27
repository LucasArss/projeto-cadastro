package com.example.app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.projetocadastro.CadastroActivity
import com.example.projetocadastro.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEntrar.setOnClickListener {
            val nome = binding.editTxtNome.text.toString()
            val senha = binding.editTxtSenha.text.toString()

            if (nome == "admin" && senha == "admin") {
                binding.errorTextView.visibility = android.view.View.GONE
                startActivity(Intent(this, CadastroActivity::class.java))
                finish()
            } else {
                binding.errorTextView.visibility = android.view.View.VISIBLE
            }
        }
    }
}

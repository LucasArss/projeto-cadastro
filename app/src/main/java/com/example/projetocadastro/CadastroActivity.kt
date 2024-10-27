package com.example.projetocadastro

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.projetocadastro.databinding.ActivityCadastroBinding

class CadastroActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCadastroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCadastroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCadastrar.setOnClickListener {
            val nome = binding.editTxtNomeCadastro.text.toString()
            val idade = binding.editTxtIdade.text.toString()
            val email = binding.editTxtEmail.text.toString()
            val termosAceitos = binding.ckBoxTermos.isChecked

            var mensagem = ""

            if (nome.isEmpty()) {
                mensagem += "Nome é obrigatório.\n"
            }
            if (idade.isEmpty()) {
                mensagem += "Idade é obrigatória.\n"
            } else if (idade.toIntOrNull() == null || idade.toInt() < 18) {
                mensagem += "Você deve ser maior de idade para continuar.\n"
            }
            if (email.isEmpty()) {
                mensagem += "E-mail é obrigatório.\n"
            }
            if (!termosAceitos) {
                mensagem += "Você deve aceitar os termos de serviço.\n"
            }

            if (mensagem.isNotEmpty()) {
                binding.textViewErro.text = mensagem
                binding.textViewErro.visibility = android.view.View.VISIBLE
            } else {
                binding.textViewErro.visibility = android.view.View.GONE
                val envio = Intent(this, ConfirmacaoActivity::class.java)
                envio.putExtra("nome", nome)
                envio.putExtra("idade", idade)
                envio.putExtra("email", email)
                startActivity(envio)
                finish()

            }
        }
    }
}

package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)
        val userName = intent.getStringExtra("User")
        val textView = findViewById<TextView>(R.id.Nomeusuario)
        val  message = "$userName ,você terá acesso gratuito a todos os conteúdos por um mês"
        textView.text = message
    }
}
package com.example.app

import android.content.Intent
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.voice.VoiceInteractionSession
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.app.R.layout.activity_main

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textoSaudaçao = findViewById<TextView>(R.id.Textpricipal)
        val campodeEntrada = findViewById<EditText>(R.id.InsertName)
        val submitButton = findViewById<Button>(R.id.botão)
        val ofertaButton = findViewById<Button>(R.id.buttonoferta)
        val enteredName = ""
        submitButton.setOnClickListener {

            val enteredName = campodeEntrada.text.toString()

            if (enteredName == ""){
                ofertaButton.visibility = INVISIBLE
                textoSaudaçao.text = ""
                Toast.makeText(
                    this@MainActivity,
                    "Insira seu nome",
                    Toast.LENGTH_SHORT
                ).show()

            }else {
                val message = "Seja bem vindo $enteredName"
                textoSaudaçao.text = message
                campodeEntrada.text.clear()
                ofertaButton.visibility = VISIBLE
            }

        }

        ofertaButton.setOnClickListener {
            val intent = Intent(this,SecondActivity2::class.java)
            intent.putExtra("User",enteredName)
            startActivity(intent)



        }


    }
}
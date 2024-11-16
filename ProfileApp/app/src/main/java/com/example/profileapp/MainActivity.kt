package com.example.profileapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //iniciando componentes
        val profileImage = findViewById<ImageView>(R.id.profileImage)
        val nameText = findViewById<TextView>(R.id.nameText)
        val descriptionText = findViewById<TextView>(R.id.descriptionText)
        val currentJobText = findViewById<TextView>(R.id.currentJobText)
        val experienceLayout = findViewById<LinearLayout>(R.id.experienceLayout)

        //definindo informações de perfil
        nameText.text = "Jorginho"
        descriptionText.text = "Desenvolvedor de software com 10 anos de experiência"
        currentJobText.text = "Emprego Atual: Gerente de Projetos na empresa TechAll"

        //lista de experiências
        val experiencias = listOf(
            "Analista de Sistemas - Empresa TecnoPlus",
            "Estagiário - Empresa TechAll"
        )

        //adicionando experiências dinamicamente
        for (experiencia in experiencias){
            val textView = TextView(this)
            textView.text = experiencia
            textView.textSize = 10f
            experienceLayout.addView(textView)
        }
    }
}
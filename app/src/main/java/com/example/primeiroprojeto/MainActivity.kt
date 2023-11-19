package com.example.primeiroprojeto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalcular: Button = findViewById(R.id.btnCalcular)
        val edtPeso: EditText = findViewById(R.id.edittext_peso)
        val edtAltura: EditText = findViewById(R.id.edittext_altura)


        btnCalcular.setOnClickListener {

           val alturastr = edtAltura.text.toString()
            val pesostr = edtPeso.text.toString()

            if (alturastr.isNotEmpty() && pesostr.isNotEmpty()){
            val altura: Float = alturastr.toFloat()
            val peso: Float = pesostr.toFloat()

            val alturaFinal: Float = altura * altura
            val result = peso / alturaFinal


            val intent = Intent(this, Tela02::class.java)
                .apply {
                    putExtra("EXTRA_RESULT", result)
                }
            startActivity(intent)

            } else {

            Toast.makeText(this, "Preencher todos os campos", Toast.LENGTH_LONG).show()
            }



        }

    }
}
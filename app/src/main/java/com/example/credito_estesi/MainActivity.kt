package com.example.credito_estesi

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val valor1input = findViewById<EditText>(R.id.editTextNumber)
        val valor2input = findViewById<EditText>(R.id.editTextNumber2)
        val valor3input = findViewById<EditText>(R.id.editTextNumber3)
        val valor4input = findViewById<EditText>(R.id.editTextNumber4)

        val buttonHello = findViewById<Button>(R.id.button)

        val textViewHello = findViewById<TextView>(R.id.textView16)

        buttonHello.setOnClickListener{
            val valor1 = valor1input.text.toString().toDoubleOrNull()
            val valor2 = valor2input.text.toString().toDoubleOrNull()
            val valor3 = valor3input.text.toString().toDoubleOrNull()
            val valor4 = valor4input.text.toString().toDoubleOrNull()

            val credito: double = valor2 * (1+)/()


        }


    }
}
package com.example.calculadoradeaposentadoria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Button.setOnClickListener {
            //Acessar o spinner
            val spinner = findViewById<Spinner>(R.id.Spinner)

            //Acessando a idade
            val idade = findViewById<EditText>(R.id.Edit_Idade).text.toString().toInt()

            //acessando o botao
            val button = findViewById<Button>(R.id.Button)

            //Texto de resultado
            var resultado: Int
            resultado = 0

            val sexo = spinner.selectedItem as String


            //Outra maneira de criar itens (outra seria no arquivo strings)
//            spinner.adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,
//                    listOf("Masculino", "Feminino"))

            if (sexo == "Masculino") {
                resultado = 65 - idade
            } else {
                resultado = 60 - idade
            }

            Text_inicio.text = "Faltam $resultado anos para se aposentar!"


        }

    }
}
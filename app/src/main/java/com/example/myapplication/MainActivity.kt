package com.example.myapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.myapplication.services.ServiceCliente.ResponseApiServiceCliente

class MainActivity : AppCompatActivity() {

    var rasc = ResponseApiServiceCliente()
    val context: Context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et_nombre = findViewById<EditText>(R.id.et_nombres)
        val et_apellido = findViewById<EditText>(R.id.et_apellidos)
        val et_correo = findViewById<EditText>(R.id.et_email)
        val btn_grabar = findViewById<EditText>(R.id.et_nombres)


        val toast = Toast.makeText(context,"-",Toast.LENGTH_SHORT)

        btn_grabar.setOnClickListener(
            View.OnClickListener {
                rasc.grabaCliente("0",
                    et_apellido.text.toString(),
                    et_nombre.text.toString(),
                    et_correo.text.toString(),
                    toast)
            })
    }
}
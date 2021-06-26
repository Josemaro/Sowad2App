package com.example.myapplication.services.ServiceCliente

import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

import com.example.myapplication.models.entity.Cliente
import com.example.myapplication.services.RetrofitClient


class ResponseApiServiceCliente {
    fun grabaCliente(
        id_usuario: String,
        nombres: String?,
        apellidos: String?, correo:String?,
        toast: Toast){

        val c = Cliente(0,nombres,apellidos,correo)
        val r = RetrofitClient.buildService(ApiServiceCliente::class.java)
        val call = r.GrabarCliente(c)
        var mensaje : String = ""


        call!!.enqueue(object : Callback<Cliente>{
             override fun onResponse(call: Call<Cliente>, response: Response<Cliente>){
                if(response.isSuccessful ) mensaje = "Grabado"
                else mensaje = "Reintente nuevamente"
                toast.setText(mensaje)
                toast.show()
            }
            override fun onFailure(call: Call<Cliente>, t:Throwable){
                mensaje = "Reintente nuevamente"
                toast.setText(mensaje)
                toast.show()
            }
        })
    }
}
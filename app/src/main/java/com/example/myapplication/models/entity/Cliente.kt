package com.example.myapplication.models.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Cliente {
    @SerializedName("id_usuario")
    @Expose
    var id_usuario=0

    //@SerializedName("id_rol")
   // @Expose
    //var id_rol: Int? = null

    @SerializedName("nombres")
    @Expose
    var nombres: String? = null

    @SerializedName("apellidos")
    @Expose
    var apellidos: String? = null

    @SerializedName("correo")
    @Expose
    var correo: String? = null

    constructor(id_usuario: Int, nombres: String?,apellidos: String?, correo:String?){
        this.id_usuario = id_usuario;
        //this.id_rol = id_rol;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
    }
}
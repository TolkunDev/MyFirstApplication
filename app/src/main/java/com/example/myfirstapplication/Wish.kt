package com.example.myfirstapplication

import java.io.Serializable

data class Wish(
    var id : Int,
    var name : String,
    var descriprion : String,
    var flag : Boolean
):Serializable
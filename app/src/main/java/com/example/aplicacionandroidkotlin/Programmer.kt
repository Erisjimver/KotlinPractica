package com.example.aplicacionandroidkotlin

class Programmer(val name: String,
                 val age:Int,
                 val languages: Array<Language>,
                 val friends: Array<Programmer>? =null
                 ) {
    enum class Language{
        SWIFT,
        KOTLIN,
        JAVA,
        JAVASCRIPT
    }
    fun code(){
        for (language in languages){
            println("Estoy programando en $language")
        }
    }





}
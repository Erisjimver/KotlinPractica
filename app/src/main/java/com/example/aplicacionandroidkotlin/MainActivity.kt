package com.example.aplicacionandroidkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.lang.NullPointerException
import java.security.KeyStore

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //leccion 1
        variablesVConstantes()
        //leccion 2
        tipoDatos()
        //leccion 3
        condicionalIf()
        //leccion 4
        sentenciasWhen()
        //leccion 5
        funcionMaps()
        //leccion 6
        loops()
        //Leccion 7
        nullSafety()
        //leccion 8
        clases()


        }

    private fun variablesVConstantes(){
        //esto es un comentaria igual a java
        //Variables
        var miFirstVariable = "Hola Mundo"
        var miFirstNumber = 1
        var miSecondVariable = miFirstVariable
        println(miFirstVariable)
        println(miFirstNumber)
        println(miSecondVariable)

        //Constantes
        val miFirstConstante= "Hola esta es mi constante"
        val miSecondConstante="Esta es una constante, su valor no se modifica"

        println(miFirstConstante)
    }

    private fun tipoDatos(){

        //Aqui String
        val miString: String="Israel"
        val miString1="Jimenez"
        val miStringDatos=miString+ " "+ miString1
        println(miStringDatos)

        //Aqui Enteros (Byte,Short, Int, Long)
        val numeroUno=1
        val numeroDos: Int =2
        val suma:Int =numeroUno+numeroDos
        println(suma)

        //aqui decimales (double,float)
        val variableDecimal=1.5
        val variableDecimal2:Double=2.5
        val variableDecimal3:Double=1.5
        val variableDecimal4=5.1
        val Entero=5
        val sumaDecimal= variableDecimal+variableDecimal2+variableDecimal3+variableDecimal4+Entero
        println(sumaDecimal)

        //aqui datos boleanos
        //var variableBooleana:Boolean=True
        //val variableBooleana1:Boolean=True
        //val queEs=variableBooleana==variableBooleana1
       // println(queEs)

    }


    //aqui hablaremos de la condicional if
    private fun condicionalIf(){
        //los condicionales trabajan con operadores logicos
        // > mayor que
        // < menor que
        // == (= =)igual
        // != desingualdad
        // >= mayos o igual
        // <=menor o igual

        val miNumero:Int =2
        val miNumero2:Int =2

        if(miNumero==miNumero2){
            println("Los numeros son iguales")
        }else{
            println("Los numeros no son iguales")
        }

        if(miNumero>=5){
            println("El numero es mayor o igual a 5")
        }else if(miNumero<=5){
            println("El numero es menor o igual a 5")
        }else{
            println("El numero no esta dentro del rango"
            )
        }

    }
    //esta sentencia es como el switch de otros lenguaes de programacion
    private fun sentenciasWhen(){

        //when con string
        val Country = "Ecuador"
        when(Country){
            "España, Venezuela,Colombia"->{
                println("El idioma es español")
            }
            "Ecuador"->{
                println("El idioma es español")
            }
            "Peru"->{
                println("El idioma es español")
            }
            "Estados Unidos"->{
                println("El idioma es ingles")
            }
            "Francia"->{
                println("El idioma es Frances")
            }
            else->{
                println("No conocemos el idioma de ese pais")
            }

        }
        var numeroWhen=5
        when(numeroWhen){
            0,1,2->{
                println("Es un bb")
            }in 3..10->{
                println("Es un niño")
            }in 11..17->{
                println("Es un adolescente")
            }in 18..69->{
                println("Es un adulto")
            }in 70..100->{
                println("Es un anciano")
            }else->{
            println(":O")
            }
        }





    }
    //aqui vamso a hablar de arreglos
    private fun arreglos(){
        val name="Israel"
        val lastName="Jimenez"
        val company="Isra"
        val age="26"

        //creacion de un array
        val miArray:ArrayList<String> = arrayListOf<String>()

        //Añadir datos de uno en uno
        miArray.add(name)
        miArray.add(lastName)
        miArray.add(company)
        miArray.add(age)
        //miArray.add(age) //Se permite ingresar datos repetidos
        println(miArray)


        //ingreso masivo de datos
        miArray.addAll(listOf("Hola", "Este es un tutorial de kotlin"))

        //acceso a datos del array
        val miCompany:String = miArray[2]
        println(miCompany)

        //Modificacion de datos
        miArray[5]="Nunca pares de aprender"
        println(miArray)


        //eliminar datos
        miArray.removeAt(4)
        println(miArray)

        //otras operaciones que se hacen con array
        miArray.count()

        miArray.clear()
        println(miArray.count())

        miArray.first()
        miArray.last()
        miArray.sort()

    }

    //aqui se habla de mapas o diccionarios
    private fun funcionMaps(){

        //sintaxis
        var miMap:Map<String,Int> = mapOf()
        println(miMap)

        //añadir elementos
        miMap= mutableMapOf("Israel" to 1,"Jimena" to 2)
        println(miMap)

        //añadir un solo valor
        miMap["Michelle"]=3
        miMap.put("Marlene",4)
        println(miMap)

        miMap.put("Ernesto",5)
        println(miMap)


        miMap.put("Emely",1)//no hay problema con el valor "El nombre es la clave"
        //Actualizacion de datos
        miMap.put("Emely",6)

        //acceso a datos
        println(miMap["Israel"])

        //Eliminar un dato
        miMap.remove( "Emely")
        println(miMap)
    }

    //aqui hablaremos de loops, tambien llamados bucles
    private fun loops(){

        val miArray:List<String> = listOf("Hola", "Este es un tutorial de kotlin")
        val miMap: MutableMap<String,Int> = mutableMapOf("Israel" to 1, "Jimena" to 2, "Michelle" to 3)

        //bucle for
        for(miString in miArray){
            println(miString)
        }
        for(miElement in miMap){
            println("${miElement.key}-${miElement.value}")
        }

        for(x in 0..10){
            println(x)
        }

        for(x in 9 until 30){
            println(x)
        }
        for(x in 0..10 step 2){
            println(x)
        }
        for(x in 10 downTo 0 step 2){//descie 2 en 2 desde 10
            println(x)
        }
        val miNumericArray =(0..20)
        for(myNum in miNumericArray){
            println(myNum)
        }

        //aqui viene el while
        var x = 0
        while(x<10){
            println(x)
            x+=1
        }

    }


    //Aqui hablaremso de seguridad contra nulos
    //tambien llamado Null Safety
    private fun nullSafety(){

        var myString ="Israel"
        println(myString)

        var mySafetyString:String?="Esto sera anulado o vaciado xd"
        mySafetyString=null
        println(mySafetyString)

        //println(mySafetyString!!)
        //mySafetyString="Hola"

        if(mySafetyString != null){
           // println(mySafetyString!!)
        }else{
            println("Si es nula")
        }
        //mySafetyString="Hola"
        //println(mySafetyString.length)

        mySafetyString="Hola"
        println(mySafetyString?.length)

        //esto la verdad es un problema
    }

    //aqui se habla de clases
    fun clases(){
        val israel=Programmer("Israel",26, arrayOf(Programmer.Language.KOTLIN,Programmer.Language.SWIFT), null)
        println(israel.name)
        println(israel.age)
        israel.code()

        val jimena=Programmer("Israel",26, arrayOf(Programmer.Language.JAVA), arrayOf(israel))

        println(jimena.name)
        println("${jimena.friends?.first()?.name} es amigo de ${jimena.name}")


    }


}

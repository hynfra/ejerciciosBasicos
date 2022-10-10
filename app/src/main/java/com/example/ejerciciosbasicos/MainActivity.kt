package com.example.ejerciciosbasicos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //primo()
        //imprimirFizzBuzz()
        //multiploDe2()
        comparar2String("caca","cece")
    }
}
/*// imprimir del 1 al 100 los numeros primos
fun primo(){
    (1..100).forEach{ numero ->
        if(esPrimo(numero)){
            println(numero)
        }
    }
}

fun esPrimo(numero: Int): Boolean {
    if(numero <2 ){
        return false
    }
   for(i in 2 until numero){
       if(numero % i == 0){
           return false
       }
   }
    return true
}*/
fun imprimirFizzBuzz(){
    for(i in 1..100){
        val divisiblepor3 = i % 3 == 0
        val divisiblepor5 = i % 5 == 0
        if(divisiblepor3 && divisiblepor5){
            println("Fizzbuzz\n")
        }else if(divisiblepor3){
            println("fizz\n")
        }else if(divisiblepor5){
            println("buzz\n")
        }else{
            println(i)
        }
    }
}
//cada vez que haya un multiplo de 2  en un rango de 1 al 100 imprimir multiplo
fun multiploDe2(){
    for(i in 1..100){
        if(i % 2 == 0){
            println("multiplo")
        }else{
            println(i)
        }
    }
}
//ordena de forma asendente el arreglo
fun ordenarAscendente() {
    val numbers = arrayOf(8, 1, 2, -3, 0)
    val sortedNumbers = numbers.sorted()
    println(sortedNumbers)
}
//ordena de forma desdencente los nombres
fun ordenardescendenteNombres() {
    val names = listOf("Bruno", "Maricela", "Victor", "Ana", "Vilma")
    val namesInDescOrder = names.sortedDescending()
    println(namesInDescOrder)
}
// imp´rimir en orden ascendente el sueldo de los empleados
  data  class Employee(val name: String, val salary: Int)
fun main() {
    val employees = listOf(
        Employee("Carolina", 2000),
        Employee("Shirley", 1500),
        Employee("Carlos", 1250),
        Employee("Jill", 4200),
    )
    val sortedEmployees = employees
        .sortedBy { it.salary }
        .map { it.name }

    println(sortedEmployees)
}
// verifica que el string sea valido
fun isValidString(s: String): Boolean{
    fun isValidCharacter(ch: Char) = ch == '_' || ch in '0'..'9' || ch in 'a'..'z' || ch in 'A'..'Z'
    if(s.isEmpty() || s[0] in '0'..'9') return false
    for (ch in s){
        if(!isValidCharacter(ch)) return false
    }
    return true
}
fun comparar2String(s: String, s2: String){
     var i = 0
    var character = ""
    val ch: Char
    if(s.length >= s2.length){
        for(ch in s){

            if(ch == s2[i]){
                character += ch
            }

            i++
        }
    }else{
        for(ch: Char in s2){

            if(ch == s[i]){
                character += ch
            }
            i++
        }
    }

    println("Comparten las siguientes letras: $character")

}
val s : String? = null // el ? al final permite colocar un valor null



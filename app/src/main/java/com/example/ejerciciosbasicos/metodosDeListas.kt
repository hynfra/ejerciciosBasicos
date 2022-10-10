package com.example.ejerciciosbasicos

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

class metodosDeListas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        heroes.last().name// obtiene el nombre del ultimo heroe
        heroes.all{ it.age < 50 } // all verifica que se cumpla en todos los campos la condicion puesta
        heroes.firstOrNull { it.age == 30 }?.name // devuelve el nombre del primero elemento que tenga la edad = 30, en este caso dara nulo porque ningun otiene 30
        heroes.map { it.age }.distinct().size // devuelve 5 porque devuelve la lista con elementos no repetidos, y se repite 1
        heroes.filter { it.age < 30 }.size // devuelve 3 porque hay 3 que tienen menos de 30 de edad y entrega el tamaño
        val (youngest, oldest) = heroes.partition { it.age < 30 } // partition divide el grupo en lo que se pide y lo que no se pide
        oldest.size // muestra 3
        heroes.maxByOrNull { it.age }?.name // entrega el nombre del que tiene mas edad
        heroes.all { it.age < 50 }  // comprueba que todos los heroes sean menores de 50
        heroes.any { it.gender == gender.FEMALE } // comprueba que haya al menos 1 que cumpla con el predicado, el cual es que el genero sea FEMALE
   /*************************** segundo video  **************************/

   val mapByAge: Map<Int, List<Hero>> =
       heroes.groupBy { it.age } // al agrupar por edad se crea otro map como edad como key
        val (age, group) = mapByAge.maxByOrNull { (_, group) ->
            group.size
        }!!
        println(age)

        // se puede acceder de 2 formas a un dato de un map
        //mapbyName["unknown"]?.age
        //mapbyName.getValue["unknown"].age
        val mapByName = heroes.associateBy { it.name }
        val unknownHero = Hero("Unknown", 0, null)
        mapByName.getOrElse("unknown") { unknownHero }.age // devuelve la key y sino devuelve el lambda

        val (first, second) = heroes
            .flatMap { heroes.map { hero -> it to hero } }
            .maxByOrNull { it.first.age - it.second.age }!!
        first.name


    }
     data class Hero(
         val name: String,
         val age: Int,
         val gender: gender?

     )

     enum class gender { MALE, FEMALE }

     val heroes = listOf(
         Hero("The Captain", 60, gender.MALE),
         Hero("Frenchy", 42, gender.MALE),
         Hero("The Kid", 9, null),
         Hero("Lady Lauren", 29, gender.FEMALE),
         Hero("First Mate", 29, gender.MALE),
         Hero("Sir Stephen", 37, gender.MALE)
     )



     //
 }
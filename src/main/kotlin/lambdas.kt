package com.tuonbondol.kotlin

data class Student(val name:String, var age:Int)

fun getStudents():List<Student>{
    return listOf(
            Student("Dara", 20),
            Student("Chan", 10),
            Student("Chanthy", 25),
            Student("Kunthy", 22),
            Student("Sarah", 18)
    )
}

fun main(args: Array<String>){
    val students = getStudents()
    val combos = students.map { a-> a.name + " : " + a.age }
    println("Combos: " + combos)

    println("The oldest student: ${students.maxBy {it.age}}")

    val studentWithLongNames = students.filter { it.name.length > 5 }
    println("Long names: " + studentWithLongNames)
}
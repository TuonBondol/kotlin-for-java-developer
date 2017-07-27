import com.Animal
import com.tuonbondol.kotlin.Car
import com.tuonbondol.kotlin.Person
import com.tuonbondol.kotlin.Position
import com.tuonbondol.kotlin.max
import kotlin.reflect.full.memberProperties

// Comment Code

// One Line Comment

/*
    Multiple Line Comment
 */

/*
fun emptyFunction(){
    /*
        Inside Function boy comment
     */
}
*/

object MySingleTon{
    var temperatures = arrayOf(80, 76, 90)
    fun getLastTemperature() = temperatures.last()
}

class Point(val x:Int, val y: Int, val z: Int){
    operator fun component1():Int = x
    operator fun component2():Int = y
    operator fun component3():Int = z
}

fun showComponent(){
    val myPoint = Point(5000, 500, 60000)
    val (myX, myY, myZ) = myPoint
    println("myX = $myX myY = $myY myZ = $myZ")
}

fun JavaInterop(){
    val Frisky = Animal("Frisky", "cat", 10)
    println(Frisky.show())
    val Fido = Animal("Fido", "dog", 30)
    println(Fido.show())

    Frisky.weight = 15
    println(Frisky.show())
}

fun userOverload(){
    val p1 = Position(200, 100)
    val p2 = Position(1000, 2000)
    val p3 = p1 + p2
    println(p3)

    val (xPosition, yPosition) = p1
    println("xPosition = $xPosition, yPosition = $yPosition")
    println("c1 = ${p1.component1()}")
}

fun main(args: Array<String>) {

    showComponent()

    return

    val dara = Person("Dara", "Chan")

    val kClass = dara.javaClass.kotlin
    println("Simple name = ${kClass.simpleName}")

    for(name in kClass.memberProperties){
        println("Property name = ${name.name}")
    }

    userOverload()
    return

    JavaInterop()
    return

    val maxInt:Int = max(42, 99)
    val maxLong: Long = max(123456789L, 999999999L)
    val maxByte: Byte = max ((-128).toByte(), (127).toByte())
    val maxString: String = max("Beta", "Alpha")

    println("The max Int = $maxInt")
    println("The max Long = $maxLong")
    println("The max Byte = $maxByte")
    println("The max String = $maxString")
    return

    val me = Person("Tuon", "Bondol")
    val you = Person("Dara", "Chan", "Yang")

    val location = object {
        var xPosition = 200
        var yPosition = 400
        fun printIt(){
            println("Position = ($xPosition, $yPosition)")
        }
    }
    location.printIt()
    location.xPosition = 2000
    location.yPosition = 4000
    location.printIt()

    val temperature = MySingleTon.getLastTemperature()
    println("Last reading = $temperature degrees")

    val myCar = Car()
    myCar.go()

    println("My car's make = ${myCar.MakeName}")

    return

    // Type Inference
    val aSentence = "I'm a string"
    val myPi = 3.14
    val myAnswer = 42

    var sString: String
    var aDouble: Double
    var aInt: Int

    var myDouble = 1.999
    var myFloat = 1.9F
    var myLong = 1234L
    val myInt = 12
    var myShort: Short = 12
    var myByte: Byte = 127

    val aLongNumber = 123_456_789
    val theSameNumber = 123456789

    val anInt: Int = 1
    val aLong: Long = anInt.toLong()

    // If expression
    val lowest = if (myInt < anInt) myInt else anInt
    println("The lowest value $lowest")

    val temp = 60
    val isAirConditionalOn = if (temp >= 80) {
        println("It is warm")
        true
    } else {
        println("It is not so warm")
        false
    }
    println("Is the air conditioner on: $isAirConditionalOn")
    // End of if expression

    // When expression
    val burgerOdered = 8
    when (burgerOdered) {
        0 -> println("Not so hungry")
        1, 2 -> println("Hungry")
        3 -> println("Very Hungry")
        else -> {
            println("Are your sure?")
        }
    }

    // Use when for get the absolute number
    when (burgerOdered) {
        Math.abs(burgerOdered) -> println("order 0 or more burgers")
        else -> {
            println("Ordered less than 0")
        }
    }

    // User when with between range of number
    when (burgerOdered) {
        0 -> println("We need orders")
        in 1..4 -> println("Got some orders")
        in 5..9 -> println("Business is up")
        else -> {
            println("Not sure")
        }
    }

    // Use when with Operation Sign
    when {
        burgerOdered <= 0 -> println("None ordered")
        burgerOdered % 2 == 1 -> println("Odd number ordered")
        burgerOdered % 2 == 0 -> println("Even number ordered")
    }

    // While loop
    var x = 0
    while (x < 10) {
        println("x = $x")
        x += 3
    }

    // Do while loop
    do {
        println("do while x = $x")
        x -= 3
    } while (x > 0)

    // For loop int
    for (item in 0..9) {
        println("$item, ")
    }

    // For loop String
    for (ch in "mystring") {
        println(ch)
    }

    var ndx = 0
    for (item in 10.rangeTo(20).step(2)) {
        print("${++ndx}) $item, ")
    }

    println()

    // for with index
    for ((index, item) in 10.rangeTo(20).step(2).withIndex()) {
        print("${index + 1}) $item, ")
    }
    println()

    // for loop with array
    val myArray = arrayOf(10, 20, 30, 40, 50)
    for (item in myArray.indices) {
        println("At index $item is the ${myArray[item]}")
    }

    println("myFunction = ${myFunction(10, 20)}")
    println("myFunction1 = ${myFunction1(10, 20)}")
    println("myFunction2 = ${myFunction2(10, 20)}")

    myDefault(10, 20, "Hello")
    myDefault(message = "Greetings")
}

// difference style of function, but result is the still the same
fun myFunction(param1: Int, param2: Int): Int {
    return param1 + param2
}

fun myFunction1(param1: Int, param2: Int): Int = param1 + param2
fun myFunction2(param1: Int, param2: Int) = param1 + param2
fun myDefault(param1: Int = 1, param2: Int = 5, message: String = "Hi"): Int{
    val result = param1 + param2
    println(message)
    return result
}


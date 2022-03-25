class Car {
    var brand = ""
    var model = ""
    var year = 0
}

class Bike(var brand: String, var model: String, var year: Int) {
    // Class function
    fun kemudi() {
        println("Ngeng..!")
    }

    // Class function with parameters
    fun kecepatan(kecepatanmaksimal: Int) {
        println("Kecepatan Maksimal Adalah : " + kecepatanmaksimal)
    }
}
open class MyParentClass {
    val x = 5
}

// Subclass
class MyChildClass: MyParentClass() {
    fun myFunction() {
        println(x) // x is now inherited from the superclass
    }
}
fun main() {
    val c2 = Car()
    c2.brand = "BMW"
    c2.model = "X5"
    c2.year = 1999
    var c1 = Car()
    c1.brand = "Ford"
    c1.model = "Mustang"
    c1.year = 1969

    println(c1.brand)
    println(c1.model)
    println(c1.year)

    println(c1.brand)
    println(c2.brand)

    val b1 = Bike("Polygon", "Polymoly", 2050)

    println(b1.brand + " " + b1.model + " " + b1.year)

    b1.kemudi()
    b1.kecepatan(200)

    val myObj = MyChildClass()
    myObj.myFunction()
}

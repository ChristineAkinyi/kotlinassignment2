fun main() {
    printName("Christine")
    modulus(6, 9)
    addFourNumbers(2, 8, 13, 278)
    println("I enjoy watching vlogs and documentaries")
}

fun printName(name: String){
    var greeting = "Hello ${name}"
    println(name)
}

fun modulus(num1: Int, num2:Int): Int{
    var num1 = 6
    var num2 = 9
    var return = num1 % num2
    return return
}

fun addFourNumbers(num1: Int, num2: Int, num3: Int, num4: Int): Int{
    var num1 = 2
    var num2 = 8
    var num3 = 13
    var num4 = 278
    var sum = num1+num2+num3+num4
    return sum
}

fun funFact(message: String){
    }

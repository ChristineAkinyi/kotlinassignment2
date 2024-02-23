fun main() {
    printName("Hello Christine")
    modulusTwoNumbers(6, 9)
    addFourNumbers(2, 8, 13, 278)
    print("I enjoy watching vlogs and documentaries")
}

fun printName(name: String){
    var name = "Hello Christine"
    println(name)
}

fun modulusTwoNumbers(num1: Int, num2:Int): Int{
    var num1 = 6
    var num2 = 9
    var modulus = num1 % num2
    println(modulus)
    return modulus
}

fun addFourNumbers(num1: Int, num2: Int, num3: Int, num4: Int): Int{
    var num1 = 2
    var num2 = 8
    var num3 = 13
    var num4 = 278
    var sum = num1+num2+num3+num4
    println(sum)
    return sum
}

fun print(message: String){
    var message = "I love sharing my stories through podcasting"
    println(message)
}

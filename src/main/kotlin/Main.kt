import kotlin.math.max

fun main() {
    greetperson("Hariet")
    modulus(14, 34)
    sum(44, 40, 13, 33)
    myself("I am a very curious person")

}

fun greetperson(name: String){
    println("Hello $name")
}
fun modulus( num1: Int, num2: Int): Int.Companion {
    var rem  = num1. rem(num2)
    println("$num1 / $num2 modulus " )
    return Int
}
fun sum(num1: Int , num2: Int , num3: Int ,num4: Int ): Int{
    var x= num1+num2+num3+num4
    println(x)
    return x
}
fun myself(sentence: String){
    println("$sentence")
}




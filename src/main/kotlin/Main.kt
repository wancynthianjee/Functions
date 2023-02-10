fun main(){
    greetperson( "Hariet")
    division(14, 34)
    sum( 44, 40, 13 , 33)
myself("I am a very curious persion")

}

fun greetperson(name: String){
    println("Hello")
}
fun division( num1: Int, num2: Int): Int{
    var results  = num1. rem(num2)
    println("$num1 / $num2 : results" )
    return results
}
fun sum(num1: Int , num2: Int , num3: Int ,num4: Int ): Int{
    var sum = num1+num2+num3+num4
    println(sum)
    return sum
}
fun myself(sentence: String){
    println("$sentence")
}




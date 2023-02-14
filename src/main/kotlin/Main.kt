fun main(){
    greetPerson( "Muna")
    greetPerson("Emma")
val modulus=division(200, 18)
    println(modulus)
 var sum=addition( 44, 15, 12, 20)
    println(sum)
    interestingFact("art")
}
 fun greetPerson(name: String){
     println("Hello $name")
 }
fun division( num1:Int, num2:Int):Int{
    val modulus= num1%num2
return(modulus)
}
fun addition(num1:Int, num2:Int, num3:Int, num4: Int): Int{
    var sum= num1+num2+num3+num4
    return(sum)
}
fun interestingFact(name: String){
println("I love $name")
}
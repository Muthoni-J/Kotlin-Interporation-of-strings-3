//creating a function of string to character
fun main(){
    char()
    introduction()
    length()
    greet()

}
  fun char(){
    var name = "akirachix"
    var n = name[0].toString()+ name[2]+ name[3]
     println(n)
}
//creating a function of parameters to string
 fun introduction(){
     var a = "Hi my name is Joan"
     var b = " and I am 23 years old"
     var stmt = a+" "+b
    println(stmt)
 }
//creating a function that takes a string and returns its length
fun length(){
    var y= "I am tall"
    println(y.length)
}
//create a function that takes in your name and prints out that's me
fun greet(){
    var name = "Joan"
    if (name.equals("Joan")) {
        println("That's me!")
    }else{
        println("I dont know who that is")}
    }


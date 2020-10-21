fun main(args: Array<String>) {
   val Pearsons = Pearsons("John", 25)
   print("${Pearsons.message}"+"${Pearsons.firstName}"+
      "Welcome to the example of Secondary  constructor, Your Age is-${Pearsons.age}")
}
class Pearsons(val firstName: String, var age: Int) {
   val message:String  = "Hey!!!"
	constructor(name : String , age :Int ,message :String):this(name,age) {
   }
}
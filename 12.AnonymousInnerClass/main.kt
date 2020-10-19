interface AnInClass {
   fun think()
}

fun main(args: Array<String>) {
   var programmer :AnInClass = object:AnInClass
    {
      override fun think() 
      { 
         print("Welcome Kotlin")
      }
   }
   programmer.think()
}
class Outer {
   private val ClassMessage: String = "Welcome Kotlin"
   inner class Nested {
      fun foo() = ClassMessage
   }
}

fun main(args: Array<String>) {
   val demo = Outer().Nested().foo()  
   print(demo)
}
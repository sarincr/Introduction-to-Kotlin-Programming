class Mains{
   class Nested {
      fun nestfun() = "Kotlin Nested Class"
   }
}

fun main(args: Array<String>) {
   val X = Mains.Nested().nestfun()
   print(X)
}


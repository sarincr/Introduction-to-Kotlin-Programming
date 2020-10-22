import java.util.Arrays

open class Master {
   open fun think () {
      print("Kotlin Master Class ")
   }
}
class Children: Master() { 
   override fun think() 
   {
      print("Kotlin Children Class")
   }
}
fun main(args: Array<String>) {
   var  a = Children()
   a.think()
}

import java.util.Arrays

open class Parents
{
   fun think () 
   {
      print("Kotlin Inheritence")
   }
}

class Children:Parents()
{  
}

fun main(args: Array<String>) 
{
   var  a = Children()
   a.think()
}
sealed class Class_Obj { 
  class OP1 : Class_Obj()
  class OP2 : Class_Obj() 
} 
fun main() { 
  val obj: Class_Obj = Class_Obj.OP2()  
  val output = when (obj) {  
    is Class_Obj.OP1 -> "Option One has been chosen" 
    is Class_Obj.OP2 -> "Option Two has been chosen" 
  } 
  println(output) 
}

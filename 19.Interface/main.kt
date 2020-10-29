fun main(args: Array<String>) {
   val obj = InterfaceImp()
   println("My Variable Value is = ${obj.myVar}")
   print("Calling hello(): ")
   obj.hello()
   print("Message from the Website-- ")
   println(obj.absMethod())
}
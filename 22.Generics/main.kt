fun main() {
   var objet1 = genericsExample<Int>(10)
   var object2 = genericsExample<Double>(10.00)
   println(objet1)
   println(object2)
}
class genericsExample<out T>(input:T) {
   init {
      println("I am getting called with the value "+input)
   }
}
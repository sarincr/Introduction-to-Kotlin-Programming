class Class_A{
    var skills : String= "null"
    fun printMySkills(){
        print(skills)
    }
}
fun main() {
    var  a1= Class_A()
    a1.skills="Studies Java \n"
    a1.printMySkills()

    var  a2= Class_A()
    a2.skills="Studies SQL \n"
    a2.printMySkills()

    var  a3= Class_A()
    a3.skills=a1.addMySkills(a2)
    a3.printMySkills()
}
fun Class_A.addMySkills(a:Class_A):String{
    var a4=Class_A()
    a4.skills=this.skills + " " +a.skills
    return a4.skills
}

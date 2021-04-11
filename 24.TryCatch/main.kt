var a=10;  
var b=0;  

fun main(args: Array<String>){  
	println("Try catch exception Testing") 
    try { 
		println(a/b);  
    } 
	catch (e: ArithmeticException) 
	{ 
		println("Arithmetic exception catch") 
	} 
	 
}  
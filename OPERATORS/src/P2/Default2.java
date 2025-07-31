package P2;
/*import P1.*; */


/*public class Default2 {                              //Error when Accessing Default Modifier Class across Packages
	public static void main(String[] args) {
		Default o = new Default();
		
		o.display();
	}

}
*/



/*protected void display() {                            //errror
	System.out.println("Hello world");
}
}

class Default3 extends Default2{
	public static void main(String[] args) {
		Default2 obj = new Default3();
		obj.display();
	}
}*/
	
	


	
/*	import java.io.*;                  // Varargs in Java to pass a variable number of arguments to a method.

	class Default2 {
	  
	    // Method that accepts variable number           
	    // of String arguments using varargs
	    public static void Names(String... n) {
	      
	        // Iterate through the array 
	        // and print each name
	        for (String i : n) {
	            System.out.print(i + " ");   //for space
	        }
	        System.out.println();           //for new line
	    }

	    public static void main(String[] args) {
	      
	        // Calling the 'Names' method with 
	        // different number of arguments
	        Names("geek1", "geek2");           
	        Names("geek1", "geek2", "geek3");   
	    }
	}    
*/
//okk





/*
class Default2 {                          //Varargs with Integer Arguments                                       
	
	static void fun(int... a) {
	
	System.out.println("The number of arguments :" + a.length);

 for(int i : a)   //to start the loop
	 System.out.print(i + " ");
	 System.out.println();
	
	
}

public static void main(String args[]) {
    fun(100,566);
    fun(2,4,7,9);
    fun();
}}      
	
*/	




/*

class Default2{                                     // Varargs with Other Arguments
	
	static void fun2(String s,int...a) {
		System.out.println("String:" + s);
		System.out.println("The number of argument is:" + a.length);
		
		for(int i:a)
			System.out.print(i +" ");
		    System.out.println();
	}
	
	public static void main(String args[]) {
		fun2("Geeks", 100,300);
		fun2("ghhhjjjjj", 4,6);
		fun2("rtuuuuu");
	}
}


*/


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

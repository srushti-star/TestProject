package operators.java;

public class Assignment_operator {
     public static void main(String[] args) {
    	 
    	 int a = 5;
    	 System.out.println("a += 3: " + (a += 3));
    	 System.out.println("a -= 3: " + (a -= 3));
    	 System.out.println("a *= 3: " + (a *= 3));
    	 System.err.println("a /= 3: " + (a /= 3));
    	 System.out.println("a %= 3: " + (a %= 3));
    	 System.out.println("a &= 0b1010: " + (a &= 0b1010));
    	 System.out.println("a |= 0b1100: " + (a |= 0b1100));
    	 System.out.println("a ^= 0b1010: " + (a ^= 0b1010));
    	 System.out.println("a <<= 2: " + (a <<= 2));
    	 System.out.println("a >>= 2: " + (a >>= 2));
    	 System.out.println("a >>>= 2: " + (a >>>= 2));
    	 
     }
}

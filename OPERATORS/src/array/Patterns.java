package array;

public class Patterns {
	
	public static void main(String[] args) {
		
	//NESTED LOOP
		//it means inner loop inside outer loop

		
	/*	int n = 4;
		int m = 5;   */
		
		
		
		/*   *****
		 *   *****
		 *   *****
		 *   *****  
		 */
		
		//outer loop runs 4 times for 4 rows
    /*          for(int i = 1; i <= n; i++) {                    
       for(int j = 1; j <= m; j++) {
	    System.out.print("*");  
     }
     System.out.println();  } */
   
   /*   *****
    *   *   *                             //hallow rectangle
    *   *   *
    *   ***** 
    */
   
 /*  for(int i = 1; i <= n; i++) {
	  
	   
	      for(int j = 1; j <= m; j++) {
		   if( i == 1 || i == n || j == 1 ) {
			   System.out.print("*");   //for star
		   }else {
			   System.out.print(" "); }}       //for space
	   
	   
	   System.out.println(); }      //for take new row  */
		
		
		/*     *
		 *     **
		 *     ***
		 *     ****
		 */
		
	/*	for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	*/
		
		
		/*   ****
		 *   ***
		 *   **
		 *   *
		 */
		
	/*	for(int i = n; i >=1; i--) {
			for(int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}      */
	
		
		/*       *
		 *      **
		 *     ***
		 *    ****  
		 */
		
	/*	for(int i = 1; i <= n; i++ ) {
			
			//inner loop SPACE print
			for(int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			
			//inner loop STAR print
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			
		System.out.println();  }*/
	
	/*   1
	 *   1 2
	 *   1 2 3
	 *   1 2 3 4
	 *   1 2 3 4 5
	 */
	
	/*int n = 5;
	
	for(int i = 1; i <= n; i++) {
		
		// inner loop for numbers in each row
		for(int j = 1; j <= i ; j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	} */
		
		
		
		/*  1 2 3 4 5
		 *  1 2 3 4
		 *  1 2 3
		 *  1 2
		 *  1
		 */
	/*	int n = 5;
		
		for(int i = 1; i <= n; i++) {
			
			// inner loop for numbers in each row
			for(int j = 1; j <= n-i+1 ; j++) {
				System.out.print(j);
			}
			System.out.println();
		} */
		
		
		
		//FLOYDS TRIANGLE
		
		/*  1
		 *  2 3
		 *  4 5 6
		 *  7 8 9 10
		 *  1112131415
		 */
		
	/*	int n = 5;
		int number = 1;
		
		
		//they are just decide how many rows will print
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j <= i; j++) {
				System.out.print(number+" ");
				number++; //numbers will increase
			}
			System.out.println();
		}  */
	
		
		/*   1
		 *   0 1
		 *   1 0 1
		 *   0 1 0 1
		 *   1 0 1 0 1
		 */
	
	/*	int n = 5;
		
		for(int i = 1; i <=n; i++) {
			for(int j = 1; j <= i; j++) {
				int sum = i+j;
				if(sum % 2 ==0) {
				System.out.print("1");}
				else {
					System.out.print("0");
				}
			}
		System.out.println();}   */
		
		
		
		
		/*
		   
*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *
		
		 */
                   /*int n = 5;
		
          //UPPER HALF
		for(int i = 1; i <=n; i++) {
			
		        // FIRST PART
			for(int j = 1; j <= i; j++) {
	        System.out.print("*");}
				
			//SPACES
	          int space = 2 * (n-i);
	          for(int j = 1; j <= space; j++) {
					System.out.print(" ");}
			
			
	          //SECOND PART
			for(int j = 1; j <=i; j++) {
				System.out.print("*");}
			
			
			System.out.println(); }
			
			

        //LOWER HALF
		for(int i = n; i >=1; i--) {
			
		        // FIRST PART
			for(int j = 1; j <= i; j++) {
	        System.out.print("*");}
				
			//SPACES
	          int space = 2 * (n-i);
	          for(int j = 1; j <= space; j++) {
					System.out.print(" ");}
			
			
	          //SECOND PART
			for(int j = 1; j <=i; j++) {
				System.out.print("*");}
			
			
			System.out.println(); }      */
		
		
	/*	    *****
		   *****
		  *****
		 *****
		*****   */

		
/*		int n = 5;
		
		for(int i = 1; i <=n; i++) {
			
			for(int j =1; j <= n-i; j++) {
				System.out.print(" ");
			}
			
			
			for(int j = 1; j <=n ; j++) {
			System.out.print("*");
			} 
			System.out.println(); }
			                                 */
		
/*		
		    1 
		   2 2 
		  3 3 3 
		 4 4 4 4 
		5 5 5 5 5 
		*/

	/*	int n= 5;
		
		for(int i = 1; i <= n; i++) {
			
			  // FOR SPACES
			for(int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			
			 // print row numbers
			for(int j = 1; j <= i; j++) {
				System.out.print(i+" ");
			}
			
			System.out.println();
		}  */
		
		
int n= 5;
		
		for(int i = 1; i <= n; i++) {
			
			  // FOR SPACES
			for(int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			
			 // FIRST HALF NUMBERS
			for(int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			
			//SECOND HALF NUMBERS
			for(int j=2; j <= i; j++) {
				System.out.print(" ");
			}
			
			
     	System.out.println();	}
		
		
			
			
			
			
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}}
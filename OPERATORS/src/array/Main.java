package array;


public class Main {
	
	/*
	static class Student{
	 
	
		
	 int roll_no;
	 String name;
	 
	 Student(int roll_no,String name)
	 {
		 this.roll_no = roll_no;                          //CONSTRUCTOR
		 this.name = name;
	 }
	}

	 public static void main(String[] args)
	 {
		
		Student[] arr = new Student[7];
		
		
		        arr[0] = new Student(1,"Mahesh");
				arr[1] = new Student(2, "Aniket");
				arr[2] = new Student(3, "Shivraj");
				arr[3] = new Student(4, "Abhijeet");
				arr[4] = new Student(5, "Krishna");
				arr[5] = new Student(6, "Vishu");
				arr[6] = new Student(7, "Onkar");
				
				for(int i = 0; i < arr.length; i++)
					System.out.println("Element at index " + i + ":Roll no = " + arr[i].roll_no + ",Name =" + arr[i].name);
	
	*/
	
	
	
	/*
	class Student {
	    public String name;                //PUBLIC VARIABLE

	    Student(String name) {               //CONSTRUCTOR
	        this.name = name;
	    }

	    @Override
	    public String toString() {            //
	        return name;
	    }
	}
 
	public class Main{
	public static void main(String[] args) {
		
		Student[] myStudent = new Student[] {                         //THIS CREATES AN ARRAY OF OBJECTS
				new Student("Dharma"), new Student("Sanvi"), 
				new Student("Aishaa"), new Student("Prisha")
		};
		
		
		for(Student m : myStudent) {
			System.out.println(m);
		}}}
	*/

	
	
/*	public class Main{
	public static void main(String[] args) {

		int arr[] = new int[4];
		
		arr[0] = 20;
		arr[1] = 30;
		arr[2] = 40;
		
		System.out.println("Trying to access element outside the size of array");
		System.out.println(arr[5]);
	}}
	
	*/
	
	
	
	
	/*public class Main{
		public static void main(String[] args) {
			int[][] arr = new int[3][3];                            // 2D ARRAY
			
			System.out.println("Rows : " + arr.length);
			System.out.println("Columns : " + arr[0].length); */
	





/*
public static void main(String[] args) {
	
	int[][] arr = { { 2,9,5,7,8} ,{5,7,5,8,6} , {6,8,4,2,1,}};
	
	//NESTED LOOP
	for (int i = 0; i < 3; i++) {       // FOR ROWS                  
		for(int j = 0; j < 3; j++)  //FOR COLUMNS
			System.out.print(arr[i][j] + " ");
		System.out.println();
		
	} */




	    // Driver method
	    public static void main(String[] args) {
	        int arr[] = { 3, 1, 2, 5, 4 };

	        // passing array to method m1
	        sum(arr);
	    }

	    public static void sum(int[] arr)
	    {
	        // getting sum of array values
	        int sum = 0;

	        for (int i = 0; i < arr.length; i++)
	            sum += arr[i];

	        System.out.println("sum of array values : " + sum);
	    }
	}


















	
	
	
	
	
	  
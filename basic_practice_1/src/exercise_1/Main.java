package exercise_1;

public class Main {
	public static void main(String[] args) {
		int [] a,b,c; //declare 3 int arrays
		a = new int [10]; //a is a 10 element array
		b = new int [10]; //b is a 10 element array
		c = new int [10]; //c is a 10 element array
		
		//now we declare each array's content using a for loop
		
		for (int i=0; i<10; i++) {
			a[i] = i;
			b[i] = -i;
			c[i] = a[i] + b[i];
		}
		
	//print result	
		
	 System.out.println("i\t a[i]\t b[i]\t c[i]");
	 System.out.println("----------------------------");
	 
	 for (int i= 0; i<10; i++) {
		 System.out.println(i + "\t " + a[i] + "\t" +b[i] + "\t" + c[i]);
		 
	 }

	}

}

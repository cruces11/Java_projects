package exercise_2;

public class Main {
	public static void main(String[] args) {
		TestParameters tester = new TestParameters();
		//we declare or array
		int [][] b= {{1,2,3}, {4,5,6},{7,8,9}};
		//we print our initial array
		System.out.println("b before we call our method");
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				System.out.println(b[i][j]);
			}
			System.out.println("\n");
		}
		
		tester.testArray2D(b);
		//we print b after calling the method to compare
		System.out.println("b after the call to our method");
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				System.out.println(b[i][j]);
			}
			System.out.println("\n");
		}
	
	}

}

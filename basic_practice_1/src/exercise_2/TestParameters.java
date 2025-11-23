package exercise_2;

public class TestParameters {
	public void testArray2D(int [][] a) {
		//we design a method to test if 2d arrays behave as 1d arrays, for this, we cahnge every element to 100
		for (int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = 100;
			}
			
		}
	}

}

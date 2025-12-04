package square_matrix;

public class Int_Square_Matrix {
	private int[][] Matrix;
	private int capacity;
	
	
	//matrix builder
	public Int_Square_Matrix(int capacity) {
		//can't have 0 or less capacity
		if(capacity <= 0) {
			throw new IllegalArgumentException("There cannot be a 0 capacity matrix");
		}
		this.capacity = capacity;
		this.Matrix = new int[capacity][capacity];
		//we start the matrix with all 0s
		for(int i = 0; i<capacity; i++) {
			for(int j= 0; j<capacity; j++) {
				Matrix[i][j]=0;
			}
		}
	}
	
	//check the indexes and throw error if they're not valid
	public void checker(int line, int column) {
		if(line<0 || line>capacity-1 || column<0 || column>capacity-1 ) {
			throw new IndexOutOfBoundsException("The values aren't valid");
		}
	}

	
	//upload  value of a certain position
	public void upload(int value, int line, int column) {
		//pass the index values through our checker function
		checker(line,column);
		//if it's good we upload our matrix
		Matrix[line][column] = value;
	}
	
	//reset  value of a certain position
	public void reset( int line, int column) {
		//pass the index values through our checker function
		checker(line,column);
		//if it's good we reset the value in our matrix
		Matrix[line][column] = 0;
	}
	
	//check whether a value is stored in the matrix or not
	public boolean search(int value) {
		for(int i = 0; i<capacity; i++) {
			for(int j = 0; j<capacity; j++) {
				if(Matrix[i][j]==value) {
					
					return true;
				}
			}
		}return false;
	}
	//if a value appears more than once, we return how many times
	public int repetitions(int repetition, int value) {
		for(int i = 0; i<capacity; i++) {
			for(int j = 0; j<capacity; j++) {
				if(Matrix[i][j]==value) {
					repetition++;
		        }
	        }
        }return repetition;
	}
	
	//return the capacity of the matrix
	public int capacity() {
		return this.capacity;	
	}
	
	//return the matrix as a string
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < this.capacity; i++) {
		for (int j = 0; j < this.capacity; j++) {
		sb.append(this.Matrix[i][j]).append("\t");
		}
		sb.append("\n");
		}
		return sb.toString();
	}
	public static void main(String[] args) {
	    // Crear matriz 3x3
	    Int_Square_Matrix matriz = new Int_Square_Matrix(3);

	    // Actualizar algunos valores
	    matriz.upload(1, 0, 0);
	    matriz.upload(2, 1, 1);
	    matriz.upload(3, 2, 2);

	    // Imprimir la matriz
	    System.out.println("Matriz actual:");
	    System.out.println(matriz.toString());

	    // Buscar un valor
	    System.out.println("Buscar 2: " + matriz.search(2));

	    // Contar repeticiones del valor 0
	    
	    System.out.println("Repeticiones de 0: " + matriz.repetitions(0, 0));

	    // Resetear un elemento
	    matriz.reset(1, 1);
	    System.out.println("Después de resetear (1,1):");
	    System.out.println(matriz.toString());
	}


	
	
	
	
	
	
	
}

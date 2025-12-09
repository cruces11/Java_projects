package ex_1;
//this code corresponds to the structure of a node (value and pointer) of a simple linked list
public class Node {
	String data; //data of the node
	Node next; //pointer to next node
	
    //class builder
	Node(String str){
		data = str;
		next = null;
	}
	
	//toString method
	@Override
	public String toString() {
		return data;
	}

}

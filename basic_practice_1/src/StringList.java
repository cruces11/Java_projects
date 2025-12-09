package ex_1;

public class StringList {
	protected Node first; //first node of the list
	protected Node last;  //last node of the list
	protected int numElems; //number of elements in the list
	
	//builder
	public StringList() {
		first = null;
		last = null;
		numElems = 0;
	}
	//append
	public void add(String str) {
		Node node = new Node(str); //create a new node
		if(first==null) { //if it isn't the first node(list is empty)
			first = node;
			last = node;
		}else { //list isn't empty
			last.next = node;
			last = node;
		}
		numElems++;
	}
	//get (iterates through the nodes of the list until it gets to the desired node)
	public String get(int index) {
		int i;
		//if index is invalid return null
		if(index<0 || index>=numElems) {
			return null;
		}else {
			i = 0;
			Node aux = first; //set our aux node to the first position
			//iterate through the list until we find our desired value
			for(i=0; i<index; i++) {
				aux = aux.next;
			}
			return aux.data;
			
		}
		
	}
	//indexOf
	public int indexOf(String str) {
		
		int index = 0;
		Node aux = first;
		
		while(aux != null && aux.data != str) { //iterate through the list 
			aux = aux.next;
			index++;
		}
		
		if(aux == null) {
			return -1;
		}else {
			return index;
		}
	}
	
	//delete
	public boolean delete(int index) {
		
		Node prev, current;
		int i;
		
		if((index<0) || (index >=numElems)) { //manage invalid index cases
			return false;
		}
		
		//one element list case
		if (numElems == 1){
			first = null;
			last = null;
			return true;
		}
		
		//special case: first element erasing
		if(index==0) {
			first=first.next;
			return true;
		}
		
		//other cases
		prev = first;
		current = first;
		
		//loop to position the pointers
		for(i=0; i<index; i++) {
			prev=current;
			current=current.next;
		}
		
		//current points to the node we want to erase, prev to the previous, link prev with currents next
		prev.next=current.next;
		
		//adjust "last" pointer if needed
		if(last == current) {
			last=prev;
		}
		return true;
	}
	
	//size method
	public int size() {
		
		int elements=0;
		Node aux = first;
		
		//loop through the array until we get to the last element
		while(aux != null) {
			elements ++;
			aux = aux.next; //update the pointer
		}
	return elements;
	}
	
	
	@Override
	//toString method
	public String toString() {
		
		StringBuilder sb = new StringBuilder ("[");
		Node aux = this.first;
		//loop
		while(aux != null) {
			//add current value to string
			sb.append(aux);
			//if it isn't the last node, add a comma
			if(aux.next != null) {
				sb.append(",");
			}
			aux = aux.next;	
		}
		sb.append("]");
		return sb.toString();
	}
		
}
	


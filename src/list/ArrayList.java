package list;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class ArrayList<E> implements List<E>{
	private static final int cap=10; // Array starting capacity
	private E elements[] ;
	private int size;
	private  ParameterCheck p;
    public ArrayList() {
		
		this.elements =(E[]) new Object[cap];
		this.size = 0;
	}

	@Override
	public Iterator<E> iterator() {
		
		return new ListIterator<E>();
	}

	@Override
	public void add(E e) { // add to the arraylist
		if(size==elements.length){
		changeCapacity(cap);	
		}
		elements[size]=e;
		size++;
	}

	@Override
	public void add(int index, E e) {  // add in the index of the list
		p.checkRange(index, 0, this.size-1);
		if(size==elements.length){
			changeCapacity(cap);	
			}
		    moveDataOnePositionTR(index, size-1);
			elements[index]=e;
			size++;
	}

	@Override
	public boolean remove(E e) { //remove e in the list
		if(elements.length-size>cap){
			changeCapacity(-cap);	
			}
		 int count = 0;
		 Iterator<E> iter = iterator(); // iterator over current instance of list
		 while (iter.hasNext()) {// this will iterate exactly list.size() times - once for each element
			 
		 if (iter.next().equals(e)) { // iter.next() is another element of list
		    moveDataOnePositionTL(count+1,size-1); 
		    elements[size-1]=null;
			 size--;
		    return true;
		 }
		 count++;
	   }
		return false;
	}

	@Override
	public boolean remove(int index) {  // remove index in the list
		p.checkRange(index, 0, this.size-1);
		if(elements.length-size>cap){
			changeCapacity(-cap);	
			}
		moveDataOnePositionTL(index+1,size-1);
		elements[size-1]=null;
		size--;
        return true;
	}

	@Override
	public int removeAll(E e) {  // remove all e in the list
		if(elements.length-size>cap){
			changeCapacity(-cap);	
			}
		 int count = 0;
		 int rem=0;
		 Iterator<E> iter = iterator(); // iterator over current instance of list
		 while (iter.hasNext()) {// this will iterate exactly list.size() times - once for each element
			 
		 if (iter.next().equals(e)) { // iter.next() is another element of list
		    remove(e);
		    rem++;
		 }
		 count++;
	   }
		return rem;
	}

	@Override
	public E get(int index){ //get an element of the array
		p.checkRange(index, 0, this.size-1);
		
		return elements[index];
	}

	@Override
	public E set(int index, E e){ //set element in the array
		p.checkRange(index, 0, this.size);
		E ret=elements[index];
		elements[index]=e;
		return ret;
	}

	@Override
	public E first() { //return first position
		if (isEmpty()) return null; 
		return elements[0];
	}

	@Override
	public E last() {  // return last position
		if (isEmpty()) return null;
		return elements[size-1];
	}

	@Override
	public int firstIndex(E first) {
		 int count = 0;
		 Iterator<E> iter = iterator(); // iterator over current instance of list
		 while (iter.hasNext()) {// this will iterate exactly list.size() times - once for each element
			 
		 if (iter.next().equals(first)) { // iter.next() is another element of list
		    return count;
		 }
		 count++;
	   }
		return -1;
	}

	@Override
	public int lastIndex(E last) {
			 int count = 0;
			 Iterator<E> iter = iterator(); // iterator over current instance of list
			 while (iter.hasNext()) { // this will iterate exactly list.size() times - once for each element
				 
			 if (iter.next().equals(last)) { // iter.next() is another element of list
			    return count;
			 }
			 count++;
			}
			return count;
	
			
	}

	@Override
	public int size() {
		
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size==0;
	}

	@Override
	public boolean contains(E e) { // return true if contains e
 
			 Iterator<E> iter = iterator(); // iterator over current instance of list
			 while (iter.hasNext()) {// this will iterate exactly list.size() times - once for each element
			 if (iter.next().equals(e)){
				 return true;
			 }
			 }
			 return false;  // in this example, count will contain the number of occurrences of e		

	}

	@Override
	public void clear() { // clear of the list
		int i=0;
		Iterator<E> iter = iterator(); // iterator over current instance of list
		 while (iter.hasNext()) {// this will iterate exactly list.size() times - once for each element
		 elements[i]=null;
		 size--;
		 i++; 
		 }	
	}
	private void moveDataOnePositionTR(int low, int sup) { 
		// pre: 0 <= low <= sup < (element.length - 1)
		for (int pos = sup; pos >= low; pos--)
			elements[pos+1] = elements[pos]; 
	}

	// useful when removing an element from the list...
	private void moveDataOnePositionTL(int low, int sup) { 
		// pre: 0 < low <= sup <= (element.length - 1)
		for (int pos = low; pos <= sup; pos++)
			elements[pos-1] = elements[pos]; 
	}
	
	private void changeCapacity(int change) { 
		int newCapacity = elements.length + change; 
		E[] newElement = (E[]) new Object[newCapacity]; 
		for (int i=0; i<size; i++) { 
			newElement[i] = elements[i]; 
			elements[i] = null; 
		} 
		elements = newElement; 
	}
	
	
	private class ListIterator<E> implements Iterator<E>{ // iterator of array list
		private int currentPosition;
		
		
		public ListIterator(){
			this.currentPosition = 0;
			
		}
		@Override
		public boolean hasNext() {
			return this.currentPosition <size();
		}

		@Override
		public E next() {
			if (hasNext()) {
				return (E) elements[this.currentPosition++];
			}
			else {
				throw new NoSuchElementException();
			}
		}
	}
	
	

}

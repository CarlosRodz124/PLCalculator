package edu.uprm.ece.icom4035.list;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayList<E> implements List<E> {
	// current number of elements
	private int size;
	// elements in the array
	private E[] elements;
	// initial size of the array
	private static final int INITCAP = 5;
	
	public ArrayList(){
		this.size = 0;
		this.elements = (E[]) new Object[INITCAP];
	}
	private ArrayList(E[] arr, int s) {
		elements = arr;
		size = s;
	}
	


	@Override
	public Iterator<E> iterator() {
		ArrayIterator<E> e = new ArrayIterator<>(elements);
//		 ArrayList<E> arr =new ArrayList<>(); 
//			 for (int i =0;i<size;i++) {
//				 arr.add(elements[i]);
//			 }
//		 
//		return arr.iterator();
		return e;
	}
	
	public class ArrayIterator<E> implements Iterator<E> {

		private E[] arr;    // the array to iterate over
		private int current; 
		
		public ArrayIterator(E[] arr) { 
			this.arr = arr; 
			current = -1;
		}
		
		public boolean hasNext() {
			return current < arr.length-1;   
		}

		public E next() throws NoSuchElementException {
			if (!hasNext())
				throw new 
					NoSuchElementException("No more elements to iterate over."); 
			current++;
			return arr[current];
		}

		public void remove() throws UnsupportedOperationException {
			throw new UnsupportedOperationException(
					"Remove peration not implemented.");
			// do not implement
		}
	}

	@Override
	public void add(E obj) {
		// verify if we have room
				if (this.size() == this.elements.length) {
					// change capacity
					this.changeCapacity(2*this.size());
				}
				//add element at the end and increase list size by 1
				this.elements[this.size++] = obj;
	}

	@Override
	public void add(int index, E obj) {
		if ((index < 0) || (index > this.size())) {
			throw new IndexOutOfBoundsException();
		}
		// special case adding past the end by one spot
		// this is handled by add(e) as an append
		if (index == this.size()) {
			this.add(obj);
			return;
		}
		
		// we are are adding somewhere between [0, size()-1]
		// verify if we have room
		if (this.size() == this.elements.length) {
			// change capacity
			this.changeCapacity(2*this.size());
		}
		// move every element on or after position index one spot to 
		// the back to make room for new element 
		for (int i=this.size(); i > index; --i) {
			this.elements[i] = this.elements[i-1];
		}
		// add new element at position index
		this.elements[index] = obj;
		// increase list size
		this.size++;
	}
		

	@Override
	public boolean remove(E obj) {
		if(this.contains(obj)==false)return false;
		int found =this.firstIndex(obj);
		this.remove(found);
		return true;
	}

	@Override
	public boolean remove(int index) {
		if ((index < 0) || (index >= this.size())) {
			return false;
		}
		// copy all successors elements one step to the front
		for (int i=index; i < this.size() -1 ; ++i) {
			this.elements[i] = this.elements[i+1];
		}
		// reduce size of list and remove extra last reference
		this.elements[--this.size] = null;
		return true;
	}

	@Override
	public int removeAll(E obj) {
	 int count =0;
	 if (this.isEmpty())return 0;
	 for(int i=0 ; i<this.size;i++ ) {
		 if(elements[i].equals(obj)) {
			 this.remove(i);
			 count++;
		 }
	 }
		 
		return count;
	}

	@Override
	public E get(int index) {
		if ((index < 0) || (index >= this.size())) {
			throw new IndexOutOfBoundsException();
		}
		return this.elements[index];
	}

	@Override
	public E set(int index, E obj) {
	
		if ((index < 0) || (index >= this.size())) {
			throw new IndexOutOfBoundsException();
		}
		E result = this.elements[index];
		this.elements[index]  = obj;
		return result;
	
	}

	@Override
	public E first() {
		
		return elements[0];
	}

	@Override
	public E last() {
		
		return elements[size-1];
	}

	@Override
	public int firstIndex(E obj) {
		for (int i=0; i<this.size;i++) {
			if(this.elements[i].equals(obj))return i;
		}
		
		return -1;
	}

	@Override
	public int lastIndex(E obj) {
		for(int i=this.size;i>=0;i--) {
			if(this.elements[i].equals(obj))return i;
		}
		return -1;
	}

	@Override
	public int size() {
	
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		
		return this.size()==0;
	}

	@Override
	public boolean contains(E obj) {
		if(this.firstIndex(obj)!=-1)return true;
		
		return false;
	}

	@Override
	public void clear() {
		elements = (E[]) new Object[elements.length];
		size = 0;

		
	}
	private void changeCapacity(int newCapacity) {
		// allocate new array
		E[] newElements = (E[]) new Object[newCapacity];
		// copy all elements
		for (int i = 0; i < this.size(); ++i) {
			newElements[i] = this.elements[i];
		}
		// now make newElements the new array
		this.elements = newElements;
	}

}

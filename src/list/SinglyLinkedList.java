package list;


import java.util.Iterator;
import java.util.NoSuchElementException;

import list.SinglyLinkedList;




public class SinglyLinkedList<E> implements List<E> {
		private SNode<E> header; 
		private int length; 
		private ParameterCheck p;

		public SinglyLinkedList() { 
			header = new SNode<E>(); 
			length = 0; 
		}
		
		
	
	@Override
	    public Iterator<E> iterator() {
		
		return new ListIterator<E>();
	   }


		@Override
		public void add(E e) { // add to the list
		 if(isEmpty()) {
			 SNode<E> nuevo= new SNode(e);
			 header=new SNode(null,nuevo);
		 }
		 else {
		 int lastind;
		 SNode<E> nuevo= new SNode(e,null);
		 SNode<E> temp=header.getNext();
		 lastind=lastIndex(last());
		 for(int i=1;i<lastind;i++) {
			 temp=temp.getNext();		 
			 }
		  temp.setNext(nuevo);
		 }
		 length++;
		 
		}


		@Override
		public void add(int index, E e) {    // add index to the list
			p.checkRange(index, 0, this.length-1);
			SNode<E> temp=header;
			SNode<E> next;
			 for(int i=0;i<index;i++) {
				 temp=temp.getNext();		 
				 }
			 next=temp.getNext();
			SNode<E> nuevo= new SNode(e,next);
			temp.setNext(nuevo);
			length++;
			
			
		}


		@Override
		public boolean remove(E e) { // remove e
			 SNode<E> temp=header;
			 Iterator<E> iter = iterator(); // iterator over current instance of list
			 while (iter.hasNext()) {// this will iterate exactly list.size() times - once for each element
			 if (iter.next().equals(e)) { // iter.next() is another element of list
	             temp.setNext(temp.getNext().getNext());
	             length--;
				 return true;
			 }
			   temp=temp.getNext();
		     }
		  return false;
		}


		@Override
		public boolean remove(int index) { // remove index
			p.checkRange(index, 0, this.length);
			SNode<E> temp=header;
			 for(int i=0;i<index;i++) {
				 temp=temp.getNext();		 
				 }
			 temp.setNext(temp.getNext().getNext());
             length--;
			 return true;
			 
		}


		@Override
		public int removeAll(E e) { // remove all e in the list
			SNode<E> temp=header;
			 Iterator<E> iter = iterator(); // iterator over current instance of list
			 int count=0;
			 while (iter.hasNext()) {// this will iterate exactly list.size() times - once for each element
			 if (iter.next().equals(e)) { // iter.next() is another element of list
	             remove(e);
			 }
			   temp=temp.getNext();
		     }
		 return count;
		}


		@Override
		public E get(int index) { // get index of the list
			p.checkRange(index, 0, this.length-1);
			int count = 0;
			SNode<E> tmp = header.getNext();
			while(count!=index) {
				count++;
				tmp=tmp.getNext();
			}
			return tmp.getElement();
		}


		@Override
		public E set(int index, E e) {  //set in the singly
			p.checkRange(index, 0, this.length-1);
			SNode<E> temp=header.getNext();
			 for(int i=0;i<index;i++) {
				 temp=temp.getNext();
				 }
			E ntr=temp.getElement();
			 temp.setElement(e);
			return ntr;
		}


		@Override
		public E first() { //first position of the list
			
			return header.getNext().getElement();
		}


		@Override
		public E last() {  // last position of the list
			 Iterator<E> iter = iterator(); // iterator over current instance of list
			 while (iter.hasNext()) {// this will iterate exactly list.size() times - once for each elemens	
				 if(iter.next()==null){
					 return iter.next();
				 }
				}
			return null;
		}


		@Override
		public int firstIndex(E e) {
			
			 int count = 0;
			 Iterator<E> iter = iterator(); // iterator over current instance of list
			 while (iter.hasNext()) {// this will iterate exactly list.size() times - once for each element
				 
			 if (iter.next().equals(e)) { // iter.next() is another element of list
			    return count;
			 }
			 count++;
		     }
			return count;
		}


		@Override
		public int lastIndex(E e) {
			
			 int count = 0;
			 Iterator<E> iter = iterator(); // iterator over current instance of list
			 while (iter.hasNext()) {// this will iterate exactly list.size() times - once for each element
				 
			 if (iter.next().equals(e)) { // iter.next() is another element of list
			    return count;
			 }
			 count++;
		   }
			return count;
		}


		@Override
		public int size() {
			// TODO Auto-generated method stub
			return length;
		}


		@Override
		public boolean isEmpty() {
			
			return length==0;
		}


		@Override
		public boolean contains(E e) { // verify if contains e

			 Iterator<E> iter = iterator(); // iterator over current instance of list
			 while (iter.hasNext()) {// this will iterate exactly list.size() times - once for each element
			 if (iter.next().equals(e)){
				 return true;
			 }
			 }
			 return false; 
		}


		@Override
		public void clear() { // clear the list
			SNode<E> temp=header;
			Iterator<E> iter = iterator();
			while (iter.hasNext()) {
				SNode<E> temp2=temp.getNext();
				temp.setNext(null);
				temp.setElement(null);
				temp=temp2;
				iter.next();
			    
			}
			header.setNext(null);
			length=0;
		}



	private class ListIterator<E> implements Iterator<E>{ //iterator of the singly link list
		private SNode<E> curr = (SNode<E>) header.getNext() ; // node containing element to return on next next()
		public boolean hasNext() { return curr != null; }
		public E next() {
		if (!hasNext()) throw new NoSuchElementException("Iterator is completed");
		E etr=curr.getElement();
		curr=curr.getNext();
		return etr;
		}
	}
	
	
	private static class SNode<T> { // inner class of singly node class
		private T element; 
		private SNode<T> next; 
		public SNode() { 
			element = null; 
			next = null; 
		}
		public SNode(T data, SNode<T> next) { 
			this.element = data; 
			this.next = next; 
		}
		public SNode(T data)  { 
			this.element = data; 
			next = null; 
		}
		public T getElement() {
			return element;
		}
		public void setElement(T data) {
			this.element = data;
		}
		public SNode<T> getNext() {
			return next;
		}
		public void setNext(SNode<T> next) {
			this.next = next;
		}
	}

	
}

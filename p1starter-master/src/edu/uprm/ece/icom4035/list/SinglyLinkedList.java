package edu.uprm.ece.icom4035.list;

import java.util.Iterator;

public class SinglyLinkedList<E> implements List<E> {
	
	private static class Node<E>{
		private E element;
		private Node<E> next;
		public Node() {
			this.element = null;
			this.next = null;
		}
		public Node(E e, Node<E> N) {
			this.element = e;
			this.next = N;
		}
		public Node(E e)  { 
			this.element = e; 
			next = null; 
		}
		public E getElement() {
			return element;
		}
		public void setElement(E element) {
			this.element = element;
		}
		public Node<E> getNext() {
			return next;
		}
		public void setNext(Node<E> next) {
			this.next = next;
		}
	}
	// reference to first node in list
		private Node<E> head;
		private Node<E> tail;
		// current size of list
		private int size;

		public SinglyLinkedList() {
			this.size = 0;
			this.head = new Node<E>(null,tail);
			this.tail = new Node<E>();

		}
		

		
		


	@Override
	public Iterator<E> iterator() {
List<E> list = new ArrayList<E>();
		
		Node<E> current = this.head.getNext();
		
		while(current.getNext() != null) {
			list.add(current.getElement());
			current = current.getNext();
		}
		
		return list.iterator();
	}

	@Override
	public void add(E obj) {
		Node<E> newNode = new Node<E>();
		newNode.setElement(obj);
		if (this.isEmpty()) {
			// special case
			this.head.setNext(newNode);
			tail=newNode;
		}
		else {
			// list already has data
			tail.setNext(newNode);
			tail=newNode;
		}
		// increment list size
		this.size++;
		
	}

	@Override
	public void add(int index, E obj) {
		if ((index < 0) || (index >= this.size())) {
			throw new IndexOutOfBoundsException();
		}
		Node<E> nNode = new Node();
		nNode.setElement(obj);
		if(size==0) {
			tail=nNode;
			head.setNext(tail);
		}
		else {
			if (index == 0) {
				nNode.setNext(head.getNext());
				head.setNext(nNode);
				}
			else if (index == size) {
				tail.setNext(nNode);
				tail=nNode;
				}
			else {
				Node<E> current = this.head;
				for (int i = 0; i < index; i++) {
					current = current.getNext();
					}
				nNode.setNext(current.getNext());
				current.setNext(nNode);
				}
			}
		size++;
	}

	@Override
	public boolean remove(E obj) {
		if(!this.contains(obj))return false;
		Node<E> next =head;
		Node<E> ntr =null;
		while(next.getNext()!=null) {
			if(next.getNext().getElement().equals(obj)) {
				ntr=next.getNext();
				next.setNext(ntr.getNext());
				ntr.setElement(null);
				ntr.setNext(null);
				size--;
				return true;
			}
			else next=next.getNext();
		}
		
		return false;
	}

	@Override
	public boolean remove(int index) {
		if (this.isEmpty() || (index < 0 || index > this.size())) return false;
		Node<E> nNode = head, tmpNode = nNode.getNext();
		int i=0;
//		if(index==size) {
			while (tmpNode!=null || tmpNode.getElement()!=null) {
				if (i==index) {
					nNode.setNext(tmpNode.getNext());
					if(index == size-1)
						tail=nNode.getNext();
					tmpNode.setElement(null);
					tmpNode.setNext(null);
					size--;
					return true;
				}
				i++;
				nNode=tmpNode;
				tmpNode=tmpNode.getNext();
			}
//		}
//		else {
//			while (tmpNode!=tail) {
//			if (i==index) {
//				nNode.setNext(tmpNode.getNext());
//				tmpNode.setElement(null);
//				tmpNode.setNext(null);
//				size--;
//				return true;
//			}
//			i++;
//			nNode=tmpNode;
//			tmpNode=tmpNode.getNext();
//		}
//		}
		return false;
	}

	@Override
	public int removeAll(E obj) {
		if(this.isEmpty()) return 0;
		int x = 0;
		for(E e : this) {
			if(obj.equals(e)) {
				remove(e);
				x++;
			}
		}
		size = size-x;
		return x;

	}

	@Override
	public E get(int index) {
		if(this.isEmpty() || (index<0 || index>size-1)) return null;
		int x = 0;
//		for(E e : this) {
//			if(x == index) {
//				return e;
//			}
//			x++;
//		}
		Node<E> tmpNode = head.getNext();
		while (tmpNode != null || tmpNode.getElement() != null) {
			if (x==index) {
				return tmpNode.getElement();
			}
			else {
				x++;
				tmpNode = tmpNode.getNext();
			}
		}
		return null;
	}

	@Override
	public E set(int index, E obj) {
		if ((index < 0) || (index >= this.size())) {
			throw new IndexOutOfBoundsException();
		}
		int x=0;
		E nNode = null;
		Node<E> tmpNode = head.getNext();
		while (tmpNode != null) {
			if (x==index) {
				nNode=tmpNode.getElement();
				tmpNode.setElement(obj);
				return nNode;
			}
			else {
				x++;
				tmpNode = tmpNode.getNext();
			}
		}
		return null;
	}

	@Override
	public E first() {
		if (this.isEmpty()) {
			return null;
		}
		return head.getNext().getElement();
	}

	@Override
	public E last() {
		if (this.isEmpty()) {
			return null;
		}
		return tail.getElement();
	}

	@Override
	public int firstIndex(E obj) {
		if(!this.contains(obj))return -1;
		Node<E> next =head;
		int index=0;
		while(next.getNext()!=null) {
			if(next.getNext().getElement().equals(obj)) {
				return index;
			}
			else next=next.getNext();
			index++;
		}
		return index;
	}

	@Override
	public int lastIndex(E obj) {
		if(!this.contains(obj))return -1;
		Node<E> next =head;
		int index=0;
		int found=0;
		while(next.getNext()!=null) {
			if(next.getNext().getElement().equals(obj)) {
				found=index;
				index++;
				
			}
			else next=next.getNext();
			index++;
		}
		return found;
		
	}

	@Override
	public int size() {
	
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		
		return size==0;
	}

	@Override
	public boolean contains(E obj) {
		if(this.isEmpty()) return false;
		Node<E> n = this.head.getNext();
		while(n!=null) {
			if(n.getElement().equals(obj)) {
				return true;
			}
			n = n.getNext();
		}
		return false;
	}

	@Override
	public void clear() {
		head.setNext(tail);
		tail.setElement(null);
		size=0;

		
	}
	
}

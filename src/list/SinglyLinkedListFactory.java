package list;

public class SinglyLinkedListFactory<E> implements ListFactory{

	@Override
	public List newInstance() {
		return new SinglyLinkedList<E>();
	}

}

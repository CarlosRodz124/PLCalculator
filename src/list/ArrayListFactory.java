package list;

public class ArrayListFactory<E> implements ListFactory{

	@Override
	public List newInstance() {
		
		return new ArrayList<E>();
	}
	
}
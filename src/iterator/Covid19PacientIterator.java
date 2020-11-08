package iterator;

import java.util.Iterator;
import java.util.List;

import adapter.InvertedIterator;
import domain.Symptom;

public class Covid19PacientIterator implements InvertedIterator{
	List<Symptom> symptoms;
	int position=0;
	public Covid19PacientIterator(List<Symptom> s) {
		this.symptoms = s;
	}

	/*public boolean hasNext() {
		return position<symptoms.size();
	}

	public Object next() {
		Symptom symptom=symptoms.get(position);
		position++;
		return symptom;
	}*/

	@Override
	public Object previous() {
		// TODO Auto-generated method stub
		Symptom symptom= symptoms.get(position);
		position--;
		return symptom;
	}

	@Override
	public boolean hasPrevious() {
		// TODO Auto-generated method stub
		return position>=0;
	}

	@Override
	public void goLast() {
		// TODO Auto-generated method stub
		this.position=this.symptoms.size()-1;
	}

	
}

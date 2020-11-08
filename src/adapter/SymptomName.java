package adapter;

import java.util.Comparator;
import domain.Symptom;

public class SymptomName implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
	
		String izena =((Symptom)o1).getName();
		String izena2 =((Symptom)o2).getName();
		
		if(izena.compareTo(izena2)<0) {
			return -1;
		}else if(izena.compareTo(izena2)>0) {
			return 1;
			
		}else {
			return 0;
		}
	}
	

}

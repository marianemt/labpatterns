package adapter;

import java.util.Comparator;
import domain.Symptom;

public class SeverityIndex implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		int sev =((Symptom)o1). getSeverityIndex();
		int sev1 =((Symptom)o2). getSeverityIndex();
		
		if(sev>sev1 ) {
			return -1;
		}else if(sev<sev1) {
			return 1;
		}else {
			return 0;
		}
		
		
	}

}

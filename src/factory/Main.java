package factory;

import domain.Covid19Pacient;
import domain.Medicament;

public class Main {

	public static void main(String[] args) {
		SymptomFac f = new SymptomFac();
		Covid19Pacient p1=new Covid19Pacient("aitor", 35, f);
		new PacientSymptomGUI(p1);
		Medicament m= new Medicament("Ibuprofeno", f);
		MedicalGUI mgui = new MedicalGUI(m);
       
	}

}

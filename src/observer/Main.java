package observer;

import java.util.Observable;

import domain.Covid19Pacient;
import factory.SymptomFac;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		SymptomFac f = new SymptomFac();
		Observable pacient=new Covid19Pacient("xiker", 21, f);
		//Observable pacient2= new Covid19Pacient("mariane", 21);
		//Observable pacient3= new Covid19Pacient("maricarmen", 60);
		//PacientObserverGUI pacientGUI3= new PacientObserverGUI (pacient3);
		//PacientSymptomGUI frame3 = new PacientSymptomGUI (pacient3);
		//PacientThermometerGUI ther3 = new PacientThermometerGUI(pacient3);
		PacientObserverGUI pacientGUI= new PacientObserverGUI (pacient);
		//PacientObserverGUI pacientGUI2= new PacientObserverGUI (pacient2);
		PacientSymptomGUI frame = new PacientSymptomGUI (pacient);
		//PacientSymptomGUI frame2 = new PacientSymptomGUI (pacient2);
		PacientThermometerGUI ther = new PacientThermometerGUI(pacient);
		//PacientThermometerGUI ther2 = new PacientThermometerGUI(pacient2);
		SemaphorGUI sep = new SemaphorGUI(pacient);
		
		
	}


}

package observer;

import java.util.Observable;

import domain.Covid19Pacient;
import factory.SymptomFactory;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		SymptomFactory sf = new SymptomFactory();
		Covid19Pacient pacient1=new Covid19Pacient("aitor", 35, sf);
		new PacientObserverGUI (pacient1);
		new PacientSymptomGUI (pacient1);
		new PacientThermometerGUI (pacient1);
		Covid19Pacient pacient2=new Covid19Pacient("Anne", 22, sf);
		new PacientObserverGUI (pacient2);
		new PacientSymptomGUI (pacient2);
	}


}

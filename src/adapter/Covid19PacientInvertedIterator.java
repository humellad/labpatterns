package adapter;

import java.util.Vector;

import domain.Covid19Pacient;
import domain.Symptom;

public class Covid19PacientInvertedIterator implements InvertedIterator{
	
	private Vector<Symptom> sintomas;
	private int pos=0;

	public Covid19PacientInvertedIterator(Covid19Pacient p) {
		sintomas = new Vector(p.getSymptoms());
	}
	@Override
	public Object previous() {
		Symptom s = sintomas.get(pos);
		pos-=1;
		return s;
	}

	@Override
	public boolean hasPrevious() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void goLast() {
		pos=sintomas.size()-1;
		
	}

}

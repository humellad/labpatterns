package adapter;

import java.util.Comparator;
import java.util.Iterator;

import domain.Covid19Pacient;
import factory.SymptomFactory;

public class Main {

	public static void main(String[] args) {
		SymptomFactory sf = new SymptomFactory();
		Covid19Pacient p1=new Covid19Pacient("aitor", 35, sf);
		
		p1.addSymptomByName("cisnea", 2);
		p1.addSymptomByName("cealea", 1);
		p1.addSymptomByName("disnea", 3);
		
		Covid19PacientInvertedIterator i1 = new Covid19PacientInvertedIterator(p1);
		Comparator comparadorN = new NameComparator();
		Comparator comparadorS = new SeverityComparator();
		
		Iterator i = Sorting.sortedIterator(i1, comparadorN);
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		i1.goLast();
		i = Sorting.sortedIterator(i1, comparadorS);
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}

package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import domain.Covid19Pacient;
import domain.Symptom;
import factory.SymptomFac;
import adapter.*;

	public class Main {

		public static void main(String[] args) {
			SymptomFac f = new SymptomFac();
			Covid19Pacient p=new Covid19Pacient("Ane", 29, f);
			p.addSymptom(new Symptom("s1", 10, 50), 1);
			p.addSymptom(new Symptom("s2", 10, 30), 2);
			p.addSymptom(new Symptom("s3", 10, 80), 3);
			p.addSymptom(new Symptom("s4", 10, 90), 4);
			p.addSymptom(new Symptom("s5", 10, 10), 5);
			List<Symptom> s =new ArrayList<Symptom>();
			s.addAll(p.getSymptoms());
			//System.out.println(s);
			Covid19PacientIterator p1= new Covid19PacientIterator(s);
			/*Iterator i= Sorting.sortedIterator(p1,new SymptomName());
			System.out.println("Izenaren bidez ordenatuak:");*/
			Iterator i= Sorting.sortedIterator(p1,new SeverityIndex());
			System.out.println("SeverityIndex-aren arabera ordenatuak:");
			while(i.hasNext()) {
				System.out.println(i.next());
			}
				

		}

	}


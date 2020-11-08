package observer;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

import domain.Covid19Pacient;
import observer.PacientThermometerGUI.TemperatureCanvas;


public class SemaphorGUI extends JFrame implements Observer{
	private TemperatureCanvas1 gauges;
	/** stores the associated ConcreteSubject */
	public SemaphorGUI (Observable obs) {
		setSize(100, 100);
		setLocation(350,10);
		gauges = new TemperatureCanvas1(0,15);
		add("Center", gauges);
		//Color c=Color.green;
		//getContentPane().setBackground(c);
		//repaint();
		setVisible(true);
		obs.addObserver(this);
	}
	
class TemperatureCanvas1 extends Canvas {	
		
		public void set(int level) { current = level; }	
		public int get(){return current;}
		public int getMax(){return Max;}
		public int getMin(){return Min;}
		
		private int Max, Min, current;
		
		public TemperatureCanvas1(int min, int max){ Min = min; Max = max; }
		
		public void paint(Graphics g)
		{	
		    if (current<5) setBackground(Color.GREEN);
		     else if (current<10) setBackground(Color.YELLOW);
		      else setBackground(Color.RED);
		    //repaint();
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		Covid19Pacient p=(Covid19Pacient)o;
		// Obtain the current covidImpact to paint
		int farenheit = (int) p.covidImpact();
		// temperature gauge update
		gauges.set(farenheit);
		gauges.repaint();
	}
}     


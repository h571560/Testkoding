package no.hvl.dat100;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Omregning_fra_sekunder {
	
	/* < prosessen ved � omregne fra sekunder til timer, minutter og sekuner blir gjort
	 * ved at jeg f�rst deler antall sekunder som har blitt innf�rt med 3600, derretter for � f� minutter 
	 * tar jeg � f�r rest av sekunder som er innskrevet og 3600 og deler dette igjen p� 60 for � f� minutter.
	 * tilslutt tar jeg rest av sekundene som er skrevet inn p� 60 for � f� resterende sekunder som ikke 
	 * er delelig p� timer eller minutter.
	 * det vil bli slikt:
	 * timer= sekunder/3600
	 * minutter= %3600/60
	 * restsekunder = sekunder%60 
	 */

	public static void main(String[] args) {
		String tallTxt = showInputDialog("skriv inn antall sekunder du vil omregne til timer,minutter og sekunder:");
		int sekunder = parseInt(tallTxt);
		
		int timer = sekunder/3600;
		int minutter = sekunder%3600/60;
		int sekunder1 = sekunder%60;
		
		String u1 = "Du skrev inn: " + sekunder + " sekunder " + "\n" +
		"dette tilsvarer: " + timer + " timer " + minutter + " minutter" + " og " + sekunder1 + " sekunder!";
		showMessageDialog(null,u1);
		
		//utskirft til konsoll
		
		System.out.println("tiden ble: " + timer + " timer " + minutter + 
				" minutter" + " og "+ sekunder1 + " sekunder" );
		
		
		
				
		

	}

}

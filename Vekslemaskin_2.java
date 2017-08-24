package no.hvl.dat100;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class Vekslemaskin_2 {

	public static void main(String[] args) {
		
		String tallTxt = showInputDialog("Skriv inn pris på varen:");
		int pris = parseInt(tallTxt);
		String tallTxt2 = showInputDialog("Skriv inn beløpet du ønsker å betale med");
				int belop = parseInt(tallTxt2);
	
		int veksel = belop - pris; // veksel kunde skal få tilbake
		int ant1000kr = veksel/1000; // antall 1000-lapper
		int ant500kr = veksel%1000/500; //antall 500-lapper
		int ant200kr = veksel%500/200; //antall 200-lapper
		int ant100kr = veksel%500%200/100; //antall 100-lapper
		int ant50kr = veksel%200%100/50; // antall 50-lapper
		int ant20kr = veksel%100%50/20; // antall 20kr som kunden skal få tilbake
		int ant10kr = veksel%50%20/10; // antall 10kr som kunden skal få tilbake
		int ant5kr = veksel%20%10/5; // antall 5 kr 
		int ant1kr = veksel%5; //antall 1kr som kunden skal få tilbake
		
		
		if (ant10kr == 1) { // gjør slik at det ikke står "1 tikroninger" når man skal ha tilbake 1 tikroning
			String u2= "Du betalte med " + belop + " kr" + "\n" 
		    + "og prisen er " + pris + " kr" +  "\n" +
			"du skal da ha tilbake " + veksel + "kr" + "\n"			      
			+"det vil si " + ant1000kr + " tusenlapp(er)" + "\n" 
			+ ant500kr + " femhundrelapp(er)" + "\n" +
			ant200kr + " tohundrelapp(er)" + "\n" + 
			ant100kr + " hundrelapp(er) " + "\n" + 
			ant50kr + " femtilapp(er)" + "\n" + 
			ant20kr + " tjuekroning(er)" + "\n" +
			ant10kr + " tikroning" + "\n"+
			ant5kr + " femkroning(er)" + "\n" +
			" og " + ant1kr + " enkroning(er)";
		showMessageDialog(null,u2);}
					else {
						String u1 = "Du betalte med " + belop + " kr" + "\n" 
							    + "og prisen er " + pris + " kr" +  "\n" +
								"du skal da ha tilbake " + veksel + "kr" + "\n"			      
								+"det vil si " + ant1000kr + " tusenlapp(er)" + "\n" 
								+ ant500kr + " femhundrelapp(er)" + "\n" +
								ant200kr + " tohundrelapp(er)" + "\n" + 
								ant100kr + " hundrelapp(er) " + "\n" + 
								ant50kr + " femtilapp(er)" + "\n" + 
								ant20kr + " tjuekroning(er)" + "\n" +
								ant10kr + " tikroninger" + "\n"+
								ant5kr + " femkroning(er)" + "\n" +
								" og " + ant1kr + " enkroning(er)";
		showMessageDialog(null,u1);}
		
		// Utskrift til konsoll
		
		System.out.println(" total veksel ble: " + veksel + "kr");
		System.out.println("antall enkroninger ble:" + ant1kr);
		System.out.println("antall femkroninger ble:" + ant5kr);
		System.out.println("antall tikroninger ble: " + ant10kr);
		System.out.println("antall tjuekroninger ble: " + ant20kr);
		System.out.println("antallet femtilapper ble: " + ant50kr);
		System.out.println("antallet hundrelapper ble: " + ant100kr);
		System.out.println("antallet tohundrelapper ble: " + ant200kr);
		System.out.println("antallet femhundrelapper ble: " + ant500kr);
		System.out.println("antallet tusenlapper ble: " + ant1000kr);
		
		
	}
}
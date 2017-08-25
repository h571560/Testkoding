package no.hvl.dat100;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

//denne koden bytter verdi slik at x=y og y=x



public class X_og_Y_bytter {

	public static void main(String[] args) {
		String tallText = showInputDialog("skriv inn verdien til X:"); // ber bruker skrive inn verdi for x
		int x = parseInt(tallText);
		String tallText2 = showInputDialog("skriv inn verdien til Y:"); //ber bruker skrive inn verdi for y
		int y = parseInt(tallText2);
		
		int tempx = x; // må ha et tredje sted slik at man kan "sikulere"
		int y1 = x;
		int x1 = y;
		
		String u1 = "Den nye verdien av X er nå: " + x1 + "\n" +
		"Den nye verdien av Y er nå: " + y1 ; // viser de nye verdiene til x og y
		showMessageDialog(null,u1);
		
		//print til konsoll
		
		System.out.println("ny verdi x: " + x1);
		System.out.println("ny verdi y: " + y1);
		
				
		
		
	}

}


import javax.swing.*;
public class Java2b_Aufgabe_2
{	
	private int number_01;
	private int number_02;
	private int temporary_result;
	public void getNumber()
	{
		number_01 = Integer.valueOf(JOptionPane.showInputDialog("Bitte machen Sie Ihre Eingabe. Zahl 1:"));
		number_02 = Integer.valueOf(JOptionPane.showInputDialog("Bitte machen Sie Ihre Eingabe. Zahl 2:"));
	}
	public void division()
	{
		temporary_result=number_01/number_02;
	}
	public void printResult()
	{
		System.out.println("Ergebnis betragt: "+temporary_result);
	}
	public static void main(String[] args)
	{
		Java2b_Aufgabe_2 object_aufgabe_2 = new Java2b_Aufgabe_2();
		System.out.println("/* ####################################################");
		System.out.println("Einsendeaufgabe 2.2 ");
		System.out.println("#################################################### */");
		object_aufgabe_2.getNumber();
		object_aufgabe_2.division();
		object_aufgabe_2.printResult();
	}
}

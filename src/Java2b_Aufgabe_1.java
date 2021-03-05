
public class Java2b_Aufgabe_1
{	
	String line_01;
	String line_02;
	public static void print_function(String str, int repeat_number)
	{
		for (int i=0 ; i<repeat_number ; i++)
		{
			System.out.println(str);
		}
	}
	public static void main(String[] args)
	{
		Java2b_Aufgabe_1 object_aufgabe_1 = new Java2b_Aufgabe_1();
		object_aufgabe_1.line_01 = "	\"	";
		object_aufgabe_1.line_02 = "#		#";
		System.out.println("/* ####################################################");
		System.out.println("Einsendeaufgabe 2.1 ");
		System.out.println("#################################################### */");
		print_function(object_aufgabe_1.line_01, 2);
		print_function(object_aufgabe_1.line_02, 5);
		print_function(object_aufgabe_1.line_01, 2);
		print_function(object_aufgabe_1.line_02, 5);
		print_function(object_aufgabe_1.line_01, 2);
	}
}

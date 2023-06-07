package Strings;

public class PrettyPrinting {

	public static void main(String[] args) {
	    float a = 365.32568f;
	    System.out.println(a);
	    System.out.printf("Formated number is: %.2f\n",a);

	    System.out.println(Math.PI);
	    System.out.printf("PIE: %.3f\n",Math.PI);
	    
	    System.out.printf("Hello my name is %s. %n my blood group is %c ","abc", 'B');
	}

}

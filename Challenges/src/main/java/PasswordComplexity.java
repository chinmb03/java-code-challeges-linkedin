import java.util.Scanner;

public class PasswordComplexity {

    public static boolean isPasswordComplex(String password) {
    	boolean isUppercase=false;
    	boolean isLowercase=false;
    	boolean isDigit=false;
    	for(int i=0;i<password.length() || (!isUppercase && !isLowercase && isDigit);i++) {
    		
    			Character c=password.charAt(i);
    			if(Character.isUpperCase(c)) isUppercase=true;
    			if(Character.isLowerCase(c)) isLowercase=true;
    			if(Character.isDigit(c)) isDigit=true;
    	
    	}
        return isUppercase && isLowercase && isDigit;
    }

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter a password: ");
       String userInput = scanner.nextLine();
       System.out.println("Is the password complex? " +
               isPasswordComplex(userInput));
    }
}

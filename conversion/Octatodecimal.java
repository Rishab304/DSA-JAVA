import java.util.Scanner;

public class Octatodecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octalString = scanner.nextLine();
        int decimalValue = Integer.parseInt(octalString, 8);
        System.out.println("The decimal value of octal " + octalString + " is: " + decimalValue);
        scanner.close();
        
        /*decimal = decimal/ target base
        octal = octal/ 8
        hexadecimal = hexadecimal/ 16
        binary = binary/ 2
        */
    }
    
}

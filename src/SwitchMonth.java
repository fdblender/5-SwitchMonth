import java.util.Scanner;

/* SwitchMonth.java
 * F. Blendermann
 * Write a program using a switch statement to 
 * print the month names given the exact number of days in the month. 
 * If the user enters 30 then the program will display: 
 * "September April June November". 
 * If the user enters 9 then program will alert the user that 
 * no months have exactly 9 days.
 * 
 */
public class SwitchMonth {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); 
		int days = 0;
        String months;
        
        System.out.println("Enter the number of days in a month: ");
		days = keyboard.nextInt();
		
        switch (days) {
        	case 28: months = "February (non-leap year)";
        			break;
        	case 29: months = "February (leap year)";
					break;
            case 30: months = "September April June November";
                     break;
            case 31: months = "October, December, January, "
            		+ "February (except leap years), March, May, July, August";
                     break;
            default: months = "No months have exactly "+days+" days";
                     break;
        }
        System.out.println(months);

	}

}

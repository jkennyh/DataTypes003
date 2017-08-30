import java.util.InputMismatchException;
import java.util.Scanner;

public class DataTypes003Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.print("Input an integer between 0 and 1000: ");
			int num = input.nextInt();
			input.close();
			
			if(num >= 0 && num <= 1000) {
				int result = handle(num);
				System.out.println("The sum of all digits in " + num + " is " + result);
			}
			else
				System.err.println("Error: Invalid input");
		} catch(InputMismatchException e) {
			System.err.println("Error: Invalid input");
			input.close();
		}
	}

	private static int handle(int num) {
		String tmp = "" + num;
		int size = tmp.length();
		int result = 0;
		
		for(int i = 0; i < size; ++i) {
			result += Integer.parseInt(tmp.substring(i, i + 1));
		}
		
		return result;
	}

}

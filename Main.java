package firstprogram;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("new line \n New lint");
		System.out.print("\n");
		System.out.println("new line");
		System.out.println("Enter password:");
		Scanner userEntry = new Scanner(System.in);
		
		
		String pw = userEntry.nextLine();
		
		//String pw = userEntry.nextLine();
		//String pw = System.console().readLine();		
		
		if(!(pw.contains("a")||pw.contains("b"))) {
			System.out.println("Error");
		}
		else if (!(pw.contains("A")||pw.contains("B"))){
				System.out.println("Error");
			}
		else if (!pw.contains("!")) {
			System.out.println("Error");
		}
		else if (pw.length() < 7) {
			System.out.println("Error");
		}
		else if (pw.length() > 12) {
			System.out.println("Error");
		}
		else {
			System.out.println("Success");
		}
	}
}

		
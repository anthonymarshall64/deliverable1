package firstprogram;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class deliverable1 {
	public static void main(String[] args) {
		
		System.out.println("Create a password:");
		Scanner userEntry = new Scanner(System.in);
		
		
		String pw = userEntry.nextLine();
		
		//String pw = userEntry.nextLine();
		//String pw = System.console().readLine();		
		
		if(!(pw.contains("a")||pw.contains("b")||pw.contains("c")||pw.contains("d")||pw.contains("e")||pw.contains("f")||pw.contains("g")||pw.contains("h")||pw.contains("i")||pw.contains("j")||pw.contains("k")||pw.contains("l")||pw.contains("m")||pw.contains("n")||pw.contains("o")||pw.contains("p")||pw.contains("q")||pw.contains("r")||pw.contains("s")||pw.contains("t")||pw.contains("u")||pw.contains("v")||pw.contains("w")||pw.contains("x")||pw.contains("y")||pw.contains("z"))) {
			System.out.println("Error");
		}
		else if (!(pw.contains("A")||pw.contains("B")||pw.contains("C")||pw.contains("D")||pw.contains("E")||pw.contains("F")||pw.contains("G")||pw.contains("H")||pw.contains("I")||pw.contains("J")||pw.contains("K")||pw.contains("L")||pw.contains("M")||pw.contains("N")||pw.contains("O")||pw.contains("P")||pw.contains("Q")||pw.contains("R")||pw.contains("S")||pw.contains("T")||pw.contains("U")||pw.contains("V")||pw.contains("W")||pw.contains("X")||pw.contains("Y")||pw.contains("Z"))){
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
			System.out.println("Password valid and accepted");
		}
	}
}

		
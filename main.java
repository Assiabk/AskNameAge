package Github_Projects;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
System.out.println("What's Your name?");
String name=scan.nextLine();
System.out.println("What's your age ?");
int age=scan.nextInt();
System.out.println("Hello,"+name);
System.out.println("You are"+age+"years old");
	}

}

package loopsconditions;

import java.util.Scanner;

public class Agetype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter age");
		age= scanner.nextInt();
		scanner.close();
		
		if (age>=13 && age<=19)
			System.out.println("teen");
		else if (age<13)
			System.out.println("kid");
		else
			System.out.println("adult");
	}

}

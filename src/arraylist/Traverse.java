package arraylist;

import java.util.ArrayList;

public class Traverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> num = new ArrayList<>();
		num.add(5);
		num.add(45);
		num.add(78);
		num.add(15);
		num.add(89);
		num.add(9);
		
		//int Studs[] = new int[10];
		//Studs[0] = 10;
 		
		System.out.println("Printing by using regular For loop");
		for (int i =0; i<num.size(); i++) {
			
			System.out.println(num.get(i));
		}
		System.out.println("Printing by using enhanced For loop");
		for (Integer i : num){
			System.out.println(i);
		}
	}

}

package arraylist;

import java.util.ArrayList;

public class RemoveLastelement {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> num = new ArrayList<>();
		num.add(5);
		num.add(45);
		num.add(78);
		num.add(15);
		num.add(89);
		num.add(9);
		
		
		//System.out.println(num.size());
		System.out.println("Printing Before removal of last element");
		for (int i =0; i<num.size(); i++) {
			
			System.out.println(num.get(i));
		
		}
		
		num.remove(num.size()-1); // removing last element here\
		
		System.out.println("Printing After removal of last element"); // here i am using enhanced for loop
		for (Integer i : num){
			System.out.println(i);;
		}
	}


}
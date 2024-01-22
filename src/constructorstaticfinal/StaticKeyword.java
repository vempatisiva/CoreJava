package constructorstaticfinal;

public class StaticKeyword {
	static int count=2;
	
	public static int Friends(){
		//Main.count = count;
		
		System.out.println("Printing static variable using static method "+ count);
		return count++;
	}

	public static void main(String[] args) {
		
		Friends();
		System.out.println(count);
		
	}

}

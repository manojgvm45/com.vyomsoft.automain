package JavaPractice;

public class CharOccurance {

	public static void main(String[] args) {
		
		String name = "Manoj Babu";
		name = name.replaceAll(" ", ""); //Relace space
		name= name.toLowerCase(); //Convert into lower case
		char[] ch = name.toCharArray(); //Convert into char array
		System.out.println(name); 
		
		
		
		
	}

}

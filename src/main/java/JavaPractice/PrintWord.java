package JavaPractice;

public class PrintWord {

	public static void main(String[] args) {
		String given = "i love india";
		
		String[] input = given.split(" ");

	for (String print : input){
		System.out.println(print);
	}

	}

}

package JavaPractice;

public class PalindromeorNot {

	public static void main(String[] args) {
		// Get the input and reverse that
		//Store the reverse
		//compare the reverse = input
		// equal means palindrome" not equal means "not a palindrome"
		
		PalindromeorNot palinDrome = new PalindromeorNot();
		palinDrome.palindromeString();
	
	}
	//verify the string is palindrome or not
	public void palindromeString () {
	String input = "radare";
	String reverse ="";
	for (int i = input.length()-1;i>=0; i--) {
		reverse = reverse+input.charAt(i);
	}
	if (input.equals(reverse)) {
		System.out.println("Given is Palindrome");
	} else {
		System.out.println("Given is not palindrome");
	}
		System.out.println(reverse);
		
	}
		

}

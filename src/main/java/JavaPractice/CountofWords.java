package JavaPractice;

public class CountofWords {

	public static void main(String[] args) {
		String str = "I love India and music and cricket";
		int count=0;
		str=str.toLowerCase();
		String[] str1=str.split(" ");
		//to find count of words
		int lengthCount = str1.length;
		System.out.println("length of array or count of words: "+ lengthCount);
		//to print those have more than 3 characters
		for (String string : str1) {
			int length = string.length();
			//System.out.println("char_length" + length);
			if (length>3) {
				System.out.println(string);
			}
			
		}

	}

}

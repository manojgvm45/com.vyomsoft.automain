
package JavaPractice;

public class ReverseSentence {

	public static void main(String[] args) {
		String str = "I love India";
		str=str.toLowerCase();
		String[] strArray = str.split(" ");
		
		for (int i=strArray.length-1; i>=0 ; i-- ) {
			System.out.print( strArray[i]+" ");
		}
		
	}

}

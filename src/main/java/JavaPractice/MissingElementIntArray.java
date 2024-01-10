package JavaPractice;

public class MissingElementIntArray {

	public static void main(String[] args) {
		int[] input = {1,2,4,5};
		int length  = input.length;
	//	int i=1;
	//	while (i<length) {
		//	System.out.println(input[i]);
		for (int i=1;i<length; i++) {
			if(input[i]-input[i-1]==1) {
			}
			else {
				System.out.println(input[i-1]+1);
			}
		//	i++;
		}
			
	}

}

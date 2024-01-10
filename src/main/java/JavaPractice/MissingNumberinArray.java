package JavaPractice;

public class MissingNumberinArray {

	public static void main(String[] args) {
		
		 
		 int[]  input = {1,2,3,5};

		System.out.println("missing: " + missingNum(input));
		 

	}
	
	public static int missingNum(int[] input) {
		 int n = input.length;
				 int sum =((n*(n+1))/2);
				 int sum1 = 0;
				// int missing =0;
		 System.out.println(sum);
		 for (int i=0; i<n; i++) 
			 sum1 += input[i];
		 System.out.println();
			 return sum1-sum;
		 
	}

}

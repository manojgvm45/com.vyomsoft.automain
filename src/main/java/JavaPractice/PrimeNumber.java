package JavaPractice;

public class PrimeNumber {

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter Input :");
		int num = 2;
		for (int i=2; i<num; i++) {
			if (num==0 && num ==1 && num==2) {
				System.out.println(num +"is a prime number");
			} else if (num%i == 0){
				System.out.println(num + "is a prime number");
			}
	
		}
		}

}

package JavaPractice;



public class PrintZeroinFront {

	
		
	
		public void firstmethod() {
			String s ="32400121200";
			String[] s1= s.split("");
			//1st method
			for (String string : s1) {
				//System.out.println(string);
				if(string.equals("0")) {
				String	zeroStr = string;
				System.out.print(zeroStr);
							} 
				
			}
			for (String string1 : s1) {
				//System.out.println(string);
				if(!string1.equals("0")) {
				String	zeroStrWo = string1;
				System.out.print(zeroStrWo);
							} 
				
			}
		}
		
		public void secondMethod() {
			//2nd method
			String s ="32400121200";
			String[] s1= s.split("");
			String zeroStr3 = "" ;
			String zeroStr4 = "";
			for (String string3 : s1) {
				//System.out.println(string);
				if(string3.equals("0")) {
				zeroStr3 += string3;
				//System.out.print(zeroStr3);
											}
				else {
					zeroStr4 += string3;
					//System.out.print(zeroStr4);
				
				}
				
			} System.out.println("Resulty : " +zeroStr3+zeroStr4);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		public void thirdMethod() {
			String str ="32400121200";
			char[] chArr = str.toCharArray();
			for (char c : chArr) {
				if (c=='0') {
					char zeroC= c++;
					System.out.print(zeroC);
				} else {
				char nonZeroC = c;
					System.out.print(nonZeroC);

				}
			}		
}

		public static void main(String[] args) {	
				PrintZeroinFront zeroinFront = new PrintZeroinFront();
				//zeroinFront.firstmethod();;

				zeroinFront.secondMethod();
		}
}
package Test1;

import java.util.Random;

public class stringOfRandomInt {
	public static String stringOfRandomInt(int n,int x,int y) {
		
		Random random=new Random();
		StringBuilder result = new StringBuilder();
		
		for(int i=0;i<n;i++) {
			int randomNumber=x+random.nextInt(y-x+1);
			//without import random:
			//int randomNumber = (int) (Math.random() * (y - x + 1)) + x; 
			result.append("<").append(randomNumber).append(">");
		}
		return result.toString();
		
		
	}

	public static void main(String[] args) {
		System.out.println(stringOfRandomInt(5,5,10));

	}
}
// int[] oddNumbers = {1, 3, 5, 7, 9};   // 第一位：奇数
// int[] evenNumbers = {0, 2, 4, 6, 8};  // 第二位：偶数
// int[] specialNumbers = {2, 5, 7, 9};  // 第三位：指定集合

// Random random = new Random();
// int firstDigit = oddNumbers[random.nextInt(oddNumbers.length)];
// int secondDigit = evenNumbers[random.nextInt(evenNumbers.length)];
// int thirdDigit = specialNumbers[random.nextInt(specialNumbers.length)];
	

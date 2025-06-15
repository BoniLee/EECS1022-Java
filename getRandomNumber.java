package WeeklyProgrammingQuiz1;

import java.util.*;

public class getRandomNumber {
	public static int  genRandomNumber() {
		int[] oddNumbers = {1, 3, 5, 7, 9};   // 第一位：奇数
        int[] evenNumbers = {0, 2, 4, 6, 8};  // 第二位：偶数
        int[] specialNumbers = {2, 5, 7, 9};  // 第三位：指定集合
        
        Random random = new Random();
        int firstDigit = oddNumbers[random.nextInt(oddNumbers.length)];
        int secondDigit = evenNumbers[random.nextInt(evenNumbers.length)];
        int thirdDigit = specialNumbers[random.nextInt(specialNumbers.length)];
        return firstDigit * 100 + secondDigit * 10 + thirdDigit;
	    
	}
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
		System.out.println(genRandomNumber());
	}

}
}
package Test2;

public class SumEvenNum {
	 public static int sumEvenOddIndexDigits(int num) {
		 String str=Integer.toString(num);
		 int sum=0;
		 for(int i=0;i<str.length();i++) {
			 if(str.charAt(i)=='0'||str.charAt(i)=='2'||str.charAt(i)=='4'||str.charAt(i)=='6'||str.charAt(i)=='8') {
			 //Integer.parseInt(str.charAt(i)) 不能直接使用，因为 str.charAt(i) 返回的是 char 类型
		     int digit=Character.getNumericValue(str.charAt(i));
			 sum+=digit;
			 
		 }
		 }
		 return sum;
		 
		 
	 }
	public static void main(String[] args) {
		System.out.println(sumEvenOddIndexDigits(5678));
		
		 //string convert to number
		 String stb= new String("1239");
		 int a=Integer.parseInt(stb);
		 System.out.println(a);
		 //number convert to string
		 int number = 456;
		 String sta = Integer.toString(number);
		 System.out.println(sta);

	}

}

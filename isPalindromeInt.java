package Test1;

public class isPalindromeInt {
	public static String isPalindromeInt(int n) {
		String stringn=Integer.toString(n);////将int n 转换string n
		StringBuilder reversedn= new StringBuilder(stringn).reverse();//再将string n转换成StringBulder，因为StringBulder可以用reverse
		
		if(stringn.equals(reversedn.toString())) {//两者相比需要把type转换成一致的, better toString()
			return "Integer "+ stringn +" is Palindrome";
		}else {
			
			return "Integer "+ stringn +" is NOt Palindrome";
		}
		
	}

	public static void main(String[] args) {
		System.out.println(isPalindromeInt(0));
		System.out.println(isPalindromeInt(10));
		System.out.println(isPalindromeInt(3635363));
		System.out.println(isPalindromeInt(121121));
		System.out.println(isPalindromeInt(112545214));
	}

}
//int n = Integer.parseInt(str); 将String 转 int
//String stringn=Integer.toString(n);////将int n 转换string n
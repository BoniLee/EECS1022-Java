package Test1;

public class MaxConsecutiveZeros {
	public static int lengthofMaxConsecutiveZeros(String str) {
		int count=0;
		int maxcount=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='0') {//attention add' '
				count++;
				maxcount=Math.max(maxcount,count);
			}else {
			count=0;//当遇到非零字符，重新计数
			}
		}
		return maxcount;
	}

	public static void main(String[] args) {
		System.out.println(lengthofMaxConsecutiveZeros("11101110001"));
		System.out.println(lengthofMaxConsecutiveZeros("10000001001"));
		System.out.println(lengthofMaxConsecutiveZeros("0000100111"));
		System.out.println(lengthofMaxConsecutiveZeros("01001010100111"));
}
}

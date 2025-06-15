package Test1;

public class stringCompressor {
	public static String stringCompressor(String inputStr) {
		if (inputStr.isEmpty()) {
			return "";
		}
		
		StringBuilder compress= new StringBuilder();
		int count=1;
		for(int i=0; i<inputStr.length()-1;i++) {
			//inputStr.length()-1:倒数后面第一个字符-->> i<inputStr.length()-1：不到倒数第一个字符，遍历到倒数后面第二个字符截。
			//i 只循环到 inputStr.length() - 1，它避免了访问最后一个字符和它后面的字符进行比较（最后一个字符没有后续字符可以比较）。
			if(inputStr.charAt(i)==inputStr.charAt(i+1)) {
				count++;
			}else {
				compress.append(inputStr.charAt(i)).append(count);
				count=1;			
			}
		}
		//如果最后一个字符和前一个字符一样，代码已经正确处理了，因为 count 变量会在 for 循环中累加，最后一个 append 语句会正确记录它的次数
		compress.append(inputStr.charAt(inputStr.length()-1)).append(count);
		return compress.toString(); //将stringbuilder 转成string.
		//String input=Integer.toString(num) 将int转成string
		
	}

	public static void main(String[] args) {
		System.out.println(stringCompressor(""));
		System.out.println(stringCompressor("bbbcfreb$b"));
		System.out.println(stringCompressor("bbbrrraaaaaazzzz"));

	}

}

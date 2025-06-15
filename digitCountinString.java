package Test1;

public class digitCountinString {
	public static int digitCountinString(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(digitCountinString("mystring123"));
		System.out.println(digitCountinString("123mystring123"));
		System.out.println(digitCountinString("123my25str047ing123"));

	}

}
//Character 类提供了一系列用于处理单个字符的方法，例如：

//Character.isDigit(char ch)：判断 ch 是否是一个数字字符（0-9）。
//Character.isLetter(char ch)：判断 ch 是否是一个字母（a-z 或 A-Z）。
//Character.toUpperCase(char ch)：将 ch 转换为大写字母。
//Character.toLowerCase(char ch)：将 ch 转换为小写字母。

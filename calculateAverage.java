package WeeklyProgrammingQuiz1;

import java.lang.reflect.Array;

public class calculateAverage {
	public static double calculateAverage(String input) {
		if (input == null || input.isEmpty()) {
	        return -99.0;
	    }

		//String 转 String[]:使用 split() 方法
	    String[] a = input.split(",");//通常会看到类似 String[] 或者 int[]，这样明确数组的类型和它的元素类型
	  // 将字符串 input 按照逗号（,）进行分割，并将分割后的子字符串存储到一个 String 数组 a 中。
	  // 可以使用任何字符或字符串作为分隔符
	  //使用数组，可以轻松地对每个分割后的元素进行遍历、修改、统计等操作
	    double sum = 0;
	    int count = 0;

	    for (String e : a) {//遍历a中的每个元素
	     sum += Integer.parseInt(e); //将一个字符串解析为一个整数（int），并累加
	     count++; // 计数
	     }
	    return Math.round((sum / count) * 100.0) / 100.0; // 计算平均值并四舍五入到小数点后两位
	}
	public static void main(String[] args) {
		System.out.println(calculateAverage("10,22,30"));
		System.out.println(calculateAverage("45,85,-75"));
		System.out.println(calculateAverage("10,20,35,"));
		System.out.println(calculateAverage(""));
		System.out.println(calculateAverage(null));
		}

}



package WeeklyProgrammingQuiz2;

import java.util.Arrays;

public class findAverage {
	public static String findAverage(int[] arr) {
		Arrays.sort(arr);//排序数组(从小到大）
		System.out.println(Arrays.toString(arr)); // 打印排序后的数组
		int n=arr.length;
		if(n==1) {//处理只有一个元素的情况
			return String.format("Average is %.2f", (double)arr[0]);
		}
		//计算第二小arr[1]和第二大arr[n-2]的平均值
		double average=(arr[1]+arr[n-2])/2.0;
		return String.format("Average is %.2f", average);
		
		
	}

	public static void main(String[] args) {
		int[] arr= {3, 8, 1, 6, 5};
		System.out.println(findAverage(arr));  
	}

}

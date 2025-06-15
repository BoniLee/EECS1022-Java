package Test2;
import java.util.*;

public class findExtrema {
	public static String findExtrema(int[][] array) {
		if(array==null) {
			return "[null array].";
		}
		
		//设置空数组来储存目标
		int[] rowsmax=new int[array.length];//存储每行(i）的最大值和最小值 → 需要 rows 个元素（即行数）
		int[] rowsmin=new int[array.length];
		int[] columnsmax=new int[array[0].length];//存储每列(j)的最大值和最小值 → 需要 cols 个元素（即列数）。
		int[] columnsmin=new int[array[0].length];
		
		System.out.println(Arrays.toString(rowsmin));
		System.out.println(Arrays.toString(rowsmax));
		System.out.println(Arrays.toString(columnsmin));
		System.out.println(Arrays.toString(columnsmax));
		
		// 初始化行最大最小值
		for(int i=0; i<array.length;i++) {
			rowsmax[i]=array[i][0];//初始化时，我们将每行的第一个元素array[i][0](定位）作为该行的最大值(single array[])
			rowsmin[i]=array[i][0];//初始化时，我们将每行的第一个元素array[i][0](定位）作为该行的最小值(single array[])
		}
		// 初始化列最大最小值
		for(int j=0;j<array[0].length;j++) {
			columnsmax[j]=array[0][j];//初始化时，我们将每列的第一个元素array[0][j](定位）作为该列的最大值(single array[])
			columnsmin[j]=array[0][j];//初始化时，我们将每列的第一个元素array[0][j](定位）作为该列的最小值(single array[])
		}
		// 遍历数组，计算最大值和最小值
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				//[i][j]是定位取值
				if(array[i][j]>rowsmax[i]) {
					rowsmax[i]=array[i][j];
				}
				if(array[i][j]<rowsmin[i]) {
					rowsmin[i]=array[i][j];
				}
				if(array[i][j]>columnsmax[j]) {
					columnsmax[j]=array[i][j];
				}
				if(array[i][j]<columnsmin[j]) {
					columnsmin[j]=array[i][j];
				}
			}
			
		}
		return 
		"The maximum values along the rows are " + Arrays.toString(rowsmax) + ".\n" +
        "The minimum values along the rows are " + Arrays.toString(rowsmin) + ".\n" +
        "The maximum values along the columns are " + Arrays.toString(columnsmax) + ".\n" +
        "The minimum values along the columns are " + Arrays.toString(columnsmin) + ".";
}


	public static void main(String[] args) {
		    int[][] testArray = {//建立testArray！
		        {1, 2, 3},
		        {4, 5, 6},
		        {7, 8, 9}
		    };
		    System.out.println(findExtrema(testArray));//在测试
		}

	}


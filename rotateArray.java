package Test2;
import java.util.*;

public class rotateArray {
	public static String rotateArray(int[][] originalArray) {
		// 检查数组是否为null
		if(originalArray==null){
			return "[null array].";
		}
		
		// 检查数组是否是正方形
		for(int i=0;i<originalArray.length;i++) {
			if(originalArray[i].length!=originalArray.length) {//行数！=列数
				return "[not a square array].";
			}
		}
		// 执行顺时针90度旋转(important)
		int[][]rotatedArray=new int[originalArray.length][originalArray.length];
		
		for(int i=0;i<rotatedArray.length;i++) {
			for(int j=0;j<rotatedArray[i].length;j++) {
				rotatedArray[j][originalArray.length-1-i]=originalArray[i][j];//题目已给
			}
			System.out.println(Arrays.deepToString(rotatedArray));
			
		}
		// 使用 Arrays.toString 格式化输出旋转后的数组
	    StringBuilder result = new StringBuilder();
	    for (int[] row : rotatedArray) {
	        result.append(Arrays.toString(row).replace("[", "").replace("]", "")).append("\n");// "\n"换行符
	    }

	    return result.toString().trim(); // switch result from StringBuilder to String, then 去掉最后的多余换行符
	}

	public static void main(String[] args) {
		 // 示例数组
        int[][] originalArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // 调用 rotateArray 方法并打印结果
        System.out.println(rotateArray(originalArray));
    }
	}


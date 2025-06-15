package Test2;

public class isMarkovMatrix {
	public static boolean isMarkovMatrix(double [][] m) {
		// 检查每个元素是否为正数
		for(int i=0;i<m.length;i++) {//遍历行
			for(int j=0;j<m[i].length;j++) {//遍历列
				if(m[i][j]<=0) {
					return false;
				}
			}
		}
		//检查每列的和是否为1
		for(int i=0;i<m.length;i++) {
			double columnSum = 0;
			for(int j=0;j<m[i].length;j++) {		
				columnSum+=m[i][j];
				if(columnSum!=1.0) {
					return false;
					}
				}
			}
		return true;
		}

	public static void main(String[] args) {
		 // 示例数组
		double[][] matrix = {
	            {0.5, 0.5},
	            {0.5, 0.5}
	        };

        // 调用 isMarkovMatrix 方法并打印结果
        System.out.println(isMarkovMatrix(matrix));

	}

}

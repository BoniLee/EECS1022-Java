package Test2;
import java.util.*;

public class findDistances {
	public static double [][] findDistances(double [][] m) {
		double[][] distance=new double[m.length][m.length];//[长度][长度]
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				//[i][j]=定位
				double x1=m[i][0],y1=m[i][1];
				double x2=m[j][0],y2=m[j][1];
				distance[i][j] = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
			}
		}
		return distance;
	}
	
	public static void main(String[] args) {
		double[][] coordinates = {
	            {1.0, 2.0}, 
	            {3.0, 2.0}
	        };

		System.out.println(Arrays.deepToString(findDistances(coordinates)));
}
}
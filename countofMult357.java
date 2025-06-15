package Test1;

public class countofMult357 {
	public static String countofMult357(int lowerLimit,int upperLimit) {
		if(lowerLimit>upperLimit) {
			return String.format("Error: lower limit (%d) is not less than or equal to upper limit (%d)", lowerLimit,upperLimit);
		}
		int count3=0;
		int count5=0;
		int count7=0;
		for(int i=lowerLimit;i<=upperLimit;i++) {
			if(i%3==0) {
				count3 ++;
			}
			if(i%5==0) {
				count5 ++;
			}
			if(i%7==0) {
				count7++;
			}
		}
		return String.format("Between (%d) and (%d) there are (%d) multiple of 3, (%d) multiple of 5 and (%d) multiple of 7", lowerLimit,upperLimit,count3,count5,count7);
	}

	public static void main(String[] args) {
		System.out.println(countofMult357(1,5));
		System.out.println(countofMult357(10,10));
		System.out.println(countofMult357(10,22));
		System.out.println(countofMult357(7,5));
		// TODO Auto-generated method stub

	}

}

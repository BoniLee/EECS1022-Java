package WeeklyProgrammingQuiz2;

public class arrayContains {
	public static String arrayContains(int[] array2, int n) {
		for(int i=0;i<array2.length;i++) {
			if(array2[i]==n) {
				return "Number "+n+" is there";
			}
		}
		return "Number "+n+" is not there";
		
	}

	public static void main(String[] args) {
		int[] array2= {9,10,3,4,3};
		System.out.println(arrayContains(array2,0));

	}

}

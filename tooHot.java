package WeeklyProgrammingQuiz1;

public class tooHot {
	
	public static boolean tooHot(int temperature, boolean isSummer) {
		int upperLimit;
		if(isSummer) {
			upperLimit=100;
		}else {
			upperLimit=90;
		}
		if(temperature>=60 && temperature<=upperLimit) {
			return true;
		}else {
			return false;
		}
	}
		
		public static void main(String[] args) {
			System.out.println(tooHot(70,false));
			System.out.println(tooHot(95,false));
			System.out.println(tooHot(95,true));
			System.out.println(tooHot(55,false));
			
		
}

}
//boolean return true and false.
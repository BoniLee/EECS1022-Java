package WeeklyProgrammingQuiz1;

public class alarmClock {

	public static String alarmClock(int day, boolean vacation) {
		if(day>=1 && day<=5) {
			if(vacation) {
				return "10:00";
				}else {
					return "7:00";
				}
		}else {
			return "10:00";
		}
	}
	public static void main(String[] args) {
		System.out.println(alarmClock(1,false));
		System.out.println(alarmClock(5,true));
		System.out.println(alarmClock(0,false));
		System.out.println(alarmClock(6,true));
	}
}

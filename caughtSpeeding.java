package WeeklyProgrammingQuiz1;

public class caughtSpeeding {
	 //* You are driving a car, and your speed is given as an integer.
	 //* The parameter isBirthday is true if it is your birthday.
	 //* Speeding tickets are determined as follows:
	 //* No ticket: speed less than or equal to 60 (65 if it is your birthday).
	 //* Small ticket: speed is between 61 and 80 (66 to 85 if it is your birthday).
	 //* Big ticket: speed greater than 80 (85 if it is your birthday).
	 //* Return:
	 //* integer value 0 to indicate that there is no ticket,
	 //* integer value 1 to indicate that there is a small ticket, and
	 //* integer value 2 to indicate that there is a big ticket.
	 //* 
	 //* Example calls:
	 //* caughtSpeeding(60, false) return 0
	 //* caughtSpeeding(65, false) return 1
	 //* caughtSpeeding(65, true) return 0
	 // * caughtSpeeding(85, true) return 1
	 //* caughtSpeeding(90, false) return 2
	 // * 
	
	public static  int caughtSpeeding(int speed, boolean isBirthday) {
		
		int noTicketLimit= isBirthday? 65:60;//upperlimit
		int smallTicketLimit= isBirthday? 85:80;//upperlimit
		// 判断速度情况并返回结果
	    if (speed <= noTicketLimit) {
	        return 0; // 无罚单
	    } else if (speed <= smallTicketLimit) {
	        return 1; // 小罚单
	    } else {
	        return 2; // 大罚单
	    }
	}
		
	

	public static void main(String[] args) {
		System.out.println(caughtSpeeding(60, false));
		System.out.println(caughtSpeeding(65, false));
		System.out.println(caughtSpeeding(65, true));
		System.out.println(caughtSpeeding(85, true));
		System.out.println(caughtSpeeding(90, false));
		

	}

}

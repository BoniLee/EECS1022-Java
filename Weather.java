package Test1;

public class Weather {
	public static String weather(int month,int day) {
		if(month==12 && day>=15 ||month==1 || month==2 || month==3 && day<=25) {
			return "The current weather season is Winter";
		}
		if(month==4 && day>=1 || month==5 && day<=31) {
			return "The current weather season is Spring";
		}
		if(month==6 && day>=1 || month==7 || month==8 || month==9 && day<=15) {
			return "The current weather season is Summer";
		}
		if(month==9 && day<=16 || month==10 || month==11 && day<=30) {
			return "The current weather season is Fall";
		}else {
			return "Unknow";
		}
	}

	public static void main(String[] args) {
		System.out.println(weather(12,20));
		System.out.println(weather(3,10));
		System.out.println(weather(4,15));
		System.out.println(weather(7,1));
		System.out.println(weather(10,1));
		System.out.println(weather(12,10));
		// TODO Auto-generated method stub

	}

}

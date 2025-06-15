package Test1;

public class mixStrings {
	public static String mixStrings(String s1,String s2,String s3) {
		if(s1.isEmpty()||s2.isEmpty()||s3.isEmpty()) {
			return "Invalid";
		}
		//s1
		String firstpart="";	
		if(s1.length()%2==0) {
			firstpart=s1.substring(0,s1.length()/2);//这里不能用return：否则之后的代码不会被执行，函数在这里就会返回。
		}else{
			firstpart=s1.substring(0,s1.length()/2+1);
		}
		//s2
		String secondpart="";
		if(s2.length()>=2) {
			secondpart=s2.substring(s2.length()-2).repeat(3);//倒数后面2个：s2.length()-2
		}else {
			secondpart=s2.substring(0,1).repeat(3);
		}
		//s3
		String thirdpart="";
		if(s3.length()>=2) {
			thirdpart=s3.substring(0,2).repeat(5);
		}else {
			thirdpart=s3.substring(0,1).repeat(5);
		}
		
		String result=firstpart+secondpart+thirdpart;
		return result;
	}

	public static void main(String[] args) {
		System.out.println(mixStrings("york","Hello","Time"));
		System.out.println(mixStrings("EECS-York","Hello EECS1022","Lab Time"));
		System.out.println(mixStrings("W","A","B"));
		System.out.println(mixStrings("","Sunday","Monday"));

	}

}

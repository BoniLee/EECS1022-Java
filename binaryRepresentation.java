package Test1;

public class binaryRepresentation {
	public static String binaryRepresentation(short value) {//short 只有 16 位，因此特别适合二进制操作
		StringBuilder result= new StringBuilder();
		//依次遍历 short 的 16 位，生成二进制表示
		for(int i=15;i>=0;i--) {
			if((value&(1<<i))!=0) {//检查 value 的第 i 位是否为 1，&:只有两个对应位都为 1，结果才是 1
				result.append("1");
			}else {
				result.append("0");
			}
			
		}
		return "The decimal value ("+value+") has binary representation ["+result.toString()+"]";//after for(){}
		
		
}
    public static void main(String[] args) {
	System.out.println(binaryRepresentation((short)15));
	System.out.println(binaryRepresentation((short)145));
	System.out.println(binaryRepresentation((short)205));
}
}
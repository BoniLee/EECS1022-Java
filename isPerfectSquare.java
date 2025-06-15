package Test1;

public class isPerfectSquare {
	public static String isPerfectSquare(int n) {
        for (int i = 0; i * i <= n; i++) { // 遍历可能的平方根
            if (i * i == n) {//如果我们前面选择i<n而不是i<=n,这里永远不会执行
                return "Integer " + n + " is Perfect Square";
            }
        }
        return "Integer " + n + " is NOT Perfect Square";
    }

	public static void main(String[] args) {
		System.out.println(isPerfectSquare(0));
		System.out.println(isPerfectSquare(10));
		System.out.println(isPerfectSquare(63));
		System.out.println(isPerfectSquare(64));
	}

}

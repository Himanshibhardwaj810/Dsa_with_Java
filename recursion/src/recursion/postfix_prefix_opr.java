package recursion;

public class postfix_prefix_opr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(5);

	}
	static void fun(int n) {
		if(n==0) {
			return;//pass first subtract then
		}
		System.out.println(n);
//		fun(n--);
		fun(--n);//subtract first pass then
	}

}

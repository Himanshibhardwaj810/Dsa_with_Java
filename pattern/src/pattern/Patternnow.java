package pattern;

public class Patternnow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		*
//		*1
//		*23
//		*456
//		*78910
		
		int num=1;
		for(int i=0;i<5;i++) {
			
			for(int j=0;j<=i;j++) {
				if(j==0) {
					System.out.print("*");
				}
				else {
					System.out.print(num);
					num++;
				}
			}
			System.out.println();
		}


//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j <= i; j++) {
//				if (j == 0 && i < 5) {
//					System.out.println("*");
//				}
//			}
//		}
//		int num = 1;
//		for (int k = 1; k < 5; k++) {
//			for (int j = 1; j <= k; j++) {
//				System.out.print(num);
//				num++;
//			}
//			System.out.println();
//		}

	}

}

package Strings;

public class AtoZ_performance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String series="";//here new object is created for every iteration
		//complexity O(n2)
	
		for(int i=0;i<26;i++) {
			char ch=(char)('a'+i);

			series=series+ch;
		}
		System.out.println(series);

	}

}

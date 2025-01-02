package Strings;

public class reverse_string_by_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="Servicenow";
		reverse(word);
		String word1="Service now himagvg";
		reversesplit(word1);

	}
	//Ist method
	public static void reverse(String str) {
		String part1=str.substring(0, 7);
		String part2=str.substring( 7);
		
		String Output=part2+" "+part1;
		System.out.println(Output);
	}
	//2nd method
	public static void reversesplit(String str) {
		String[] word=str.split(" ");
		StringBuilder reversed=new StringBuilder();
		for(int i=word.length-1;i>=0;i--) {
			reversed.append(word[i]);
			if(i>0) {
				reversed.append(" ");
			}
		}
		System.out.println(reversed.toString());
	}

}

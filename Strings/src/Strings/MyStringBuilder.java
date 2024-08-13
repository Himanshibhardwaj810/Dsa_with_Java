package Strings;

public class MyStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStringBuilder builder=new MyStringBuilder();
		for(int i=0;i<26;i++) {
			char ch=('a'+i);
			builder.append(ch);
		}
		System.out.println(builder.toString());

	}

}

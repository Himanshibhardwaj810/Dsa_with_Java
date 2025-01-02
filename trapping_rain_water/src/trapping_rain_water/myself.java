package trapping_rain_water;

public class myself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {3,0,1,0,4,0,2};
		System.out.println(trap(arr));

	}
	
	public static int trap(int[]arr) {
		int res=0;
		int[] left=new int[arr.length];
		int[]right= new int[arr.length];
		
		left[0]=arr[0];
		for(int i=1;i<arr.length;i++) {
			left[i]=Math.max(arr[i],left[i-1]);
		}
		right[arr.length-1]=arr[arr.length-1];
		for(int j=arr.length-2;j>=0;j--) {
			right[j]=Math.max(arr[j],right[j+1]);
		}
		for(int i=0;i<arr.length;i++) {
			res=res+(Math.min(left[i],right[i])-arr[i]);
		}
		return res;
	}

}

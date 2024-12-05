package trapping_rain_water;

public class problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {3,0,4,5,1,4};
		System.out.println(trap(arr));

	}
	static int trap(int[]arr) {
		int start=0;
		int end=arr.length-1;
		int[] left=new int[arr.length];
		int[] right=new int[arr.length];
		
		
		left[0]=arr[0];
		for(int i=1;i<arr.length;i++) {
			left[i]=Math.max(arr[i],left[i-1]);
		}
		right[end]=arr[end];
		for(int j=end-1;j>0;j--) {
			right[j]=Math.max(arr[j],right[j+1]);
		}
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			ans=ans+(Math.min(left[i],right[i]-arr[i]));
		}
		return ans;
	}

}

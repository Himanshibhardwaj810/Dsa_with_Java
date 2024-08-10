package twodarray;

public class another_bs_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//search inn the row provided between the columns provided
	static int[] binarysearch(int[][] arr,int row,int cstart,int cend,int target) {
		while (cstart<cend) {
			int mid=cstart+(cstart-cend)/2;
			if(arr[row][mid]==target) {
				return new int[] {row,mid};	
			}
			if(arr[row][mid]<target) {
				cstart=mid+1;  
			}else {
				cend=mid-1;
			}
		}
		return new int[] {-1,-1};
	}
	static int[] search(int[][] arr,int target) {
		int row=arr.length;
		int col=arr[0].length;
		
		if(row==1) {
			return binarysearch(arr,0,0,col-1,target );
		}
		//run the loop till 2 rows are remaining
		int rstart=0;
		int rend=row-1;
		int cmid=col/2;
		while(rstart<rend-1) {//more than two rows
			int mid=rstart+(rend-rstart)/2;
			if(arr  )
			
			
		}
		
		
		
		
	}

}

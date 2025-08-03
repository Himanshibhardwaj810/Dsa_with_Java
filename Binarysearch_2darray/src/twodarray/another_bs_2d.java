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
	static boolean search(int[][] matrix,int target) {
		 int rows=matrix.length;
	       int col=matrix[0].length;
	      for(int i=0;i<matrix.length;i++){//iterate through each row
	        int start=0;
	        int end=col-1;
	        while(start<=end){//apply binary search
	        int mid=start+(end-start)/2;
	        if(matrix[i][mid]==target){
	            return true;
	        }else if(matrix[i][mid]<target){
	            start=mid+1;
	        }else{
	            end=mid-1;
	        }
	      }
	      }
	    return false;
	    //complexity: o(nlogn)
		
		
		
	}

}

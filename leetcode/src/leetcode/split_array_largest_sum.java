package leetcode;

public class split_array_largest_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {2,3,1,2,4,3};
		int k=5;
		System.out.println(splitArray(nums,k));

	}
	
    static int splitArray(int[] nums, int k) {
    	int start=0;
    	int end=0;
    	for(int i=0;i<nums.length;i++) {//[10,32]
    		start=Math.max(start,nums[i]);
    		
    		end=end+nums[i];
    	}
    	//binary search
    	while(start<end) {
    		int mid=start+(end-start)/2;
    		//calculate how many piece you can divide with max sum
    		int sum=0;
    		int pieces=1;
    		for(int num:nums) {
    			//if the sum of element is exceeding then add it to another array and sum=num
    			if(sum+num>mid) {
    				sum=num;
    				pieces++;
    			}else {
    				sum=sum+num;
    			}
    			
    		}
    		if(pieces>k) {
    			start=mid+1;
    			
    		}else {
    			end=mid;
    		}
    	}
    	return end;//as start=end=mid
        
    }
}



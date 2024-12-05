package Two_sum_problem;
import java.util.HashMap;
import java.util.Arrays;

public class Two_sum_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		int[] result=twoSumsimple(nums,target);
		System.out.println(Arrays.toString(result));
		int[] result1=twoSum(nums,target);
		System.out.println(Arrays.toString(result1));

	}

	public static int[] twoSumsimple(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}

		return new int[] { 0, 0 };

	}
	//hashmap using
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer,Integer>map=new HashMap<>();//key contains nums[i] and value contains i
		for(int i=0;i<nums.length;i++) {
			int diff=target-nums[i];
			if(map.containsKey(diff)) {
				return new int[] {map.get(diff),i};
			}
			map.put(nums[i],i);
		}
		return new int[] {};
		
		
	}
}

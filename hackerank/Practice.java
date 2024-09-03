public class Practice {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        
        System.out.println(sum(arr));
    }
    public static int sum(int[] arr){
        int sum=0;
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];

        }
        return sum;

    }
    https://www.hackerrank.com/challenges/compare-the-triplets/problem?isFullScreen=true
    
}

package Java;

public class main {
    public static void main(String[] args) {
        int[] arr = {1, 112, 15, 97, 108, 19, 2};
        int max = arr[0]; // i can assume 0 but it can happen that -ve value exist
        System.out.println("+" + max);
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
             max = arr[i];
                
            }
        }
        
        System.out.println("The maximum element is " + max);
        System.out.println("The maximum element i9n the range is" + maxrange(arr, 1, 3));
    }
    static int maxrange(int[] arr, int start, int end) {
     if(arr==null || arr.length==0 ||start>end ) {
          return -1;
     
     }
     int max = arr[start];
     
     for (int i = start; i <= end; i++) {
          if (arr[i] > max) {
               max = arr[i];

          }

     }
     return max;

}
}

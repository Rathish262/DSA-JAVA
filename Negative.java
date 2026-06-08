public class Negative{
    public static void main(String[] args) {
        int []arr={-8,-3,-6,-2,-5,-4};
        int cur_sum=arr[0];
        int max_sum=arr[0];
        for(int i=1;i<arr.length;i++){
            
             cur_sum=Math.max(arr[i],cur_sum+arr[i]);
             max_sum=Math.max(max_sum,cur_sum);
        
       
    }
     System.out.println("NEGATIVE SUBARRAY"+max_sum);
}
}
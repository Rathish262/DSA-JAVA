public class Maxsubar {
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int start=0;
        int end=0;
        int tempstart=0;
        int max_sum=arr[0];
        int cur_sum=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>cur_sum+arr[i]){
                cur_sum=arr[i];
                tempstart=i;
            }
            else{
                cur_sum=cur_sum+arr[i];
            }
            if(cur_sum>max_sum){
                max_sum=cur_sum;
                start=tempstart;
                end=i;
            }
        }
        System.out.println("Maximum sum"+max_sum);
        System.out.println("maximum subarray");
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]);
        }
    }
}

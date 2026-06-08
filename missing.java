public class missing{
    public static void main(String[] args) {
        int []arr={1,2,3,5};
        int n=5;
        int sum=0;
        int expected=n*((n+1)/2);
        for(int i=0;i<n-1;i++){
             sum=sum+arr[i];
        }
        int miss=expected-sum;
        System.out.println(miss);
    }
}
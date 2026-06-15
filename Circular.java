public class Circular {
    public static void main(String[] args) {
        int[]arr={5,-3,5};
        int cur_max=arr[0];
        int max=arr[0];
        int cur_min=arr[0];
        int min=arr[0];
        int total =arr[0];
        for(int i=1;i<arr.length;i++){
            cur_max=Math.max(arr[i],cur_max+arr[i]);
            max=Math.max(cur_max,max);
            cur_min=Math.min(arr[i],cur_min+arr[i]);
            min=Math.min(cur_min,min);
            total+=arr[i];
        }
        int answer;
        if(max<0){
          answer=max;
        }
        else
        {
        answer=total-min;
        }
        System.out.println("maximum circular subarray is "+answer);
    }
}



// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class bubble {
    public static void main(String[] args) {
        int [] arr={7,5,4,3,2};
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                
            }
        
        }
        System.out.println("Sorted Array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
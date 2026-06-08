// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Question {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
       
       
        System.out.println("Enter number of elements");
              int  n=sc.nextInt();
                int []arr=new int[n];
               System.out.println("Enter the elements");
                   for(int i=0;i<n;i++){
                     arr[i]=sc.nextInt();
                   }
                   for(int i=0;i<n;i++){
                       for(int j=0;j<n-i-1;j++){
                           if(arr[j]>arr[j+1]){
                               int temp=arr[j];
                               arr[j]=arr[j+1];
                               arr[j+1]=temp;
                               
                           }
                           
                       }
                   }
                   System.out.println("Sorted Arrays:");
                   for(int i=0;i<n;i++){
                       System.out.print(arr[i]+" ");
                   }
               }
    }
    
        
        
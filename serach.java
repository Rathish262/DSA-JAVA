
import java.util.Scanner;
public class serach {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int[]arr={1,2,3,5,8};
       boolean found=false;
        int key=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("Element found at"+i);
                found=true;
                break;
            }
        }
           if(found==false){
                System.out.println("Element not found");
            }
        
    }    
}

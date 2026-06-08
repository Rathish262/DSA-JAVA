public class twoequal {
    public static void main(String[] args) {
        int[]arr1={1,2,3,4};
        int[]arr2={1,2,3,4};
        boolean same=true;
        if(arr[1].length!=arr[2].length){
            same=false;
        }
        for(int i=0;i<arr1.length;i++ ){
            if(arr1[i]!=arr2[i]){
                same=false;
                break;
            }

        }
        if(same){
            System.out.println("arrays are same ");
        }
        else{
            System.out.println("Arrays are not same");
        }
    }
    
}

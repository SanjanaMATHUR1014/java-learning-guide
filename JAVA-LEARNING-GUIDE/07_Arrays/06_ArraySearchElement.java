import java.util.Scanner;
public class ArraySearchElement{
    public static void main(String[] args) {
        int[] arr= {2,5,7,1,9};
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter element to search");
        int key=sc.nextInt();
         boolean found = false;
         for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("Element found at index "+i);
                found=true;
                break;
            } 
         }
         if(!found){
            System.out.println("Element not found");
         }


    }
}
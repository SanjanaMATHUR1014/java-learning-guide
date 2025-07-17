public class LargestOfThree{
    public static void main(String[] args) {
        int a=5,b=6,c=4;
        if(a>b && a>c){
            System.out.println("a is largest");
        }else if(b>a && b>c){
            System.out.println("b is largest");
        }else{
            System.out.println("c is largest");
        }
    }
}
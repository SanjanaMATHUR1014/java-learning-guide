public class EvenOddUsingSwitch{
    public static void main(String[] args) {
        int num=7;
        switch(num%2){
            case 0:System.out.println("even");break;
            case 1:System.out.println("odd");break;
        }
    }
}
public class CountDigits{
    public static int  count(int num){
        if(num==0) return 0;
        return 1 + count(num/10);
    }
    public static void main(String[] args) {
        int number= 123456789;
        System.out.println("Number of digits: "+count(number));
    }
}
public class CountDigits{
    public static void main(String[] args) {
        int num=785634;
        int count=0;
        while(num!=0){
            count++;
            num/=10;
        }
        System.out.println("Total Digits: "+count);
    }
}
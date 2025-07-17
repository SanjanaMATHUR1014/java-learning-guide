public class StringToCharArray{
    public static void main(String[] args) {
        String str="Example";
        char[] chars=str.toCharArray();
        for(char c:chars){
            System.out.print(c+" ");
        }
    }
}
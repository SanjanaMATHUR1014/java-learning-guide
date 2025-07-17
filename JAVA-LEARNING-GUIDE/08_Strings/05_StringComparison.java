public class StringComparison{
    public static void main(String[] args) {
        String a="java";
        String b="java";
        String c="java";
        System.out.println(a.equals(b));//case-sensitive
        System.out.println(a.equalsIgnoreCase(c));//case-insensitive
        System.out.println(a==b);//case-sensitive
    }
}
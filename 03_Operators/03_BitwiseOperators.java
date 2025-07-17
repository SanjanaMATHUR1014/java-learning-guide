public class BitwiseOperators{
    public static void main(String[] args) {
        int a=2;
        int b=5;
        System.out.println("a&b:"+(a&b)); //Bitwise AND
        System.out.println("a|b:"+(a|b)); //Bitwise OR
        System.out.println("a^b:"+(a^b)); //XOR
        System.out.println("~a:"+(~a));   //NOR
        System.out.println("a<<b:"+(a<<b)); //Left-shift
        System.out.println("a>>b:"+(a<<b)); //Right-shift
    }
}
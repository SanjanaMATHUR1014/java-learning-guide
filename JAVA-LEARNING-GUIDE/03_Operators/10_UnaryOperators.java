public class UnaryOperators{
    public static void main(String[] args) {
        int a=5;
        boolean flag=false;
        System.out.println("Unary minus:"+(-a));
        System.out.println("Unary plus:"+(+a)); //keeps values as is
        System.out.println("Logical NOT (!flag):"+(!flag));
        System.out.println("Bitwise NOT (~a):"+(~a));
    }
}
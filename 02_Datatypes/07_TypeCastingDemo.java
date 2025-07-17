public class TypeCastingDemo {
    public static void main(String[] args) {
        //widening(int to double)
        int a=10;
        double d=a;
        System.out.println("Widening: int: "+a+" to double:"+d);
        //Narrowing(double to int)
        double pi =3.14;
        int piInt =(int)pi;
        System.out.println("Narrowing: double: "+pi+" to int: "+piInt);

    }
}
    
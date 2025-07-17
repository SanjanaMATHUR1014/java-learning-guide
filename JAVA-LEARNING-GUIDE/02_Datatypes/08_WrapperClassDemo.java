public class WrapperClassDemo {
    public static void main(String[] args) {
      //Autoboxing
      int a= 10;
      Integer boxed=a;  
      //unboxing
      int b=boxed;
      System.out.println("Autoboxed Integer:"+boxed);
      System.out.println("Unboxed int:"+b);
    }
}
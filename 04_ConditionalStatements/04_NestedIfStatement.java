public class NestedIfStatement{
    public static void main(String[] args) {
        int age=22;
        int weight=65;
        if(age>=18){
            if(weight>=50){
                System.out.println("you can donate blood");
            }else{
                System.out.println("you are underweight to donate blood");
            }
        }else{
            System.out.println("you are underaged to donate blood");
        }
    }
}
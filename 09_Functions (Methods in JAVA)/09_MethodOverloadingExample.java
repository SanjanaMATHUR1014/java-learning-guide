public class MethodOverloadingExample{
     static void display(){
        System.out.println("no parameters.");
    }
    static void display(String name){
        System.out.println("Hello "+name);
    }
    public static void main(String[] args) {
        display();
        display("Sanjana");
        
    }
        
    
}
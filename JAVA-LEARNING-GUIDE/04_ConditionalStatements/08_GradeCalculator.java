public class GradeCalculator{
    public static void main(String[] args) {
        int score=90;
        if(score>=90){
            System.out.println("A+");
        }else if(score>=80){
            System.out.println("A");
        }else if(score>=70){
            System.out.println("C");
        }else if(score>=60){
            System.out.println("Fail");
        }
    }
}
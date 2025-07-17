public class OperatorPrecedence{
    
    public static void main(String[] args) {
        int result = 10 + 5 * 2;  // Multiplication has higher precedence
        int correct = (10 + 5) * 2;  // Parentheses override precedence

        System.out.println("10 + 5 * 2 = " + result);
        System.out.println("(10 + 5) * 2 = " + correct);
    }
}


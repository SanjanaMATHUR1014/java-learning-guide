class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            validate(10);
        } catch (MyException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }

    static void validate(int age) throws MyException {
        if (age < 18)
            throw new MyException("Underage: Access Denied");
    }
}

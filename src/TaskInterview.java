public class TaskInterview {
    public static void main(String[] args) {
        try {
            double c = divide(5.0, 2.0);
            System.out.println("Ответ: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Знаменатель не может быть нулем!");
        }
    }

    private static double divide(double a, double b) {
        if (b < Double.MIN_VALUE) {
            throw new ArithmeticException();
        }
        return a / b;
    }
}

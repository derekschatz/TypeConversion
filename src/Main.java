public class Main {
    public static void main(String[] args) {
        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        long longVal = 5;
        short shortVal = 7;
        byte byteVal = 7;

        short result1 = (short)longVal;

        double result2 = (long) (shortVal - longVal + floatVal + doubleVal);

        System.out.println(result2);

    }
}

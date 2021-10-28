public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public float divide(float a, float b) {
        if(b != 0) {
            return a / b;
        }
        return 0;
    }

    public int triple(int a) {
        return a * 3;
    }
}

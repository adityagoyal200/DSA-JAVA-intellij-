public class Complex {
    private final double realPart;
    private final double imaginaryPart;

    // Default constructor
    public Complex() {
        this.realPart = 0.0;
        this.imaginaryPart = 0.0;
    }

    // Constructor with initializers
    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    // Constructor with real part only
    public Complex(double realPart) {
        this.realPart = realPart;
        this.imaginaryPart = 0.0;
    }

    // Method to add two Complex numbers
    public Complex add(Complex other) {
        double newReal = this.realPart + other.realPart;
        double newImaginary = this.imaginaryPart + other.imaginaryPart;
        return new Complex(newReal, newImaginary);
    }

    // Method to subtract two Complex numbers
    public Complex subtract(Complex other) {
        double newReal = this.realPart - other.realPart;
        double newImaginary = this.imaginaryPart - other.imaginaryPart;
        return new Complex(newReal, newImaginary);
    }

    // Method to print Complex numbers
    public void print() {
        System.out.println("(" + this.realPart + ", " + this.imaginaryPart + ")");
    }

    // Main method to test the Complex class
    public static void main(String[] args) {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(3.0, 4.0);
        Complex c3 = new Complex(5.0); // Initialized with real part only
        Complex sum = c1.add(c2);
        sum.print();
        Complex diff = c1.subtract(c2);
        diff.print();
        c3.print();
    }
}


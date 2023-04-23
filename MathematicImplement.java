import java.util.Arrays;
// Interface for mathematical objects
interface MathObject {
    public MathObject add(MathObject other);
    public MathObject multiply(MathObject other);
}

// Class for vectors
 class Vector implements MathObject {
    private final int[] values;
    public Vector(int[] values) {
        this.values = values;
    }

    public MathObject add(MathObject other) {
        if (!(other instanceof Vector otherVector)) {
            throw new IllegalArgumentException("Can only add vectors");
        }
        int n = this.values.length;

        if (n != otherVector.values.length) {
            throw new IllegalArgumentException("Vectors must have same length");
        }

        int[] resultValues = new int[n];
        for (int i = 0; i < n; i++) {
            resultValues[i] = this.values[i] + otherVector.values[i];
        }

        return new Vector(resultValues);
    }

    public MathObject multiply(MathObject other) {
        if (!(other instanceof Vector otherVector)) {
            throw new IllegalArgumentException("Can only multiply vectors");
        }
        int n = this.values.length;
        if (n != otherVector.values.length) {
            throw new IllegalArgumentException("Vectors must have same length");
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += this.values[i] * otherVector.values[i];
        }
        return new Vector(new int[] { result });
    }
    public String toString() {
        return Arrays.toString(this.values);
    }
}
// Class for matrices
class Matrix implements MathObject {
    private final int[][] values;

    public Matrix(int[][] values) {
        this.values = values;
    }

    public MathObject add(MathObject other) {
        if (!(other instanceof Matrix otherMatrix)) {
            throw new IllegalArgumentException("Can only add matrices");
        }

        int m = this.values.length;
        int n = this.values[0].length;

        if (m != otherMatrix.values.length || n != otherMatrix.values[0].length) {
            throw new IllegalArgumentException("Matrices must have same dimensions");
        }

        int[][] resultValues = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                resultValues[i][j] = this.values[i][j] + otherMatrix.values[i][j];
            }
        }

        return new Matrix(resultValues);
    }

    public MathObject multiply(MathObject other) {
        if (!(other instanceof Matrix otherMatrix)) {
            throw new IllegalArgumentException("Can only multiply matrices");
        }

        int m = this.values.length;
        int n = this.values[0].length;
        int p = otherMatrix.values[0].length;

        if (n != otherMatrix.values.length) {
            throw new IllegalArgumentException("Matrices must have compatible dimensions");
        }

        int[][] resultValues = new int[m][p];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                int sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += this.values[i][k] * otherMatrix.values[k][j];
                }
                resultValues[i][j] = sum;
            }
        }
        return new Matrix(resultValues);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < this.values.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(Arrays.toString(this.values[i]));
        }
        sb.append("]");
        return sb.toString();
    }
}

// Main program

public class MathematicImplement {
    public static void main(String[] args) {
        MathObject v1 = new Vector(new int[]{1, 2, 3});
        MathObject v2 = new Vector(new int[]{4, 5, 6});
        MathObject v3 = v1.add(v2);
        MathObject v4 = v1.multiply(v2);
        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v1 + v2 = " + v3);
        System.out.println("v1 * v2 = " + v4);

        MathObject m1 = new Matrix(new int[][]{{1, 2}, {3, 4}});
        MathObject m2 = new Matrix(new int[][]{{5, 6}, {7, 8}});
        MathObject m3 = m1.add(m2);
        MathObject m4 = m1.multiply(m2);

        System.out.println("m1 = " + m1);
        System.out.println("m2 = " + m2);
        System.out.println("m1 + m2 = " + m3);
        System.out.println("m1 * m2 = " + m4);
    }
}

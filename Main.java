import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] rollno= {1,2,3,4,5};
        int[][] matrix= new int[3][3];
        Scanner sc= new Scanner(System.in);
        System.out.println("enter: ");
        for(int rows=0;rows<matrix.length;rows++){
            for(int cols=0;cols<3;cols++){
                matrix[rows][cols]=sc.nextInt();
            }
        }
        System.out.println("matrix: ");
        for(int rows=0;rows<matrix.length;rows++){
            for(int cols=0;cols<matrix[rows].length;cols++){
                System.out.print(matrix[rows][cols] + " ");
            }
            System.out.println();
        }
    }
}
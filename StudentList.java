import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Students {
    private String name;
    private int age;
    private double grade;

    public Students(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }
}

public class StudentList {
    public static void main(String[] args) {
        ArrayList<Students> studentList = new ArrayList<>();

        // Add three student objects to the list
        studentList.add(new Students("Aditya", 21, 99.2));
        studentList.add(new Students("Bharti", 22, 90.2));
        studentList.add(new Students("Abid", 22, 88.9));

        // Sort the student list in increasing order of age using a custom comparator
        Collections.sort(studentList, Comparator.comparingInt(Students::getAge));

        // Iterate through the elements of the array list and display their information
        for (Students student : studentList) {
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Grade: " + student.getGrade());
            System.out.println();
        }
    }
}

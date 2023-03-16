import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Student {
    private int registrationNumber;
    private String name;
    private int birthYear;
    private int birthMonth;
    private int birthDay;

    public Student(int registrationNumber, String name, int birthYear, int birthMonth, int birthDay) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int calculateAge() {
        int todayYear = Calendar.getInstance().get(Calendar.YEAR);
        int todayMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int todayDay = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        int age = todayYear - birthYear;
        if (todayMonth < birthMonth) {
            age--;
        }
        else if (todayMonth == birthMonth && todayDay < birthDay) {
            age--;
        }
        return age;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Student[] array = new Student[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Registration Number:");
            int regNumber = Integer.parseInt(br.readLine());

            System.out.println("Enter Name:");
            String name = br.readLine();

            System.out.println("Enter Birth Year:");
            int birthYear = Integer.parseInt(br.readLine());

            System.out.println("Enter Birth Month:");
            int birthMonth = Integer.parseInt(br.readLine());

            System.out.println("Enter Birth Day:");
            int birthDay = Integer.parseInt(br.readLine());

            Student student = new Student(regNumber, name, birthYear, birthMonth, birthDay);
            array[i] = student;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("Student Details:");
            System.out.println("Registration Number: " + array[i].getRegistrationNumber());
            System.out.println("Name: " + array[i].getName());
            System.out.println("Date of Birth: " + array[i].getBirthDay() + "/" + array[i].getBirthMonth() + "/" + array[i].getBirthYear());
            System.out.println("Age: " + array[i].calculateAge());
        }
    }
}

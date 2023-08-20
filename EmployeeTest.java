public class EmployeeTest {
    public static void main(String[] args) {
        Employee A = new Employee("Aditya","Goyal",50000);
        Employee B = new Employee("Akshit","Goyal",80000);
        System.out.print(A.getFirstName());
        System.out.println(" Annaul Salary:" + (A.getmonsalary()*12));
        System.out.print(B.getFirstName());
        System.out.println(" Annaul Salary:" + (B.getmonsalary()*12));
        A.setmonsalary(A.getmonsalary() * 12 * 1.1);
        B.setmonsalary(B.getmonsalary() * 12 * 1.1);
        System.out.println("Annual salary After 10% raise:");
        System.out.println("Aditya:" + A.getmonsalary());
        System.out.println("Akshit:" + B.getmonsalary());

    }
}
    class Employee{
        String FirstName;
        String LastName;
        double monsalary;
        public void setFirstName(String firstName) {

            this.FirstName = FirstName;
        }

        public String getFirstName() {
            return FirstName;
        }

        public void setLastName(String lastName) {
            this.LastName = LastName;
        }

        public String getLastName() {
            return LastName;
        }

        public void setmonsalary(double monthlySalary) {
                if (monthlySalary >= 0) {
                    this.monsalary = monthlySalary;
                }
            }
            public double getmonsalary() {

            return monsalary;
        }
        public Employee(String FirstName,String LastName,double monsalary){
            this.FirstName = FirstName;
            this.LastName =  LastName;
                if(monsalary>0){
                    this.monsalary = monsalary;
                }

        }
    }


package bank;

class Shape {
    String colour;
    public void AreaOfCircle(int r ){
        double area;
<<<<<<< HEAD
        area= 3.14*r*r;
=======
        area= 3.14*(r*r);
>>>>>>> dsa/master
        System.out.println("area of circle is :"+area);
    }
    public void colours(){
        System.out.println("the colur is : " +colour);
    }
    Shape(){
        System.out.println("constructor called");
    }
}

public class OOP{
    public static void main(String args[]){

        Shape s1 = new Shape();

        s1.AreaOfCircle(10);

        Shape s2 = new Shape();

        s2.colour= "red";
        s2.colours();

        Shape s3 = new Shape();
        s3.colour="blue";
        s3.colours();

        account ac1 = new account();
        ac1.name= "customer1";


    }

<<<<<<< HEAD
}
=======
}
>>>>>>> dsa/master

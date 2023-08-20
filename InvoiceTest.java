

/*Create a class called Invoice that a hardware store might use to represent an invoice for an item sold
        at the store. An Invoice should include four pieces of information as instance variables—a part number
        (type String), a part description (type String), a quantity of the item being purchased (type int) and a
        price per item (double). Your class should have a constructor that initializes the four instance variables.
        Provide a set and a get method for each instance variable. In addition, provide a method named
        getInvoiceAmount that calculates the invoice amount (i.e., multiplies the quantity by the price per item),
        then returns the amount as a double value. If the quantity is not positive, it should be set to 0. If the
        price per item is not positive, it should be set to 0.0. Write a test app named InvoiceTest that
        demonstrates class Invoice’s capabilities

 */
public class InvoiceTest {
    public static void main(String[] args) {
        Invoice A = new Invoice("10A","Nails",10,1.5);
        Invoice B = new Invoice("11B","Hammmer",1,100.0);
        System.out.println(A.getPartDesc() + ": " + A.getPartNum());
        System.out.println("Amount of " + A.getPartDesc() + ":" + A.getInvoiceAmt());
        System.out.println(B.getPartDesc() + ": " + B.getPartNum());
        System.out.println("Amount of " + B.getPartDesc() + ":" + B.getInvoiceAmt());

    }
}
class Invoice{
    String PartNum;
    String PartDesc;
    int Quantity;
    double Price;

    public void setPartNum(String PartNum) {

        this.PartNum = PartNum;
    }
    public String getPartNum() {

        return PartNum;
    }
    public void setPartDesc(String PartDesc) {

        this.PartDesc = PartDesc;
    }
    public String getPartDesc() {
        return PartDesc;
    }
    public void setQuantity(int Quantity) {
        if (Quantity>0) {
            this.Quantity = Quantity;
        }
        else{
            this.Quantity = 0;
        }
    }
    public double getQuantity() {

        return Quantity;
    }
    public void setPrice(double Price) {
        if (Price>0) {
            this.Price = Price;
        }
        else{
            this.Price = 0;
        }
    }
    public double getPrice() {

        return Price;
    }
    public double getInvoiceAmt(){

        return (Quantity *  Price);
    }
    public Invoice(String PartNum,String PartDesc,int Quantity,double Price){
        this.PartNum = PartNum;
        this.PartDesc = PartDesc;
        this.Quantity = Quantity;
        this.Price = Price;
    }
}

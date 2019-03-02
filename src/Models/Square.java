package Models;
import Interfaces.Print;

public class Square  extends Figure implements Print {
    private double a;

    public Square(double a)throws Exception{
        if(a<=0)
            throw new Exception("Invalid input value.");
        this.a=a;
    }

    protected double calculateArea(){
        return a*a;
    }
    protected double calculatePerimeter(){
        return 4*a;
    }
    public void print(){
        System.out.println("Square:");
        System.out.print("Side length: " + a + "\n");
        System.out.print("Area: " + calculateArea() + "\nPerimeter: " + calculatePerimeter() + "\n");
    }
}

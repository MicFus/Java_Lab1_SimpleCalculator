package Models;
import Interfaces.Print;

public class Circle  extends Figure implements Print {
    private double r;

    public Circle(double r) throws Exception{
        if(r<=0)
            throw new Exception("Invalid input value.");
        this.r=r;
    }
    protected double calculateArea(){   return Math.PI*Math.pow(r,2);    }
    protected double calculatePerimeter(){   return 2*Math.PI*r;    }
    public void Print(){
        System.out.println("Circle");
        System.out.print("Radius: " + r + "\n");
        System.out.print("Area: "+ calculateArea() + "\nPerimeter: " + calculatePerimeter()+"\n");
    }
}

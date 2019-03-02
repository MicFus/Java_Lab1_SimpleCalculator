package Models;
import Interfaces.Print;

public class Triangle extends Figure implements Print {
    private double a, h;

    public Triangle(double a, double h)throws Exception{
        if(a<=0 || h<=0)
            throw new Exception("Invalid input value.");
    this.a=a;
    this.h=h;
    }

    protected double calculateArea(){ return (a*h)/2; }
    protected double calculatePerimeter(){ return a+(2*(Math.sqrt(Math.pow(a/2,2)+Math.pow(h,2)))); }
    public void print(){
        System.out.println("Triangle");
        System.out.print( "Width: " + a + ", Hight: " + h  + "\n");
        System.out.print("Area: " + calculateArea() + "\n Perimeter: " + calculatePerimeter()+"\n");
    }
}

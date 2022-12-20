
public class Triangle extends Shape{
    
    private double a;
    private double b;
    private double c;
    private double h;
    
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }
    public double area(){
        return a*h*0.5;
    }

    public double perimeter(){
        return a+b+c;
    }

    public static void main(String[] args) {
        
    }
}

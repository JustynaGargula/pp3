
public class Circle extends Shape {
    
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double area(){
        return 3.14*r*r;
    }

    public double perimeter(){
        return 2*3.14*r;
    }

    public static void main(String[] args) {
        
    }
    
}

public class Rectangle{
    int[] dimensions = {0, 0};
    int perimeter;        //obwód
    int surfaceArea;
    
    public void countPerimeter(){
        perimeter = dimensions[0]*2 + dimensions[1]*2;
    }
    
    public void countArea(){
        surfaceArea = dimensions[0] * dimensions[1];
    }
    
    public void displayInfo(){
        System.out.println("Dimension: "+dimensions[0]+","+dimensions[1]+"\tperimeter: "
        +perimeter+"\tsurface area: "+surfaceArea );
    }
    
    public static void main(String[] args){
        Rectangle rec1 = new Rectangle();
        rec1.dimensions[0] = 3;
        rec1.dimensions[1] = 4;
        rec1.countPerimeter();
        rec1.countArea();
        System.out.print("Rectangle1 information:\t");
        rec1.displayInfo();
        
        Rectangle rec2 = new Rectangle();
        rec2.dimensions[0] = 2;
        rec2.dimensions[1] = 7;
        rec2.countPerimeter();
        rec2.countArea();
        System.out.print("Rectangle2 information:\t");
        rec2.displayInfo();
    }
}
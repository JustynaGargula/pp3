
public class Point{

    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public boolean isX(){
        if(y==0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isY(){
        if(x==0){
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){        //było toSring - literówka
        String text = "P(";
        text+=x;
        text+=",";
        text+=y;
        text+=")"; 
        return text;
    }

    public static void main(String[] args){
        Point p = new Point(3,0);
        System.out.println(p);
    }
}

public class ComputerFile{

    private String name;
    private double size;
    private String date;

    public void setName(String name){
        this.name = name;
    }

    public void setSize(double size){
        this.size = size;
    }

    public void setDate(String date){
        this.date = date;
    }

    public ComputerFile(String name, double size, String date){
        setName(name);
        setSize(size);
        setDate(date);
    }

    public void copy(){
    }

    public void delete(){

    }

    public void save(){

    }

    public void rename(String newName){
        name = newName;
    }

    public void displayInfo(){
        System.out.println("Name: "+name+" Size: "+size+" Date: "+date);
    }

    public static void main(String[] args){
        ComputerFile c = new ComputerFile("zad1.txt", 1.1, "2022.11.28");
        c.displayInfo();
    }

}
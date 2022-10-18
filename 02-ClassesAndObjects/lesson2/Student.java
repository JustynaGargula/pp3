public class Student{
    //Atrybuty
    String name;
    int age;
    String studentIDcard;
    boolean ifIDvalid;
    byte semesterNo;
    double averageGrade;

    //Metody
    public void sayHello(){
        System.out.println("Hello!");
    }
    public void displayName(){
        System.out.println("Mam na imie "+ name);
    }
    public void displayAge(){
        System.out.println("Mam "+ age +" lat");
    }
    public void displayInfo(){
        System.out.println(name+" "+
        semesterNo+" "+averageGrade);   
    }
    public void changeIDstatus(){
        ifIDvalid = !ifIDvalid;
    }
    public void displayInfo2(){
        System.out.println(name+" "
        +studentIDcard+" "+ifIDvalid);   
    }
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Justyna";
        s1.age = 20;
        s1.studentIDcard = "12345";
        s1.ifIDvalid = true;
        s1.semesterNo = 3;
        s1.averageGrade = 4.5;
        
        s1.sayHello();
        s1.displayInfo();
        s1.changeIDstatus();
        s1.displayInfo2();
    }
    

}
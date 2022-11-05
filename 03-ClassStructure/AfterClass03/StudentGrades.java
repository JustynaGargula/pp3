import java.util.Random;
import java.util.Scanner;

public class StudentGrades{
    //Zad 17,18,19
    
    String studentName;
    double[] grades;

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }
    
    StudentGrades(String name, int numberOfGrades){
        this.studentName = name;
        Random rnd1 = new Random();
        grades = new double[numberOfGrades];
        double[] sourceGrades = {2.0, 3.0, 3.5, 4.0, 4.5, 5.0};
        for(int i=0; i<numberOfGrades; i++){
            grades[i] = sourceGrades[rnd1.nextInt(6)];
        }
    }
    
    StudentGrades(String name){
        this.studentName = name;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Hom many grades do you want to enter? ");
        int numberOfGrades = myObj.nextInt();
        
        grades = new double[numberOfGrades];
        System.out.println("Enter grades one by one. ");
        for(int i=0; i<numberOfGrades; i++){
            grades[i] = myObj.nextDouble();
        }
    
    }
    
    
    public double lowestGrade(){
        double a = 10.0;
        for (double grade: grades){      // for(typ zmienna: nazwa_tabeli)
            if (grade<a){
                a = grade;
            }
        }
        return a;
    }
    
    public double highestGrade(){
        double a = 0.0;
        for (double grade: grades){
            if (grade>a){
                a = grade;
            }
        }
        return a;
    }
    
    public int numberOfGrades(){
        return grades.length;
    }
    
    public double gradePointAverage(){
        double sum = 0;
        for(double grade: grades){
            sum+=grade;
        }
        return sum/numberOfGrades();
    }
    
    public void displayInfo(){
        System.out.println("Record of student named: "+studentName);
        System.out.print("Grades: ");
        for(int i=0; i<grades.length; i++){
            System.out.print(grades[i]+" ");
        }
        System.out.println("\nNumber of grades: "+numberOfGrades());
        System.out.println("Lowest grade: "+lowestGrade());
        System.out.println("Highest grade: "+highestGrade());
        System.out.println("Grade point average: "+gradePointAverage()+"\n");
    }
    
    public static void main(String[] args){
        double[] gr1 = {3.5,4.5,4.0,2.0,5.0,3.5,3.5};
        StudentGrades st1 = new StudentGrades("Amanda",gr1);
        st1.displayInfo();
        
        double[] gr2 = {2.0, 3.0, 2.0, 4.5, 4.5};
        StudentGrades st2 = new StudentGrades("James",gr2);
        st2.displayInfo();
        
        StudentGrades st3 = new StudentGrades("Anne", 6);
        st3.displayInfo();
        
        StudentGrades st4 = new StudentGrades("Mary");
        st4.displayInfo();
    }

}
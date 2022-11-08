
public class DrivingLicense {
    private String driverName;
    private String driverSurname;
    private String address;
    private String postalCode;
    private String city;
    private String dLNumber;
    private int yearOfIssue;
    private String dLCategory;

public String getDriverName(){
    return driverName;
}
public void setDriverName(String name){
    name = name.substring(beginIndex:0,endIndex:1).toUpperCase()
        +name.substring(beginIndex:1).toLowerCase();
    driverName = name;
}

public String getDriverSurname(){
    return driverSurname;
}
public void setDriverSurname(String name){
    driverSurname = name;
}

public String getAddress(){
    return address;
}
public void setAddress(String address){
    this.address = address;
}

public String getPostalCode(){
    return postalCode;
}
public void setPostalCode(String code){
    postalCode = code;
}

public String getCity(){
    return city;
}
public void setCity(String city){
    this.city = city;
}

public String getDLNumber(){
    return dLNumber;
}
public void setDLNumber(String dLNumber){
    this.dLNumber = dLNumber;
}

public int getYearOfIssue(){
    return yearOfIssue;
}
public void setYearOfIssue(int year){
    yearOfIssue = year;
}

public String getDLCategory(){
    return dLNumber;
}
public void setDLCategory(String dLCategory){
    this.dLCategory = dLCategory;
}


public String toString(){
        String text = "";
        text+="Displaying information about driving license\n";
        text+="Name: "+getDriverName();
        text+="\nSurname: "+getDriverSurname();
        text+="\nAddress: "+getAddress();
        text+="\nPostal code: "+getPostalCode();
        text+="\nCity: "+getCity();
        text+="\nDriving license number: "+getDLNumber();
        text+="\nYear of issue: "+getYearOfIssue();
        text+="\nDriving license category: "+getDLCategory();

        return text;
    }

    public static void main(String[] args){
        DrivingLicense dL1 = new DrivingLicense();
        dL1.driverName = "Justyna";
        
        System.out.println(dL1);
        
    }
}

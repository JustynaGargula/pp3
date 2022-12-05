
public class File {
    private String fileName;
    private double size;

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public void setSize(double size) {
        this.size = size;
    }

    public String getFileName() {
        return fileName;
    }
    public double getSize() {
        return size;
    }

    public File(String fileName, double size) {
        setFileName(fileName);
        setSize(size);
    }
    public void changeName(String newName){
        fileName = newName;
    }

    public void displayFileInfo(){
        System.out.println("Name of file: "+fileName);
        System.out.println("Size of file: "+size);
    }

    public static void main(String[] args){
        
    }
}

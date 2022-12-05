import java.util.ArrayList;

public class Folder {
    ArrayList <String> folder = new ArrayList <String>();

    private String folderName;
    private int filesInsideNumber = folder.size();
    private File file;
    
    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }
    
    public Folder(String folderName) {
        setFolderName(folderName);
    }

    public void showFiles(){
        for(String i: folder){
            System.out.println(i);
        }
    }

    public void displayFolderInfo(){
        System.out.println("Name of folder: "+folderName);
        System.out.println("Number of files in folder: "+filesInsideNumber);
    }

    public void addFile(String fileName, double size){
        this.file = new File(fileName, size);
        folder.add(fileName);
    }
    public void removeFile(String fileName){
        int i = 0;
        boolean isTrue = true;
        while(i<folder.size() || isTrue){
            if(folder.get(i)==fileName){
                folder.remove(i);
                isTrue = false;
            }
            i++;
        }
    }

    public static void main(String[] args){

    }

    

    
}


public class FolderFileUse {
    
    public static void main(String[] args){
        Folder f = new Folder("myFolder");
        f.addFile("file1", 10);
        f.addFile("file2", 15);
        f.showFiles();
        System.out.println();
        f.addFile("file3", 20);
        f.showFiles();
        System.out.println();
        f.removeFile("file2");
        f.showFiles();
    }
}

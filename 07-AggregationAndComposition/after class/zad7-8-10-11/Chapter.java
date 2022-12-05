
public class Chapter {
    private String chapterTitle;
    private int numberOfPages;
    private int startingPageNumber;

    public void setChapterTitle(String chapterTitle) {
        this.chapterTitle = chapterTitle;
    }
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    public void setStartingPageNumber(int startingPageNumber) {
        this.startingPageNumber = startingPageNumber;
    }

    public Chapter(String chapterTitle, int numberOfPages, int startingPageNumber) {
        this.chapterTitle = chapterTitle;
        this.numberOfPages = numberOfPages;
        this.startingPageNumber = startingPageNumber;
    }

    public void displayChapterInfo(){
        System.out.println("Chapter title: "+chapterTitle);
        System.out.println("Number of pages: "+numberOfPages);
        System.out.println("Starting page number: "+startingPageNumber);
    }
}

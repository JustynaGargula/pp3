
public class Score {
    private int score1;
    private int score2;
    private int score3;
    private int score4;
    private int score5;
    
    public void setScore1(int score1) {
        this.score1 = score1;
    }
    public void setScore2(int score2) {
        this.score2 = score2;
    }
    public void setScore3(int score3) {
        this.score3 = score3;
    }
    public void setScore4(int score4) {
        this.score4 = score4;
    }
    public void setScore5(int score5) {
        this.score5 = score5;
    }  
    
    public Score(int score1, int score2, int score3, int score4, int score5) {
        setScore1(score1);
        setScore2(score2);
        setScore3(score3);
        setScore4(score4);
        setScore5(score5);
    }

    public double calculateScore(){
        int[] scores = {score1, score2, score3, score4, score5};
        int max = 0;
        int min = 6;
        int sum = 0;
        for(int i: scores){
            if(i>max){
                max = i;
            }
            else if(i<min){
                min = i;
            }
        }
        boolean isTrue = true;
        int j = 0;

        while(isTrue){
            if(scores[j]==max){
                scores[j] = 0;
                isTrue = false;
            }
            j++;
        }
        j=0;
        isTrue = true;
        while(isTrue){
            if(scores[j]==min){
                scores[j] = 0;
                isTrue = false;
            }
            j++;
        }

        for(int i: scores){
            sum+=i;
        }

        return sum/3.0;
    }


    public static void main(String[] args){
        Score s1 = new Score(1,1,2,5,3);
        System.out.println(s1.calculateScore());

        Score s2 = new Score(5,1,3,5,2);
        System.out.println(s2.calculateScore());

        Score s3 = new Score(5,5,2,4,4);
        System.out.println(s3.calculateScore());

    }
    
}

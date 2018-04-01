public class Main {

    public static void main(String[] args) {
       calculateScore(true,800,5,100);
       calculateScore(true,10000,8,200);


       displayHighScorePosition("ertuğrul",1500);
       displayHighScorePosition("ali",900);
       displayHighScorePosition("cengiz",400);
       displayHighScorePosition("komur",50);



    }
    public static int calculateScore(boolean gameOver,int score, int levelCompleted,int bonus){
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore+=1000;
            System.out.println("Your Final Score : " + finalScore);
            return finalScore;

        }
            return -1;
    }

    public static void displayHighScorePosition(String name, int score){
        System.out.println(name+" adlı oyucu "+calculateHighScorePosition(score)+". oldu.");


    }
    public static int calculateHighScorePosition(int highScore){
        if (highScore>=1000){
            return 1;
        }else if(highScore>=500 && highScore<1000){
            return 2;
        }else if (highScore>=100&&highScore<500){
            return 3;
        }
        return 4;
    }

}
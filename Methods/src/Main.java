public class Main {
    public static void main(String[] args){

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Final score " + highScore);
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Final score " + highScore);


        displayHighScorePosition("Name1", calculateHighScorePosition(1500));
        displayHighScorePosition("Name2", calculateHighScorePosition(900));
        displayHighScorePosition("Name3", calculateHighScorePosition(400));
        displayHighScorePosition("Name4", calculateHighScorePosition(50));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;

            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int pScore){
//        if (pScore >= 1000){
//            return 1;
//        }
//        else if (pScore >= 500)
//        {
//            return 2;
//        }
//        else if (pScore >= 100){
//            return 3;
//        }
//
//            return 4;

        int position = 4; //assume 4 will be returned

        if (pScore >= 1000){
            position = 1;
        }
        else if (pScore >= 500){
            position = 2;
        }
        else if (pScore >= 100){
            position = 3;
        }
        return position;

    }
}

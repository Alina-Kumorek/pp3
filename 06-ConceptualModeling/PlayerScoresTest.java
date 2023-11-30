public class PlayerScoresTest {
    public static void main(String[] args) {
        PlayerScores p1 = new PlayerScores();
        int[] s1A = {1, 2, 3};
        p1.setScores(s1A);
        int[] s1B = {1, 1, 1, 1, 6};
        p1.setScores(s1B);
        int[] s1C = {1, 2, 3, 4, 5};
        p1.setScores(s1C);
        p1.displayScore();

        PlayerScores p2 = new PlayerScores();
        int[] s2 = {1, 5, 4, 4, 4};
        p2.setScores(s2);
        p2.displayScore();

        PlayerScores p3 = new PlayerScores();
        int[] s3 = {5, 5, 3, 4, 4};
        p3.setScores(s3);
        p3.displayScore();
    }
}
public class Match {
    private Player player1;
    private Player player2;
    private int score;
    private Date date;

    public Match(Player player1, Player player2, int score, Date date) {
        this.setPlayer1(player1);
        this.setPlayer2(player2);
        this.setScore(score);
        this.setDate(date);
    }

    public Match(Player player1, Player player2) {
        this.setPlayer1(player1);
        this.setPlayer2(player2);
    }
    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Match{" +
                "player1=" + player1 +
                ", player2=" + player2 +
                ", score=" + score +
                ", date=" + date +
                '}';
    }
}

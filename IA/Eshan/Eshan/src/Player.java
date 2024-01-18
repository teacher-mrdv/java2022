public class Player {
    private String name;
    private int score;
    private int rank;
    private boolean isMatched;

    public Player(String name, int score, int rank, boolean isMatched) {
        this.name = name;
        this.score = score;
        this.rank = rank;
        this.isMatched = isMatched;
    }

    public Player(String name, int score, int rank) {
        this.name = name;
        this.score = score;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int compareTo(Player p2) {
        return this.rank - p2.getRank();
    }

    public boolean isMatched() {
        return isMatched;
    }

    public void setMatched(boolean matched) {
        isMatched = matched;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", rank=" + rank +
                ", isMatched=" + isMatched +
                '}';
    }
}

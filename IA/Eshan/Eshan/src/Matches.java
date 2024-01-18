import java.lang.reflect.Array;
import java.util.ArrayList;

public class Matches {
    public static ArrayList<Player> players = new ArrayList<>();
    public static ArrayList<Match> matches = new ArrayList<>();

    public static void makeMatches() {
        matches.clear();
        for( Player p : players ) {
            for(Player q : players) {
                if(p!=q && p.compareTo(q) == 0
                        && p.isMatched() == false && q.isMatched() == false)
                {
                    Match m = new Match(p, q);
                    p.setMatched(true); q.setMatched(true);
                    System.out.println(m);
                    matches.add(m);

                }
            }
        }
    }

    public static void main(String[] args) {
        players.clear();
        Player p = new Player("Eshan", 45, 3);
        players.add(p);
        p = new Player("John", 5, 1);
        players.add(p);
        p = new Player("Anne", 44, 3);
        players.add(p);
        p = new Player("Bob", 7, 2);
        players.add(p);
        p = new Player("Cole", 9, 2);
        players.add(p);
        System.out.println(players);
        makeMatches();
    }
}

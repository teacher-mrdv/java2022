import java.util.ArrayList;

public class MatchManager {
    public static ArrayList<Player> players = new ArrayList<>();
    public static ArrayList<Match> matches = new ArrayList<>();

    public static void makeMatches() {
        matches.clear();
        for( Player player : players ) {
            for(Player player2 : players) {
                if(player!=player2 && player.compareTo(player2) == 0
                        && player.isMatched() == false && player2.isMatched() == false)
                {
                    Match match = new Match(player, player2);
                    player.setMatched(true); player2.setMatched(true);
                    System.out.println(match);
                    matches.add(match);

                }
            }
        }
    }

    public static void main(String[] args) {
        players.clear();
        Player player = new Player("Eshan", 45, 3);
        players.add(player);
        player = new Player("John", 5, 1);
        players.add(player);
        player = new Player("Anne", 44, 3);
        players.add(player);
        player = new Player("Bob", 7, 2);
        players.add(player);
        player = new Player("Cole", 9, 2);
        players.add(player);
        System.out.println(players);
        makeMatches();
    }
}

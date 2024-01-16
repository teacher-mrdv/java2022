import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        //ArrayList<HashMap<String, Integer>> leaderboard = new ArrayList<>();
        HashMap<String , Integer> scores = new HashMap<String, Integer>();
        scores.put("Peach", 7);
        scores.put("Mario", 2);
        scores.put("Luigi", 9);
        scores.put("Wario", 3);
        System.out.println(scores);
        System.out.println( scores.get("Luigi") );
        System.out.println( scores.containsValue(2) );
        System.out.println(scores.size());
        
        /* Notes to Eshan:
         * the String, int could be just a LeaderBoardData class
         * you could add LeaderBoardData objects to an ArrayList
         * and sort it
         * There may be no need for the HashMaps!
         */
    }
}

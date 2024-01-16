package Medium;
import java.util.*;

public class WebsiteSimilarity {
    public static void main(String[] args) {
        List<Pair<String, Integer>> userVisits = Arrays.asList(
                new Pair<>("a", 1), new Pair<>("a", 3), new Pair<>("a", 5),
                new Pair<>("b", 2), new Pair<>("b", 6),
                new Pair<>("c", 1), new Pair<>("c", 2), new Pair<>("c", 3),
                new Pair<>("c", 4), new Pair<>("c", 5),
                new Pair<>("d", 4), new Pair<>("d", 5), new Pair<>("d", 6), new Pair<>("d", 7),
                new Pair<>("e", 1), new Pair<>("e", 3), new Pair<>("e", 5), new Pair<>("e", 6)
        );

        int k = 1; // You can change this to the desired value

        Map<Integer, Set<String>> websiteUserMap = new HashMap<>();

        // Build a map of websites to the set of users who visited them
        for (Pair<String, Integer> visit : userVisits) {
            websiteUserMap.computeIfAbsent(visit.getSecond(), key -> new HashSet<>()).add(visit.getFirst());
        }

        List<Pair<String, String>> websitePairs = new ArrayList<>();

        // Calculate the similarity between website pairs
        for (String user1 : websiteUserMap.get(1)) {
            for (String user2 : websiteUserMap.get(1)) {
                if (!user1.equals(user2)) {
                    Set<String> commonWebsites = new HashSet<>(websiteUserMap.get(1));
                    commonWebsites.retainAll(websiteUserMap.get(1));

                    double similarity = (double) commonWebsites.size() / (websiteUserMap.get(1).size() + websiteUserMap.get(1).size() - commonWebsites.size());

                    websitePairs.add(new Pair<>(user1, user2));
                }
            }
        }

        // Sort the website pairs by similarity and get the top k
        websitePairs.sort((pair1, pair2) -> Double.compare(calculateSimilarity(pair2, websiteUserMap), calculateSimilarity(pair1, websiteUserMap)));

        for (int i = 0; i < Math.min(k, websitePairs.size()); i++) {
            System.out.println("Website Pair: " + websitePairs.get(i).getFirst() + ", " + websitePairs.get(i).getSecond());
        }
    }

    private static double calculateSimilarity(Pair<String, String> websitePair, Map<Integer, Set<String>> websiteUserMap) {
        Set<String> commonWebsites = new HashSet<>(websiteUserMap.get(1));
        commonWebsites.retainAll(websiteUserMap.get(1));

        return (double) commonWebsites.size() / (websiteUserMap.get(1).size() + websiteUserMap.get(1).size() - commonWebsites.size());
    }

    static class Pair<F, S> {
        private final F first;
        private final S second;

        public Pair(F first, S second) {
            this.first = first;
            this.second = second;
        }

        public F getFirst() {
            return first;
        }

        public S getSecond() {
            return second;
        }
    }
}

package minimum_number_of_people_to_teach;

import java.util.*;

public class Main {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        Set<Integer>[] langSets = new Set[languages.length];
        for (int i = 0; i < languages.length; i++) {
            langSets[i] = new HashSet<>();
            for (int lang : languages[i]) {
                langSets[i].add(lang);
            }
        }

        Set<Integer> usersToTeach = new HashSet<>();
        List<int[]> problemFriendships = new ArrayList<>();
        for (int[] friendship : friendships) {
            int u = friendship[0] - 1;
            int v = friendship[1] - 1;
            boolean canCommunicate = false;
            for (int lang : langSets[u]) {
                if (langSets[v].contains(lang)) {
                    canCommunicate = true;
                    break;
                }
            }
            if (!canCommunicate) {
                problemFriendships.add(friendship);
                usersToTeach.add(u);
                usersToTeach.add(v);
            }
        }

        if (problemFriendships.isEmpty()) {
            return 0;
        }

        int minUsers = Integer.MAX_VALUE;
        for (int lang = 1; lang <= n; lang++) {
            int usersToTeachCount = 0;
            Set<Integer> taught = new HashSet<>();
            for (int[] friendship : problemFriendships) {
                int u = friendship[0] - 1;
                int v = friendship[1] - 1;
                if (!langSets[u].contains(lang) && !taught.contains(u)) {
                    usersToTeachCount++;
                    taught.add(u);
                }
                if (!langSets[v].contains(lang) && !taught.contains(v)) {
                    usersToTeachCount++;
                    taught.add(v);
                }
            }
            minUsers = Math.min(minUsers, usersToTeachCount);
        }

        return minUsers;
    }
}

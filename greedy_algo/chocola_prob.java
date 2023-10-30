package greedy_algo;

import java.util.*;

public class chocola_prob {
    public static void main(String arg[]) {
        
        Integer costver[] = { 2, 1, 3, 1, 4 };
        Integer costhor[] = { 4, 1, 2 };
        Arrays.sort(costhor, Collections.reverseOrder());
        Arrays.sort(costver, Collections.reverseOrder());
        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;
        while (h < costhor.length && v < costver.length) {
            if (costhor[h] >= costver[v]) {
                cost += (costhor[h] * vp);
                hp++;
                h++;
            } else {
                cost += (costver[v] * hp);
                vp++;
                v++;
            }
        }

        while (h < costhor.length) {
            cost += (costhor[h] * vp);
            hp++;
            h++;
        }
        while (v < costver.length) {
            cost += (costver[v] * hp);
            vp++;
            v++;
        }
        System.out.println(cost);
    }
}

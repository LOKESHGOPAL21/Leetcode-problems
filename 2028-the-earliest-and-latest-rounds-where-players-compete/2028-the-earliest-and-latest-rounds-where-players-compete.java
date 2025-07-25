import java.util.Arrays;

class Solution {
    private boolean[][][] seen;
    private int n;
    private int minRounds = Integer.MAX_VALUE;
    private int maxRounds = Integer.MIN_VALUE;

    private void allPossibleMatchups(int mask, int left, int right, int p1, int p2, int rounds, int l, int m, int r) {
        if (left >= right) {
            allPossibleMatchups(mask, 0, n - 1, p1, p2, rounds + 1, l, m, r);
        } else if ((mask & (1 << left)) == 0) {
            allPossibleMatchups(mask, left + 1, right, p1, p2, rounds, l, m, r);
        } else if ((mask & (1 << right)) == 0) {
            allPossibleMatchups(mask, left, right - 1, p1, p2, rounds, l, m, r);
        } else if (left == p1 && right == p2) {
            minRounds = Math.min(minRounds, rounds);
            maxRounds = Math.max(maxRounds, rounds);
        } else if (!seen[l][m][r]) {
            seen[l][m][r] = true;

            if (left != p1 && left != p2) {
                allPossibleMatchups(mask ^ (1 << left), left + 1, right - 1, p1, p2, rounds,
                        l - (left < p1 ? 1 : 0),
                        m - (left > p1 && left < p2 ? 1 : 0),
                        r - (left > p2 ? 1 : 0));
            }

            if (right != p1 && right != p2) {
                allPossibleMatchups(mask ^ (1 << right), left + 1, right - 1, p1, p2, rounds,
                        l - (right < p1 ? 1 : 0),
                        m - (right > p1 && right < p2 ? 1 : 0),
                        r - (right > p2 ? 1 : 0));
            }
        }
    }

    public int[] earliestAndLatest(int n, int firstPlayer, int secondPlayer) {
        int mask = (1 << n) - 1;
        firstPlayer--;
        secondPlayer--;
        this.seen = new boolean[28][28][28];
        this.n = n;

        allPossibleMatchups(mask, 0, n - 1, firstPlayer, secondPlayer, 1,
                firstPlayer, secondPlayer - firstPlayer - 1, n - 1 - secondPlayer);

        return new int[]{minRounds, maxRounds};
    }
}
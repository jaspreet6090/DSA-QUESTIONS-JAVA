import java.util.ArrayList;
import java.util.List;

class Solution {
   public List<Integer> getRow(int n) {
        ArrayList<Integer> row = new ArrayList<>(n + 1);
        row.add(1); // First element is always 1
        long ans = 1; // Use long to avoid integer overflow
        for (int i = 1; i <= n; i++) {
            ans = ans * (n - i + 1) / i;
            row.add((int) ans);
        }
        return row;
    }
}


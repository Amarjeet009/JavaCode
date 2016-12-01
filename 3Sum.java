
public class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(num);
        int N = num.length;
        for (int i = 0; i < N-2 && num[i] <= 0; ++i)
        {
            if (i > 0 && num[i] == num[i-1])
                continue; // avoid duplicates
            int twosum = 0 - num[i];
            int l = i + 1, r = N - 1;
            while (l < r)
            {
                int sum = num[l] + num[r];
                if (sum < twosum) ++l;
                else if (sum > twosum) --r;
                else {
                    ArrayList<Integer> tmp = new ArrayList<Integer>();
                    tmp.add(num[i]); tmp.add(num[l]); tmp.add(num[r]);
                    res.add(tmp);
                    ++l; --r;
                    while (l < r && num[l] == num[l-1]) ++l;  // avoid duplicates
                    while (l < r && num[r] == num[r+1]) --r;  // avoid duplicates
                }
            }
        }
        return res;
    }
}
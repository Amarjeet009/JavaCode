public class Solution {
    public int threeSumClosest(int[] num, int target) {
        int N = num.length;
        if (N < 3) return 0;
        int res = num[0] + num[1] + num[2];
        Arrays.sort(num);
        for (int i = 0; i < N-2; ++i)
        {
            int l = i + 1, r = N - 1;
            while (l < r)
            {
                int threesum = num[i] + num[l] + num[r];
                if (threesum == target) return target;
                else if (threesum < target) ++l;
                else --r;
                if (Math.abs(threesum - target) < Math.abs(res - target))
                    res = threesum;
            }
        }
        return res;
    }
}

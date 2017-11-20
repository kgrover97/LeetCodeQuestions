import java.util.HashMap;

public class SortColors {
    //75
    static void sortColors(int[] nums) {
        HashMap<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        for (int num : nums) {
            int val = numMap.containsKey(num) ? numMap.get(num) : 0;
            numMap.put(num, val + 1);
        }
        int zeros = numMap.containsKey(0) ? numMap.get(0) : 0;
        int ones = numMap.containsKey(1) ? numMap.get(1) : 0;
        int twos = numMap.containsKey(2) ? numMap.get(2) : 0;
        int j = 0;
        while(zeros > 0) {
            nums[j] = 0;
            j++;
            zeros--;
        }
        while(ones > 0) {
            nums[j] = 1;
            j++;
            ones--;
        }
        while(twos > 0) {
            nums[j] = 2;
            j++;
            twos--;
        }
    }
}

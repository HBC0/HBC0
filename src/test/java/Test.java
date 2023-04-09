import java.util.*;

public class Test {
    public static void main(String[] args) {
        int[] n=new int[]{2,7,11,15};
        System.out.println(Arrays.toString(twoSum(n,26)));
    }

//    Input: nums = [2,7,11,15], target = 9
//    Output: [0,1]
//    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    public static int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        // 使用 key存放nums【】的value  value存放 nuns的index
        Map<Integer,Integer> map=new HashMap<>();
        int[] result=new int[2];
        for(int i=0;i<n;i++){
            // 当 hashmap中 相邻两个 key相加等于target时 （即存在nums[i] + nums[i+1] = target）
            // 将两个 key的 value存入result
            if(map.containsKey(target - nums[i])){
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                break;
            }
            // 将数组存入hashmap
            map.put(nums[i],i);
        }
//        System.out.println(map.containsKey(7));
        return result; // {0,1}
    }
}

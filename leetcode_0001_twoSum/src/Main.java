import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] answer = solution(nums,target);

        System.out.print("[ ");
        for(int i = 0; i < answer.length; i++){
            System.out.print(answer[i]+" ");
        }
        System.out.print("]");

    }

    public static int[] solution(
            int[] nums, int target
    ){
        // 1 ms runtime in leetcode.

        if(nums.length == 2 && nums[0]+nums[1] == target){
            return new int[] {0,1};
        }
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <nums.length; i++){
            if(map.containsKey(target-nums[i])){
                return new int[] {map.get(target-nums[i]), i};
            }
            map.put(nums[i],i);
        }
        return new int[0];
    }
}
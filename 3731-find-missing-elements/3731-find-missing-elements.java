class Solution {
 public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);

        List<Integer> missing = new ArrayList<>();

        for (int i = nums[0]; i <= nums[nums.length - 1]; i++) {
            boolean found = false;

            for (int num : nums) {
                if (num == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                missing.add(i);
            }
        }
        return missing;
    }
}
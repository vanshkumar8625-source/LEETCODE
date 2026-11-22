class Solution {
    public int countDominantElements(int[] nums) {
        int count =0 ;
        for ( int i =0 ; i < nums.length ; i++){
            int sum =0 ;
            int adj =0;
            if(i >0){
                sum = sum + nums[i-1];
                adj ++;
            }
            if(i < nums.length-1){
                sum = sum + nums[i+1];
                adj ++;
            }
            if ( adj ==0 || nums[i]* adj>= sum ){
                count ++;
            }
            
        }
        return count ;
    }
}
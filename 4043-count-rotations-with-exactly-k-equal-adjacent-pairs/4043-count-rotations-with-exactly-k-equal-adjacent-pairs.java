class Solution {
    public int countRotations(String s, int k) {
        int n = s.length();
        int ans=0;
        for (int i =0 ;i<n ; i++){
            String two ="";
            for (int j=i;j<n;j++){
                two +=s.charAt(j);
            }
            for (int j = 0 ; j <i;j++){
                two +=s.charAt(j);
            }

            int count=0;
            for (int j=0; j<n-1;j++){
                if (two.charAt(j)==two.charAt(j+1))
                count++;
            }
            if (count == k)
            ans++;
            
        }
        return ans;
    }
}
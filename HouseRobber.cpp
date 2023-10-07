class Solution {
public:
    int rob(vector<int>& nums) {
        int n=nums.size();
        //vector<vector<int>> AMT(n+1,vector<int>(2));
        int dpOld0=0,dpOld1=0;
        for(int i=n-1;i>=0;i--){
           // AMT[i][0]=max(AMT[i+1][0],AMT[i+1][1]);
           int dpNow0=max(dpOld0,dpOld1);
           //AMT[i][1]=nums[i]+AMT[i+1][0];
           int dpNow1=nums[i]+dpOld0;
           dpOld0=dpNow0;
           dpOld1=dpNow1;
        }
        return max(dpOld0,dpOld1);
    }
};
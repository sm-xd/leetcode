class Solution {
public:
    int pivotInteger(int n) {
        int leftSum=1,rightSum=(n*(n+1))/2;
        int i=1;
        int pivot=2;
        while(i<=n){
            if(leftSum==rightSum){
                return pivot-1;
            }
            leftSum +=pivot;
            rightSum -= pivot-1;
            pivot++;
            i++;
        }
        return -1;
    }
};
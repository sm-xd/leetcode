class Solution {
    private int countFive,countTen;
    public boolean lemonadeChange(int[] bills) {
        int billsLength = bills.length;
        for(int i=0;i<billsLength;i++)
        {
            if(bills[i]==5)
            {
                countFive++;
            }
            else if(bills[i]==10)
            {
                if(!changeAvailable(10)) return false;
                countTen++;
                countFive--;
            }
            else
            {
                if(!changeAvailable(20)) return false;
                if(countTen>0){
                    countTen--;
                    countFive--;
                }
                else{          
                    countFive -=3;
                }
            }
        }
        return true;
    }
    private boolean changeAvailable(int amount)
    {
        if((amount==10 && countFive>0) || (countTen>0 && countFive>0) || (countFive>2)) 
        {
            return true;
        }
        return false;
    }
}
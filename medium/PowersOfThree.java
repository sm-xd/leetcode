public class PowersOfThree {
    class Solution {
        public boolean checkPowersOfThree(int n) {
            //kind of tricky 
            //first approch was to minus 3 till it gets 0 or 1 but it doesnt neccessarily mean it is of distinct powers of 3 
            //when converted to base 3 it doesnt have 2 if it is in a form of powers of 3
            int check;
            while(n>0){
                check = n%3;
                if(check==2) return false;
                n=n/3;
            }
            return true;
        }
    }
}

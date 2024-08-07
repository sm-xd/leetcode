package hard;

public class integerToEnglishWords {
    public static void main(String[] args){
        System.out.println(integerToEnglishWords.convertToWords(1000000));
        // System.out.println(integerToEnglishWords.convertToWords(5000698));
        // System.out.println(integerToEnglishWords.convertToWords(34));
        // System.out.println(integerToEnglishWords.convertToWords(290));
        // System.out.println(integerToEnglishWords.convertToWords(100201));
        // System.out.println(integerToEnglishWords.convertToWords(1452490));
    }
    public static String convertToWords(int num){
        if (num == 0) {
            return "zero";
        }
        StringBuilder result = new StringBuilder();
        int threeDigit;
        threeDigit = num%1000;
        result.append(integerToEnglishWords.threeDigitConvertToWords(threeDigit));

        //To add the thousand part
        num = num/1000;
        if(num==0) return result.toString();
        threeDigit = num%1000;
        String tempThousand = integerToEnglishWords.threeDigitConvertToWords(threeDigit);
        if(!tempThousand.isEmpty()){
            result.insert(0,tempThousand+ " Thousand ");
        }

        //to add the million part
        num = num/1000;
        if(num==0) return result.toString();
        threeDigit = num%1000;
        String tempMillion = integerToEnglishWords.threeDigitConvertToWords(threeDigit);
        if(!tempMillion.isEmpty()){
            result.insert(0,tempMillion+ " Million ");
        }

        //to add the billion part   
        num = num/1000;
        if(num==0) return result.toString();
        threeDigit = num%1000;
        String temp2Million= integerToEnglishWords.threeDigitConvertToWords(threeDigit);
        if(!temp2Million.isEmpty()){
            result.insert(0,temp2Million+ " Billion ");
        }

        return result.toString();
    }

    public static String threeDigitConvertToWords(int number) {
        System.out.println(number);
        if(number==0) return "";

        String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        
        StringBuilder words = new StringBuilder();
        
        int hundred = number / 100;
        int remainder = number % 100;
        int ten = remainder / 10;
        int unit = remainder % 10;
        
        // Convert hundreds place
        if (hundred > 0) {
            words.append(ones[hundred]).append(" hundred");
            if (remainder > 0) {
                words.append(" ");
            }
        }
        
        // Convert tens and units place
        if (remainder >= 10 && remainder < 20) {
            words.append(teens[remainder - 10]);
        } else {
            if (ten > 0) {
                words.append(tens[ten]);
                if (unit > 0) {
                    words.append(" ");
                }
            }
            if (unit > 0) {
                words.append(ones[unit]);
            }
        }
        
        return words.toString();
    }
}

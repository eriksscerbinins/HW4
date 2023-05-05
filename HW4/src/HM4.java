public class HM4 {

    public static void main(String[] args) {

        String result1 = returnNewWord("aabb", "ccdd");
        System.out.println("result1 " + result1);
        String result2 = returnNewWord("12", "abcd");
        System.out.println("result2 " + result2);
        String result3 = returnNewWord("OneTwo", "2034");
        System.out.println("result3 " + result3);

        int sum1 = sumTwoNumbers(56, 89);
        System.out.println("sum1 "+ sum1);

        System.out.println("");


    }

    static String returnNewWord(String word1, String word2){
        int halfLengthWord1 = word1.length() / 2;
        int halfLengthWord2 = word2.length() / 2;

        String firstPartWord1 = word1.substring(0,halfLengthWord1);
        String secondPartWord2 = word2.substring(halfLengthWord2,word2.length());

        String result = firstPartWord1 + secondPartWord2;
        return result;
    }

    static int sumTwoNumbers(int number1, int number2){
        int result = number1 + number2;
        return result;
    }

    public static void convertCurrency(double euro, double exhangeRate) {
        double dollars = euro * exhangeRate;
        return dollars;

        }


}



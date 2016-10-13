package is.ru.StringCalculatorSvenni;

import java.util.ArrayList;

public class Calculator{

    public static int add(String text){
        int result = 0;
        ArrayList<Integer> negatives = new ArrayList<Integer>();
        if (text != "") {

            String[] numbers = text.split(",|\\\n");

            for (int i = 0; i < numbers.length; i++) {
                int intI = Integer.parseInt(numbers[i]);
                if (intI < 0){
                    negatives.add(intI);
                }
                if (intI <= 1000) {
                    result += intI;
                }
            }

            if ( negatives.size() > 0 ){

                String negNum = negatives.toString();
                negNum = negNum.replace("[", "");
                negNum = negNum.replace("]", "");
                throw new IllegalArgumentException("Negatives not allowed: " + negNum );
            }
            return result;
        }
        return result;
    }

}

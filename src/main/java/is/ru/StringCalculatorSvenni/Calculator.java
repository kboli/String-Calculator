package is.ru.StringCalculatorSvenni;

public class Calculator{

    public static int add(String text){
        int result = 0;


        if(text.contains(",") || text.contains("\n") ){

            String [] numbers = text.split(",|\\\n");

            for ( int i = 0; i < numbers.length; i++ ){
                int intI = Integer.parseInt(numbers[i]);
                if(intI <= 1000){
                    result += intI;

                }
            }
            return result;

        }else if(text != ""){
            result = Integer.parseInt(text);
            return result;
        }
        return result;
    }

}
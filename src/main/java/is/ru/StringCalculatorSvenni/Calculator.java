package is.ru.StringCalculatorSvenni;

public class Calculator{

    public static int add(String text){
        if (text == ""){
            return 0;

        }else if(text.contains(",")){
            String [] numbers = text.split(",");
            int result = 0;
            for ( int i = 0; i < numbers.length; i++ ){
                result += Integer.parseInt(numbers[i]);
            }
            return result;
        }else{
            int n = Integer.parseInt(text);
            return n;
        }
    }

}
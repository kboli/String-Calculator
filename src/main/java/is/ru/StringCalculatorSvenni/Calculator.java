package is.ru.StringCalculatorSvenni;

public class Calculator{

    public static int add(String text){
        if (text == ""){
            return 0;

        }else if(text.contains(",")){
            String [] numbers = text.split(",");
            int nr1 = Integer.parseInt(numbers[0]);
            int nr2 = Integer.parseInt(numbers[1]);
            return nr1 + nr2;
        }else{
            int n = Integer.parseInt(text);
            return n;
        }
    }

}
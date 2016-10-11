package is.ru.StringCalculatorSvenni;

public class Calculator{

    public static int add(String text){
        if (text == ""){
            return 0;
        }else{
            int n = Integer.parseInt(text);
            return n;
        }
    }

}
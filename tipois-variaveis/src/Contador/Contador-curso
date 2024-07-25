import java.lang.reflect.Parameter;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
       Scanner terminal = new Scanner (System.in).useLocale(Locale.US);
       System.out.println("Digite o primeiro parametro: ");
       int parametroUM = terminal.nextInt();
       System.out.println("Digite o segundo parametro: ");
       int parametroDOIS = terminal.nextInt();
       try {
        contar(parametroUM,parametroDOIS);
       } catch (Exception f) {
        System.out.println("O segundo parametro deve ser maior que o primeiro");
       }
    }
    static void contar (int parametroUM, int parametroDOIS) throws Exception{
        if(parametroUM > parametroDOIS)
        throw new Exception();
        if(parametroUM < parametroDOIS){
       int contagem = parametroDOIS - parametroUM;
       for(int x = 1; x <= contagem; x++)
       System.out.println(x);
    }
}
}

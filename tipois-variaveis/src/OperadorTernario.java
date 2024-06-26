package Operadores;
public class OperadorTernario {
    public static void main(String[] args) {
        int a, b;
        a = 5;
        b = 6;
        // String resultado =  "";
        // if(a == b)
        //    resultado = "verdadeiro";
        // else   
        //    resultado = "falso";
        // System.out.println(resultado);

        String resultado = a == b ? "Verdadeiro" : "Falso";
        System.out.println(resultado);

        int resultado2 = a == b ? 1 : 0;
        System.out.println(resultado2);
            
    }
    
}

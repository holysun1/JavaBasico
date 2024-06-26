package Operadores;
public class Operadores {
    public static void main(String[] args) {
        int numero = 5;
        System.out.println(numero);
        numero = numero +2;
        //Sera incrementado +2 no numero final
        System.out.println(numero);
        numero = ++ numero;
        //Implementado +1 no numero final;
        System.out.println(numero);
        numero = -- numero;
        //Decrementado -1 no numero final;
        System.out.println(numero);

        boolean variavel = true;
        System.out.println(variavel);
        //Valor original da variável
        System.out.println(!variavel);
        //Alteração do valor da variável
        System.out.println(variavel);
        //Valor original da variavel
        variavel = !variavel;
        //Alteração do valor da variavél
        System.out.println(variavel);

    }
    
}

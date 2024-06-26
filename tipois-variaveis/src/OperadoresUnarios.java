package Operadores;
public class OperadoresUnarios {
    public static void main(String[] args) {
        int numero = 5;

        System.out.println(- numero);
        //O operador negativo vai alterar o sinal do número
        System.out.println(numero);
        //o operador negativo (-) não afetou a variável principal
        numero = -numero;
        System.out.println(numero);
        //Agora com a nova atribuição, o operador negativo alterou o numero
        numero = + numero;
        //O operador positivo não vai alterar o sinal do número
        System.out.println(numero);
        numero = -1 * numero;
        //Agora o operador vai alterar o sinal do número
        System.out.println(numero);

    
    }
    
}

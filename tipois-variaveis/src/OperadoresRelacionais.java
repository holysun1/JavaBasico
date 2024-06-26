package Operadores;
public class OperadoresRelacionais {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        if(numero1<numero2){
            System.out.println("A nossa condição é verdadeira");
        }

        boolean simNao = numero1 == numero2;
        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numeroUm é diferente a numeroDois? " + simNao);
    
        simNao = numero1 > numero2;
        System.out.println("numeroUm é maior que o numeroDois? " + simNao);

        String nomeUM = "Diego";
        String nomeDois = "Cristiano";
        String nomeTres = new String("Cristiano");
        
        System.out.println(nomeUM == nomeDois);
        System.out.println(nomeTres == nomeDois);
        //Os nomes são iguais porém como se trata de um novo valor de memória a condição é dada como por isso devemos utilizar .equals
        //para valores em "Strings" e " == " para números.
        System.out.println(nomeTres.equals(nomeDois));
        //Ao utilizar Strings a forma mais recomendada de utilizar um operador é utilizar o operador .equals.
        



    }
    
}

package Operadores;
public class OperadorLogico {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras.");
            //Nessa condição lógica só irá imprimir se as duas condições forem verdadeiras.
        }
        if (condicao1||condicao2){
            System.out.println("Uma das condições é verdadeira.");
        }
        if (condicao1 && ( 7>4)){
            System.out.println("Uma das condições é verdadeira.");
        }
        System.out.println("Game Over.");
    }
    
}

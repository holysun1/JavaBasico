package Metodos;

public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV();
        System.out.println("TV Ligada? " + smartTV.ligada);
        System.out.println("Canal Atual: " + smartTV.canal);
        System.out.println("Volume Atual: " + smartTV.volume);
    smartTV.desligar();
    System.out.println("TV ligada? " + smartTV.ligada);
    smartTV.ligar();;
    System.out.println("TV Ligada? " + smartTV.ligada);
    smartTV.aumentarCanal();
    System.out.println("Canal: " + smartTV.canal);
    smartTV.diminuirCanal();
    System.out.println("Canal: " + smartTV.canal);
    smartTV.aumentarVolume();
    System.out.println("Volume: " + smartTV.volume);
    smartTV.diminuirVolume();
    System.out.println("Volume: " + smartTV.volume);   
    smartTV.mudarCanal(13);
    System.out.println("Canal: " + smartTV.canal);





    }
    
}

package Metodos;

public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 15;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void aumentarCanal(){
        canal ++;
    }
    public void diminuirCanal(){
        canal --;
    }
    public void aumentarVolume(){
        volume ++;
    }
    public void diminuirVolume(){
        volume --;
    }
    /**
     * @param novoCanal
     */
    public void mudarCanal(int novoCanal){
        //canal = novoCanal;
        canal = novoCanal.getInstance();
    }
}

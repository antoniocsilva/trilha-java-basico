public class SmartTv {
    boolean ligada = false;
    int canal = 4;
    int volume = 15;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void alterarCanalCrescente() {
        canal++;
    }

    public void alterarCanalDecrescente() {
        canal--;
    }

    public void alterarCanal(int c) {
        canal = c;
    }

}

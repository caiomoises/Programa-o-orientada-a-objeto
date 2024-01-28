public class Lampada {
    public boolean estadoDaLampada;
    public int cont;


    public Lampada(){
        this.estadoDaLampada = false;
        cont = 0;
    }

    public void acende(){
        estadoDaLampada = true;
    }

    public void apaga() {
        estadoDaLampada = false;
    }

    public boolean mostraEstado() {
        return estadoDaLampada;
    }
}

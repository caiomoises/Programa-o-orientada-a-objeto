public class AutomovelLuxo extends AutomovelBasico {
    private boolean arCond;
    private boolean dirHid;

    public AutomovelLuxo(int ano, String modelo, String cor, boolean airbag, boolean radio, boolean arCond,
            boolean dirHid) {
        super(ano, modelo, cor, airbag, radio);
        this.arCond = arCond;
        this.dirHid = dirHid;
    }

    @Override
    public double quantoCusta() {
        double custo = super.quantoCusta();
        custo += (arCond? 10000 : 0);
        custo += (dirHid? 2000 : 0);
        return custo;
    }

    @Override
    public String toString() {
        return super.toString() + "arCond = " + arCond + ", dirHid = " + dirHid;
    }

    
    
}

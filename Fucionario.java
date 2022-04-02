package herança;

public class Fucionario extends Pessoa {
    
    private double Slr;
    
    public Fucionario(String nom, String cpf, double slr) {
        super(nom, cpf);
        this.Slr = slr;
    }
    public Fucionario() {}

    public void println() {
        super.println();
        System.out.println("Sálario: R$"+this.Slr);
    }
    public double getSlr() {
        return this.Slr;
    }
    public void setSlr(double slr) {
        this.Slr = slr;
    }
}

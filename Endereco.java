package herança;

public class Endereco {
    
    private String rua;
    private String bair;

    public Endereco() {}
    public Endereco(String rua, String bair) {
        this.rua = rua;
        this.bair = bair;
    }

    public String getRua() {
        return this.rua;
    }
    public String getBair() {
        return this.bair;
    }
    public void setBair(String bair) {
        this.bair = bair;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
}

package herança;

public class Pessoa {
    
    private String nom;
    private String cpf;
    private Endereco end;

    public Pessoa() {}
    public Pessoa(String nom, String cpf) {
        this.nom = nom;
        this.cpf = cpf;
    }

    public void println() {
        System.out.println("Nome: "+this.nom);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Rua: "+this.end.getRua()+", Bairro: "+this.end.getBair());
    }
    public String getNom() {
        return this.nom;
    }
    public Endereco getEnd() {
        return this.end;
    }
    public void setEnd(Endereco end) {
        this.end = end;
    }
    public String getCpf() {
        return this.cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

}

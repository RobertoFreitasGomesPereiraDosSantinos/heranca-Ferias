package herança;

public class HerancaTest {
    public static void main(String... args) {
        Pessoa pes = new Pessoa("roberto","4970");
        Endereco end = new Endereco();
        Fucionario fuc = new Fucionario();
        pes.setNom("Creudiane Pexeras");
        pes.setCpf("112.543.908-32");
        end.setRua("Cracas Novas");
        end.setBair("Seboso das Jumbas");
        pes.setEnd(end);
        pes.println();
        System.out.println("------------------------------");
        fuc.setNom("Janbião de Ribeiro");
        fuc.setCpf("483.923.654-11");
        fuc.setEnd(end);
        fuc.setSlr(3000);
        fuc.println();
    }
}

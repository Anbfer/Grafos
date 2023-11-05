package Principal;

public class Principal {
    public static void main(String[] args) {
        //Classe onde será iniciado o programa
        
        Felinos felinos = new Felinos();

        felinos.pantheraAncestral();
        felinos.imprimeRelacionados("PANTHERA ANCESTRAL");
        felinos.imprimeRelacionados("LEÃO");
        felinos.imprimeRelacionados("LEOPARDO DAS NEVES");
    }
}

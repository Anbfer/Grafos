package Principal;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Felinos {

    private Grafo<String> grafo;

    public Felinos() {
        this.grafo = new Grafo<String>();
    }

    /* Automaziação dos exemplos início */
    public void pantheraAncestral() {
        ArrayList<String> panthera = new ArrayList<>();

        panthera.add("LEÃO");
        panthera.add("LEOPARDO");
        panthera.add("JAGUAR");
        panthera.add("TIGRE");
        panthera.add("LEOPARDO DAS NEVES");
        panthera.add("LEOPARDO NUBLADO");
        panthera.add("LEOPARDO NUBLADO DE BORNÉU");

        grafo.automatizaExemplos(panthera, "PANTHERA ANCESTRAL");
    }

    public void gatoVermelhoAncestral() {
        ArrayList<String> gatoVermelho = new ArrayList<>();
        gatoVermelho.add("GATO VERMELHO DE BORNÉU");
        gatoVermelho.add("GATO BRAVO DOURADO DA ÁSIA");
        gatoVermelho.add("GATO MARMORADO");

        grafo.automatizaExemplos(gatoVermelho, "GATO VERMELHO ANCESTRAL");
    }

    public void linceDoDesertoAncestral() {
        ArrayList<String> linceDoDeserto = new ArrayList<>();
        linceDoDeserto.add("LINCE DO DESERTO");
        linceDoDeserto.add("GATO DOURADO AFRICANO");
        linceDoDeserto.add("SERVAL");

        grafo.automatizaExemplos(linceDoDeserto, "LINCE DO DESERTO ANCESTRAL");
    }

    public void oncaPardaAncestral() {
        ArrayList<String> linceDoDeserto = new ArrayList<>();
        linceDoDeserto.add("ONÇA PARDA");
        linceDoDeserto.add("JAGUARUNDI");
        linceDoDeserto.add("GUEPARDO");

        grafo.automatizaExemplos(linceDoDeserto, "ONÇA PARDA ANCESTRAL");
    }

    public void gatoDomestico() {
        ArrayList<String> linceDoDeserto = new ArrayList<>();
        linceDoDeserto.add("GATO DOMÉSTICO");
        linceDoDeserto.add("GATO SELVAGEM");
        linceDoDeserto.add("GATO DO DESERTO");
        linceDoDeserto.add("GATO BRAVO DE PATAS NEGRAS");
        linceDoDeserto.add("GATO DA SELVA");

        grafo.automatizaExemplos(linceDoDeserto, "GATO DOMÉSTICO ANCESTRAL");
    }

    /* Fim da automatização dos exemplos */
    public void adicionarEspecieFelino() {
        // Método que adiciona um felino ao grafo
        String nomeDaEspecie = JOptionPane.showInputDialog("Qual a família ou felino especifico deseja cadastrar?")
                .toUpperCase();
        grafo.adcVertice(nomeDaEspecie);
    }

    public void adicionarRelacaoFelinos() {
        // Método que adiciona uma relação entre dois felinos
        String felino1 = JOptionPane.showInputDialog("Informe a família ou felino especifico deseja relacionar?")
                .toUpperCase();
        String felino2 = JOptionPane.showInputDialog("Qual família ou felino deseja relacionar à " + felino1 + "?")
                .toUpperCase();
        grafo.adcAresta(felino1, felino2);
    }

    public void imprimeRelacionados(String felino) {
        // Método que imprime os felinos relacionados a um felino específico
        List<String> listaDeRelacionados = grafo.buscaRelacionados(felino);// Cria uma lista com os valores retornados
        if (listaDeRelacionados == null) {
            JOptionPane.showMessageDialog(null, "Não há valores como estes presentes no grafo"); // Caso a lista esteja
                                                                                                 // vazia
        } else {
            StringBuilder stringBuilder = new StringBuilder();// Construtor de string para os multiplos valores serem
                                                              // vizualizados melhor

            for (String felidae : listaDeRelacionados) {
                stringBuilder.append(felidae).append("\n");// Formatação para cada item presente na lista
            }

            String resultadoBusca = stringBuilder.toString();// Variavel que armazena o retorno do construtor de string

            JOptionPane.showMessageDialog(null, "Descendentes/Relacionados: \n" + resultadoBusca,
                    "Grafo " + felino.toUpperCase(), JOptionPane.INFORMATION_MESSAGE);// Mensagem contendo os valores
                                                                                      // retornados

        }

    }

    // Método para buscar uma familia ou felino especifico
    public void buscarFelidaesEspecificos() {
        String familiaExemplos = JOptionPane.showInputDialog("Qual a família ou felino especifico deseja buscar?");
        this.imprimeRelacionados(familiaExemplos);// retorna os valores relacionados pesquisados conforme a
                                                  // "instânciação"
    }

    public void exibeTodosFelidaes() {
        grafo.exibeTodos();
    }

    public void inicializarFelidaes() {
        this.pantheraAncestral();
        this.gatoVermelhoAncestral();
        this.linceDoDesertoAncestral();
        this.oncaPardaAncestral();
        this.gatoDomestico();
    }
}

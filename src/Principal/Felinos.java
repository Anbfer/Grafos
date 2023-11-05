package Principal;

import java.util.ArrayList;
import java.util.List;

public class Felinos {
    private Grafo grafo;

    public Felinos() {
        this.grafo = new Grafo();
    }

    public void pantheraAncestral() {
        ArrayList<String> panthera = new ArrayList<String>();

        panthera.add("LEÃO");
        panthera.add("LEOPARDO");
        panthera.add("JAGUAR");
        panthera.add("TIGRE");
        panthera.add("LEOPARDO DAS NEVES");
        panthera.add("LEOPARDO NUBLADO");
        panthera.add("LEOPARDO NUBLADO DE BORNÉU");

        String pantheraRelacionados;

        while (!panthera.isEmpty()) {
            grafo.adcVertice("PANTHERA ANCESTRAL");
            grafo.adcVertice(panthera.get(0));
            // Estabelece o relacionamento entre as espécie Panthera Ancestral e as espécies
            // de felinos atuais
            grafo.adcAresta("PANTHERA ANCESTRAL", panthera.get(0));
            pantheraRelacionados = panthera.get(0);// Guarda o nome do felino atual
            panthera.remove(0);
            if (panthera.size() >= 1) {//Relaciona o felino atual com o próximo felino da lista
                grafo.adcVertice(panthera.get(0));
                grafo.adcAresta(panthera.get(0), pantheraRelacionados);
            }

        }

    }

    public void adicionarEspecieFelino(String nomeDaEspecie) {
        // Método que adiciona um felino ao grafo
        grafo.adcVertice(nomeDaEspecie);
    }

    public void adicionarRelacaoFelinos(String felino1, String felino2) {
        // Método que adiciona uma relação entre dois felinos
        grafo.adcAresta(felino1, felino2);
    }

    public void imprimeRelacionados(String felino) {
        // Método que imprime os felinos relacionados a um felino específico
        List<String> listaDeRelacionados = grafo.buscaRelacionados(felino);
        System.out.println("Relacionados ao felino " + felino + ": " + listaDeRelacionados);
    }
}

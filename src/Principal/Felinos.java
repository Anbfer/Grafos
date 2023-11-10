package Principal;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

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
        
        grafo.adcVertice("PANTHERA ANCESTRAL");
        for (String felino : panthera) {
            grafo.adcVertice(felino);//Adiciona os felinos como vértices
            grafo.adcAresta("PANTHERA ANCESTRAL", felino);// Estabelece o relacionamento entre Panthera ancestral e seus descendentes
            int i = 0;
            while(i < panthera.size()-1){
                grafo.adcAresta(felino, panthera.get(i));
                i++;

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
        StringBuilder stringBuilder = new StringBuilder();
                
        for(String felidae : listaDeRelacionados){
            stringBuilder.append(felidae).append("\n");
        }
        
        String resultadoBusca = stringBuilder.toString();
        
        JOptionPane.showMessageDialog(null, "Descendentes/Relacionados: \n" + resultadoBusca, "Grafo " + felino.toUpperCase(), JOptionPane.INFORMATION_MESSAGE);

    }
}

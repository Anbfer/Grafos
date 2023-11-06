package Principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Grafo {
    /*
     * Lista de Adjacências sem peso, utilizado para representar um grafo direcional
     * ou não direcional
     */

    private Map<String, List<String>> grafo;/*
                                             * Map estruturado de uma forma que a mesma chave não se repita, porém
                                             * aceite multiplos valores associados a ela através de uma lista
                                             */

    public Grafo() {
        // Construtor
        grafo = new HashMap<>();
    }

    public void adcVertice(String vertice) {
        /*
         * Adiciona um vértice ao grafo caso ele não contenha um vértice com o mesmo
         * valor
         */
        if (!grafo.containsKey(vertice)) {
            grafo.put(vertice, new ArrayList<>());
        }
    }

    public void adcAresta(String dadoInicio, String dadoFim) {
        // Adiciona uma aresta entre dois vértices, onde a relação começa e onde termina
        if (grafo.containsKey(dadoInicio) && grafo.containsKey(dadoFim) && !dadoInicio.equals(dadoFim)) {
            grafo.get(dadoInicio).add(dadoFim);
            grafo.get(dadoFim).add(dadoInicio);
        }
    }

    public List<String> buscaRelacionados(String vertice) {/*
                                                            * Busca os vértices relacionados a um vértice específico,
                                                            * retornando uma lista com todos eles
         */
        if (grafo.containsKey(vertice.toUpperCase())) {
            return grafo.get(vertice.toUpperCase());

        }
        return null;
    }
}

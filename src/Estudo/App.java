package Estudo;
public class App {
    public static void main(String[] args) throws Exception {
        Grafo<String> grafo = new Grafo<String>();

        grafo.adcVertice("Felino 1");
        grafo.adcVertice("Felino 2");
        grafo.adcVertice("Felino 3");
        grafo.adcVertice("Felino 4");
        grafo.adcVertice("Felino 5");


        grafo.adcAresta("Felino 1", "Felino 2");
        grafo.adcAresta("Felino 2", "Felino 3");
        grafo.adcAresta("Felino 3", "Felino 4");
        grafo.adcAresta("Felino 4", "Felino 5");
        grafo.adcAresta("Felino 5", "Felino 1");


        grafo.buscaEmLargura(0);
    }
}

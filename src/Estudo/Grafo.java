package Estudo;
import java.util.ArrayList;

public class Grafo <TIPO>{
    private ArrayList<Vertice<TIPO>> vertices;
    private ArrayList<Aresta<TIPO>> arestas;

    public Grafo(){
        this.vertices = new ArrayList<Vertice<TIPO>>();
        this.arestas = new ArrayList<Aresta<TIPO>>();
    }

    public void adcVertice(TIPO dado){
        Vertice<TIPO> novoVertice = new Vertice<TIPO>(dado);
        this.vertices.add(novoVertice);
    }

    public void adcAresta(TIPO dadoInicio, TIPO dadoFim){
        Vertice<TIPO> inicio = this.getVertice(dadoInicio);
        Vertice<TIPO> fim = this.getVertice(dadoFim);
        Aresta<TIPO> novaAresta = new Aresta<TIPO>(inicio, fim);
        inicio.adcArestaSaida(novaAresta);
        fim.adcArestaEntrada(novaAresta);
        this.arestas.add(novaAresta);
    }

    public Vertice<TIPO> getVertice(TIPO dado){

        Vertice<TIPO> vertice = null;

        for(int i = 0; i < this.vertices.size(); i++){
            if(this.vertices.get(i).getDado().equals(dado)){
                vertice =  this.vertices.get(i);
                break;
            }
        }
        return vertice;
    }

    //Busca em largura - visita as arestas de saída de cada vértice, tendo aresta de saída
    public void buscaEmLargura(int indiceInicio){
        //Marcar quais os elementos já visitados
        ArrayList<Vertice<TIPO>> visitados = new ArrayList<Vertice<TIPO>>();
        ArrayList<Vertice<TIPO>> fila = new ArrayList<Vertice<TIPO>>();

        //Parte do primeiro elemento
        Vertice<TIPO> atual = this.vertices.get(indiceInicio);
        visitados.add(atual);


        System.out.println(atual.getDado());
        fila.add(atual);
        while (fila.size() > 0) {
            Vertice<TIPO> visitado = fila.get(0);//Pega o primeiro elemento da fila, percorre as arestas de saída
            for (int i = 0; i < visitado.getArestasSaida().size(); i++) {
                Vertice<TIPO> proximo = visitado.getArestasSaida().get(i).getFim();//Pega o vertice no fim da aresta
                if (!visitados.contains(proximo)) {//Verifica se o vertice já foi visitado
                    visitados.add(proximo);
                    System.out.println(proximo.getDado());
                    fila.add(proximo);
                }
            }//passou por todas as arestas
            fila.remove(0);//Remove o primeiro da fila já visitado
        }
    }
}

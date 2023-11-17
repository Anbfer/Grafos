package Principal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Grafo<TIPO> {

    /*
     * Lista de Adjacências sem peso, utilizado para representar um grafo direcional
     * ou não direcional
     */
    private Map<TIPO, List<TIPO>> grafo;/*
                                         * Map estruturado de uma forma que a mesma chave não se repita, porém
                                         * aceite multiplos valores associados a ela através de uma lista
                                         */

    public Map<TIPO, List<TIPO>> getGrafo() {
        return grafo;
    }

    public Grafo() {
        // Construtor
        grafo = new HashMap<>();
    }

    public void adcVertice(TIPO vertice) {
        /*
         * Adiciona um vértice ao grafo caso ele não contenha um vértice com o mesmo
         * valor
         */
        if (!grafo.containsKey(vertice)) {
            grafo.put(vertice, new ArrayList<>());/*
                                                   * Adiciona ao grafo uma chave com o valor definido pelo parâmetro
                                                   * passado e associa a essa cheve um ArrayList vazio para inserção dos
                                                   * dados relacionados posteriormente
                                                   */
        } else {
            JOptionPane.showMessageDialog(null, "Elemento já existe no grafo");
        }

    }

    public void adcAresta(TIPO dadoInicio, TIPO dadoFim) {
        // Adiciona uma aresta entre dois vértices, onde a relação começa e onde termina
        if (grafo.containsKey(dadoInicio) && grafo.containsKey(dadoFim) && !dadoInicio.equals(dadoFim))/*
                                                                                                        * Se o grafo
                                                                                                        * conter a chave
                                                                                                        * correspondente
                                                                                                        * ao dado de
                                                                                                        * início e fim
                                                                                                        * da relação e
                                                                                                        * se o dado de
                                                                                                        * início não for
                                                                                                        * igual ao dado
                                                                                                        * fim, ele
                                                                                                        * executa o
                                                                                                        * bloco que
                                                                                                        * adiciona as
                                                                                                        * relações
                                                                                                        */ {
            grafo.get(dadoInicio).add(dadoFim); // Busca pela chave correspondente ao dado de início, e atribui a ela o
                                                // valor do dado final
            grafo.get(dadoFim).add(dadoInicio);// Busca pela chave correspondente ao dado final, e atribui a ela o valor
                                               // do dado de início
        }

    }

    public List<TIPO> buscaRelacionados(TIPO vertice) {/*
                                                        * Busca os vértices relacionados a um vértice específico,
                                                        * retornando uma lista com todos eles
                                                        */
        if (grafo.containsKey(vertice.toString().toUpperCase()))/*
                                                                 * Busca pela chave correspondente dentro do grafo,
                                                                 * transformando-a em maiuscula para coincidir com o
                                                                 * dado cadastrado
                                                                 */ {
            return grafo.get(vertice.toString().toUpperCase());// Retorna o valor encontrado

        }
        return null;// Retorna uma lista nula caso não haja um dado correspondente
    }

    /*
     * Como parâmetro recebe um ArrayList<String>, e solicita ao usuário os dados
     * que deverão ser relacionados
     */
    public void automatizaExemplos(ArrayList<TIPO> listaExemplos, TIPO familiaExemplos) {
        this.adcVertice(familiaExemplos);
        for (TIPO item : listaExemplos) {
            this.adcVertice(item);
            this.adcAresta(familiaExemplos, item);
            int i = 0;
            while (i < listaExemplos.size() - 1) {
                this.adcAresta(item, listaExemplos.get(i));
                i++;
            }
        }
    }

    public void exibeTodos() {
        // Busca por todos os resultados presentes no grafo instanciado
        Map<TIPO, List<TIPO>> gafoDeTodos = this.getGrafo(); // Map de apoio para armazenar as informações
        StringBuilder stringBuilder = new StringBuilder(); // construtor de string
        for (Map.Entry<TIPO, List<TIPO>> entry : gafoDeTodos.entrySet()) {/*
                                                                           * Laço de repetição para iterar sobre o
                                                                           * conjunto de chaves e valores
                                                                           */
            TIPO chave = entry.getKey();// armazena as chaves
            List<TIPO> valores = entry.getValue();// armazena os valores das chaves
            stringBuilder.append(chave).append(":\n").append(valores).append("\n\n");// grava no string builder,
                                                                                     // conforme a formatação aplicada,
                                                                                     // as chaves e valores
        }

        String resultado = stringBuilder.toString(); // Construtor de string contendo os resultados retornados

        // O código abaixo cria uma tela rolavel para exibir os grafor
        JFrame frame = new JFrame("Todos os Descendentes/Relacionados");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// libera os recursos alocados pela tela após seu
                                                                // fechamento
        frame.setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea(resultado);// cria uma area de texo
        textArea.setEditable(false);// define como não editavel
        textArea.setBorder(null);// retira as bordas
        textArea.setBackground(new Color(233, 233, 233));// define a cor de fundo
        JScrollPane scrollPane = new JScrollPane(textArea);// cria a janela rolavel com a textArea contendo os
                                                           // resultados

        frame.add(scrollPane, BorderLayout.CENTER);// adiciona ao frame a janela rolavel
        frame.setSize(850, 400);// define o tamanho inicial
        frame.setVisible(true);// define a visibilidade
        frame.setLocationRelativeTo(null);// inicia a tela ao centro do monitor

    }
}

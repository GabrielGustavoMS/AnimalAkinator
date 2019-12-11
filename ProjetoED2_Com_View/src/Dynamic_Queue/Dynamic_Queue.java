/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dynamic_Queue;

/**
 *
 * @author logonpta
 */
public class Dynamic_Queue implements TAD_Queue {

    private Node head;
    private Node tail;

    public Dynamic_Queue() {
        head = null;
        tail = null;
    }

    @Override
    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object enqueue(Object x) {
        if (x == null) {
            //Não permitimos inserir um objeto nulo
            return null;
        }
        try {//Para casos de memória insuficiente
            Node novo = new Node();//Aloca memória para o novo nó
            novo.setValue(x);//Atribuir o valor para o nó
            novo.setNext(null);//Colocar enlace nulo
            if (tail == null) {
                //Caso a fila estiver vazia,head e tail apontarão para novo nó
                head = novo;
                tail = novo;

            } else {
                //caso geral
                tail.setNext(novo);//Antiga carta apontará para o novo nó 
                tail = novo;//a nova cauda é o novo nó
            }
            return x;
        } catch (Exception ex) {
            //Memória insuficiente
            return null;
        }
    }

    @Override
    public Object dequeue() {
        //Retira o elemento que está na cabeça da fila dinâmica
        if (head == null) {
            return null;//Impossível retirar de uma fila vazia.
        }
        Object value = head.getValue(); //Pegamos o objeto na cabeça.
        //Node temp = head;//opcional
        head = head.getNext();//Avança a cabeça da fila
        if (head == null) {
            tail = null;//Se ficou vazia
        }
        //temp = null opcional
        return value;//Retorna o valor do objeto que estava na cabeça.

    }

    @Override
    public Object peek() {
        if (head == null) {
            return null;
        } else {
            return head.getValue();

        }
    }

    @Override
    public String toString() {
        //Retorna conteúdo da fila dinâmica
        if (!isEmpty()) {
            String saida = "";
            Node aux = head;
            while (aux != null) {
                //O ponteiro aux percorre a lista
                saida += aux.getValue().toString();
                aux = aux.getNext();
                //Para separar objetos simples usamos, ou separar com \n
                if (aux != null) {
                    saida += " ,";
                }
            }
            return ("f:[" + saida + " ]");
        } else {
            return ("f: []");//Fila vazia
        }
    }

}

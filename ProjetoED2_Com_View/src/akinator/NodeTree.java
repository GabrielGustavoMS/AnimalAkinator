/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akinator;

/**
 *
 * @author Gabriel Gustavo.
 * @param <E>
 */
public class NodeTree <E extends Comparable <E>> {
    private E value;
    private NodeTree filhoEsquerdo;
    private NodeTree filhoDireito;

    public NodeTree(E value) {
        this.value = value;
        this.filhoEsquerdo = null;
        this.filhoDireito = null;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public NodeTree getFilhoEsquerdo() {
        return filhoEsquerdo;
    }

    public void setFilhoEsquerdo(NodeTree filhoEsquerdo) {
        this.filhoEsquerdo = filhoEsquerdo;
    }

    public NodeTree getFilhoDireito() {
        return filhoDireito;
    }

    public void setFilhoDireito(NodeTree filhoDireito) {
        this.filhoDireito = filhoDireito;
    }

    @Override
    public String toString() {
        return value.toString();
        }
    
   
    
    
    
}

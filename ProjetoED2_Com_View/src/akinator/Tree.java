package akinator;

// Java program to construct binary tree from 

import Dynamic_Queue.Dynamic_Queue;

// given array in level order fashion 
  
public class Tree { 
    private NodeTree raiz; 

    public NodeTree getRaiz() {
        return raiz;
    }
    
    public void setRoot(NodeTree root) {
        this.raiz= root;
    }
    
  
  
    // Function to insert nodes in level order 
    public void insertLevelOrder(Object vet[]){
        this.raiz = insertLevelOrder(vet,this.raiz,0);
        
    }
    private NodeTree insertLevelOrder(Object[] arr, NodeTree root, 
                                                int i) 
    { 
        // Base case for recursion 
        if (i < arr.length) { 
            NodeTree temp = new NodeTree((Comparable)arr[i]); 
            root = temp; 
  
            // insert left child 
            root.setFilhoEsquerdo(insertLevelOrder(arr, root.getFilhoEsquerdo(), 
                                             2 * i + 1)); 
  
            // insert right child 
            root.setFilhoDireito(insertLevelOrder(arr, root.getFilhoDireito(), 
                                               2 * i + 2)); 
        } 
        return root; 
    } 
  
    // Function to print tree nodes in InOrder fashion 
    public void inOrder(NodeTree raiz) 
    { 
        if (raiz != null) { 
            inOrder(raiz.getFilhoEsquerdo()); 
            System.out.print(raiz.getValue() + " "); 
            inOrder(raiz.getFilhoDireito()); 
        } 
    } 
     //Imprimir de cima para baixo da esquerda para direita
    public static void emNivel(NodeTree raiz) {
        Dynamic_Queue fila = new Dynamic_Queue();
        fila.enqueue(raiz);
        while (!fila.isEmpty()) {
            NodeTree aux = (NodeTree) fila.dequeue();
            if (aux.getFilhoEsquerdo() != null) {
                fila.enqueue(aux.getFilhoEsquerdo());
            }
            if (aux.getFilhoDireito() != null) {
                fila.enqueue(aux.getFilhoDireito());
            }
            System.out.print(" " + aux.getValue());
        }

    }
  
   
} 
package com.arep.model;

/**
 * Node class
 * @param <E> the type of the data for the node
 */
public class Node<E> {

    private Node left;
    private Node right;
    private E data;

    public Node(E data) {
        this.data = data;
    }

    /**
     * Sets right node pointer
     * @param node the node to set
     */
    public void setRight(Node node){
        right=node;
    }

    /**
     * gets the data of the node
     * @return the data of the node
     */
    public E getData() {
        return data;
    }

    /**
     * sets the data of the node
     * @param data the data to be set
     */
    public void setData(E data) {
        data = data;
    }

    /**
     * checks if node has next pointer
     * @return true if has next
     */
    public boolean hasNext(){
        return right!=null;
    }

    /**
     * checks if node has prior pointer
     * @return true if has prior
     */
    public boolean hasPrior(){
        return left!=null;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}

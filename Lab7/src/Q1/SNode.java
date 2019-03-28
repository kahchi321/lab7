/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1;

/**
 *
 * @author wic180056
 */
public class SNode<E> {
    E element;
    SNode<E> next;
    
    public SNode(E e){
        this.element=e;
    }

    public SNode() {
    }
    
}

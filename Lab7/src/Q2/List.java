/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2;

import Q1.SNode;

/**
 *
 * @author wic180056
 */
public class List<E> {
     private  Node<E> head;
      private Node<E> tail;
      int size=0;
    
      public List(){
          this.head=null;
          this.tail=null;
      }
      
      public void add(E e) {
          if(head==null){
              head=tail=new Node<>(e);
          }
          else{
             tail.next=new Node<>(e);
             tail=tail.next;
          }
          size++;
      }
      
      

}

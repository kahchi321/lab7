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
      
      public void removeElement(E e){      
          Node<E> current=head;
          Node<E> temp;
          for(int i=0;i<size-1;i++){
              if((current.next).element.equals(e)){
                  temp=current.next.next;
                  current.next=temp;}
                  current=current.next;
              }     
          }
      
      public void printList(){
          Node<E> current=head;
          for(int i=0; i<size;i++){
              System.out.print(current.element);
              if(i<size-1)
                  System.out.print(", ");
              current=current.next;
      }}

    public int getSize() {
        return size;
    }
      
     public boolean contains(E e){
          boolean a=false;
          Node<E> current= head;
          for(int i=1;i<size;i++){
              if(current.element.equals(e))
                  a=true;
              current=current.next;
          }
          return a;
      }
     
     public void replace(E e, E newE){
         Node<E> current=head;
         for(int i=0;i<size;i++){
              if(current.element.equals(e)){
                  current.element=newE; 
              } 
              current=current.next;
     }}


}

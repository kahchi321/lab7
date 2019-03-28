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
public class SList<E> {
    private  SNode<E> head;
      private SNode<E> tail;
      int size=0;
    
      public SList(){
          this.head=null;
          this.tail=null;
      }
      
      public void appendEnd(E e){
          if(tail==null){
              tail=head=new SNode<>(e);
                      }
          else{
              tail.next=new SNode<>(e);
              tail=tail.next;
          }
          size++;
      }
      
      public E removeInitial(){
          if(size==0)
              return null;
          else{
              SNode<E> temp=head;
              head=head.next;
              return temp.element;
          }
      }
      
      public boolean contains(E e){
          boolean a=false;
          SNode<E> current= head;
          for(int i=1;i<size;i++){
              if(current.element.equals(e))
                  a=true;
              current=current.next;
          }
          return a;
      }
      
      public void clear(){
          this.head=null;
          this.tail=null;
          size=0;
      }
      
      public void display(){
          SNode<E> current=head;
          for(int i=0; i<size;i++){
              System.out.print(current.element);
              if(i<size-1)
                  System.out.print(", ");
              current=current.next;
          }
          
      }

}

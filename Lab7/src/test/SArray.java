/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author wic180056
 */
public class SArray<E> {

    int occ=0;
    E[] a= (E[])new Object[100];

    public SArray(){
    }
    
    public void appendEnd(E e){
        a[occ]=e;
        occ++;
    }
    
    public E removeInitial(){
        E s=a[0];
        if(occ==0)
            return null;
        else{
        for(int i=0;i<occ-1;i++){
          a[i]=a[i+1];  
        }
        occ--;}
        
        return s;
    }
    
    public boolean contains(E e){
        boolean b=false;
        E element;
        for(int i=0;i<occ;i++){
            element=a[i];
            if(element.equals(e))
                b=true;
        }
        return b;
    }
    
    public void clear(){
        for(int i=0;i<occ;i++){
            a[i]=null;
        }
        occ=0;
    }
    
    public void display(){
        for(int i=0;i<occ;i++){
            System.out.print(a[i]);
            if(i<occ-1)
                System.out.print(", ");
        }
    }
}


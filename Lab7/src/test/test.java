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
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SArray<String> arr=new SArray<>();
        arr.appendEnd("a");
        arr.appendEnd("b");
        arr.appendEnd("c");
        arr.display();
        System.out.println();
        System.out.println(arr.removeInitial());
        System.out.println(arr.contains("difficult"));
        System.out.println(arr.contains("b"));
        arr.appendEnd("d");
        arr.display();
        System.out.println("");
        arr.clear();

 
        
    }
    
}

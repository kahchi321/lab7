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
public class TestList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SList<String> list=new SList<>();
        list.appendEnd("Linked list");
        list.appendEnd("is");
        list.appendEnd("easy");
        list.display();
        System.out.println();
        System.out.println(list.removeInitial());
        System.out.println(list.contains("difficult"));
        list.clear();
    }
    
}

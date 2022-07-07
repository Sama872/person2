/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project2;

/**
 *
 * @author hp
 */
public class project2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s= new String("sama");
        Integer i = new Integer (5);
        System.out.println(s);
        System.out.println(i);
        char a= 'a';//primtive type
        Character c2= new Character ('B');//wrapper type
        String s1="sama", s2 ="sama";
        if (s1==s2){
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }
       double d=Math.sin(5);
       System.out.println(d);
    }
    
}

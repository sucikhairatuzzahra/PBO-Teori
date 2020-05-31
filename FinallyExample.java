/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_Teori;

/**
 *
 * @author hp
 */
public class FinallyExample {
    public static void main(String[] args) 
    { 
        int k = 66; 
        try { 
            System.out.println("In try block"); 
            int z = k / 0; 
            // Carefully see flow dosen't come here 
            System.out.println("Flow dosen't came here"); 
        } 
  
        catch (ArithmeticException e) { 
            System.out.println("In catch block"); 
            System.out.println("Dividing by zero but caught"); 
        } 
  
        finally
        { 
            System.out.println("Executes whether an exception occurs or not"); 
        } 
    } 
}

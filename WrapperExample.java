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
public class WrapperExample {
    public static void main (String args[]){

	Integer integerObject1 = new Integer(1234);
	Integer integerObject2 = new Integer("1234");

	//membuat objek dari wrapper class lalu
	//menggunakan dua tipe argumen dari tipe data primitif dan String

	Double doubleObjek1 = new Double(12.34);
	Double doubleObjek2 = new Double("12.34");

	Boolean booleanObject1 = new Boolean(true);
	Boolean booleanObject2 = new Boolean("true");

	Character characterObjek1 = new Character('0');

	System.out.println("output nilai integer class = " +integerObject1+ " dan "+integerObject2+ " sama."
		+" Max nilai integer :"+ Integer.MAX_VALUE);

	System.out.println("output nilai double class = " +doubleObjek1 + " dan "+doubleObjek2 + " sama."
		+" Max nilai double :"+ Double.MAX_VALUE); 

	System.out.println("output nilai boolean class = " +booleanObject1+ " dan "+booleanObject2+ " sama.");

	System.out.println("output nilai character class = " +characterObjek1);
    }
}

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
public class WrapperExample2 {
    public static void main (String args []){
		//konversi tipe data primitif ke Wrapper Class

		int angka1 = 1234;
		//konversi kedalam Integer
		Integer integerObject1 = Integer.valueOf(angka1);

		System.out.println("Output Nilai 1 : " + integerObject1); //output hasil

		//konversi wrapper class ke tipe data primitif

		Integer integerObject2 = new Integer(4321);
		//konversi ke dalam int
		int angka2 = integerObject2.intValue();
		int nilaiangka2 = angka2;

		System.out.println("Output Nilai 2 : " + nilaiangka2);
	}
}

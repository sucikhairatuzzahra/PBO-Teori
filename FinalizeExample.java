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
public class FinalizeExample {
    protected void finalize() throws Throwable {
        try{
            System.out.println("Inside Finalize() method of Sub Class : FinallyExample");
        }catch(Throwable t){
            throw t;
        }finally{
            System.out.println("Calling finalize() method of Super Class:  Object");
            super.finalize();
        }
    }
 
    public static void main(String[] args) throws Throwable{
        FinalizeExample obj = new FinalizeExample();
        String str=new String("finalize method in java");
        str=null;
        obj.finalize();

    }
}

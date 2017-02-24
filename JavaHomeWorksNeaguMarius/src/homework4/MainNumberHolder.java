/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework4;

/**
 *
 * @author MariusNeagu
 */
public class MainNumberHolder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        NumberHolder instNumberHolder = new NumberHolder();
        instNumberHolder.anInt = 10;
        instNumberHolder.aFloat = 3.5f;
        System.out.println("The value of the int variable is: " + instNumberHolder.anInt);
        System.out.println("The value of the float variable is: " + instNumberHolder.aFloat);

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sunanomaly;

import second.Gamma;
import second.SubAlpha;

/**
 *
 * @author MariusNeagu
 */
public class ClassExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Alpha a = new Alpha();
        Beta b = new Beta();
        Gamma g = new Gamma();
        SubAlpha sa = new SubAlpha();
        
        a.aPublicVariable = 10;
        a.aProtectedVariable = 10;
        b.bProtectedVariable = 30;
        b.bProtectedVariable = 60;
        g.gPublicVariable = 35;
        sa.aProtectedVariable = 15;
        sa.aPublicVariable = 5;
        sa.saPublicVariable = 90;
         
    }
    
}
 
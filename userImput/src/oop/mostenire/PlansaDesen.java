/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.mostenire;

/**
 * Plansa de desen are un triunghi si un patrulater, demonstrareaza relatia HAS A.
 * @author MariusNeagu
 */
public class PlansaDesen {
    private String DESEN = new String("Plansa de desen contine figurile: ");
    private Triunghi triunghi = new Triunghi();
    private Patrulater patrulater = new Patrulater();
    
    public String getDesen(){
        String returnat = DESEN;
        returnat += "\n";
        returnat += triunghi.getDefinitieTriunghi();
        returnat += "\n";
        returnat += patrulater.getDefinitiePatrulater();
        returnat += "\n";
        return(returnat);
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.mostenire;

/**
 * Clasa Triunghi mosteneste FiguraGeometrica si a fost creeata pentru a 
 * explica polimorphismul clasei FiguraGeometrica.
 * @author MariusNeagu
 */
public class Triunghi extends FiguraGeometrica{
    private static String DEFINITIE_TRIUNGHI = new String(" care are 3 laturi este triunghi.");
    //definim metoda patrulaterului si amintim ca el mosteneste si metoda
    //din superclasa!!!
    
    //metoda apeleaza metoda din superclasa getDefinitieFiguraGeometrica care in acest caz este a ei.
    public String getDefinitieTriunghi(){
        return(getDefinitieFiguraGeometrica() + DEFINITIE_TRIUNGHI);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.mostenire;

/**
 * Clasa Patrulater mosteneste FiguraGeometrica si a fost creaata pentru
 * eximplifica reutilizarea codului
 * @author MariusNeagu
 */
public class Patrulater extends FiguraGeometrica {
    private static String DEFINITIE_PATRULATER = new String(" care are patru laturi este patrulater.");
    //definim metoda patrulaterului si reamintim ca el mosteneste si
    //metoda din superclasa
    
    //metoda apeleaza metoda din superclasa getDefinitieFiguraGeometrica care in acest caz este a ei;
    public String getDefinitiePatrulater(){
        return (getDefinitieFiguraGeometrica() + DEFINITIE_PATRULATER);
    }
}

/*
 * Class Gamma
 */
package second;

import sunanomaly.*;

/**
 * Clasa Gamma
 * @author MariusNeagu
 */
public class Gamma {
    
    public int gPublicVariable;
    
    protected int gProtectedVariable;
    
    private int gPrivateVariable;

    /**
     * Get the value of gPrivateVariable
     *
     * @return the value of gPrivateVariable
     */
    public int getgPrivateVariable() {
        return gPrivateVariable;
    }

    /**
     * Set the value of gPrivateVariable
     *
     * @param gPrivateVariable new value of gPrivateVariable
     */
    public void setgPrivateVariable(int gPrivateVariable) {
        this.gPrivateVariable = gPrivateVariable;
    }


    /**
     * Get the value of gProtectedVariable
     *
     * @return the value of gProtectedVariable
     */
    public int getgProtectedVariable() {
        return gProtectedVariable;
    }

    /**
     * Set the value of gProtectedVariable
     *
     * @param gProtectedVariable new value of gProtectedVariable
     */
    public void setgProtectedVariable(int gProtectedVariable) {
        this.gProtectedVariable = gProtectedVariable;
    }


    /**
     * Get the value of gPublicVariable
     *
     * @return the value of gPublicVariable
     */
    public int getgPublicVariable() {
        return gPublicVariable;
    }

    /**
     * Set the value of gPublicVariable
     *
     * @param gPublicVariable new value of gPublicVariable
     */
    public void setgPublicVariable(int gPublicVariable) {
        this.gPublicVariable = gPublicVariable;
    }
    
    public void testAlpha(){
    
        Alpha a = new Alpha();
    
        a.aPublicVariable = 10;
        
    }
}

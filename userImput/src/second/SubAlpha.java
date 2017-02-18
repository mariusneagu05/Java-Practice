/*
 *Class SubAlpha
 */
package second;

import sunanomaly.Alpha;

/**
 * Class SubApha
 * @author MariusNeagu
 */
public class SubAlpha extends Alpha {
    
        public int saPublicVariable;
        
        protected int saProtectedVariable;
        
        private int saPrivateVariable;

    /**
     * Get the value of saPrivateVariable
     *
     * @return the value of saPrivateVariable
     */
    public int getSaPrivateVariable() {
        return saPrivateVariable;
    }

    /**
     * Set the value of saPrivateVariable
     *
     * @param saPrivateVariable new value of saPrivateVariable
     */
    public void setSaPrivateVariable(int saPrivateVariable) {
        this.saPrivateVariable = saPrivateVariable;
    }


    /**
     * Get the value of saProtectedVariable
     *
     * @return the value of saProtectedVariable
     */
    public int getSaProtectedVariable() {
        return saProtectedVariable;
    }

    /**
     * Set the value of saProtectedVariable
     *
     * @param saProtectedVariable new value of saProtectedVariable
     */
    public void setSaProtectedVariable(int saProtectedVariable) {
        this.saProtectedVariable = saProtectedVariable;
    }


    /**
     * Get the value of saPublicVariable
     *
     * @return the value of saPublicVariable
     */
    public int getSaPublicVariable() {
        return saPublicVariable;
    }

    /**
     * Set the value of saPublicVariable
     *
     * @param saPublicVariable new value of saPublicVariable
     */
    public void setSaPublicVariable(int saPublicVariable) {
        this.saPublicVariable = saPublicVariable;
    }
    
    public void testAlpha(){
        
        super.aPublicVariable = 10;
        super.aProtectedVariable = 20;
    }     
}

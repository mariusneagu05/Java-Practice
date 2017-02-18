/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sunanomaly;

/**
 *
 * @author MariusNeagu
 */
public class Beta {
    
        public int bPublicVariable;
        
        protected int bProtectedVariable;
    
        private int bPrivateVariable;

    /**
     * Get the value of bPrivateVariable
     *
     * @return the value of bPrivateVariable
     */
    public int getbPrivateVariable() {
        return bPrivateVariable;
    }

    /**
     * Set the value of bPrivateVariable
     *
     * @param bPrivateVariable new value of bPrivateVariable
     */
    public void setbPrivateVariable(int bPrivateVariable) {
        this.bPrivateVariable = bPrivateVariable;
    }


    /**
     * Get the value of bProtectedVariable
     *
     * @return the value of bProtectedVariable
     */
    public int getbProtectedVariable() {
        return bProtectedVariable;
    }

    /**
     * Set the value of bProtectedVariable
     *
     * @param bProtectedVariable new value of bProtectedVariable
     */
    public void setbProtectedVariable(int bProtectedVariable) {
        this.bProtectedVariable = bProtectedVariable;
    }


    /**
     * Get the value of bPublicVariable
     *
     * @return the value of bPublicVariable
     */
    public int getbPublicVariable() {
        return bPublicVariable;
    }

    /**
     * Set the value of bPublicVariable
     *
     * @param bPublicVariable new value of bPublicVariable
     */
    public void setbPublicVariable(int bPublicVariable) {
        this.bPublicVariable = bPublicVariable;
    }
    
    public void testAccessToA(){
        
        Alpha a = new Alpha();
        
        a.aProtectedVariable = 10;
        a.aPublicVariable = 20;
        
    }

}

/*
 * Alpha Class
 */
package sunanomaly;

/**
 * Alpha Class
 * @author MariusNeagu
 */
public class Alpha {
    
    public int aPublicVariable;
        
    protected int aProtectedVariable;
    
    private int aPrivateVariable;

    /**
     * Get the value of aPrivateVariable
     *
     * @return the value of aPrivateVariable
     */
    public int getaPrivateVariable() {
        return aPrivateVariable;
    }

    /**
     * Set the value of aPrivateVariable
     *
     * @param aPrivateVariable new value of aPrivateVariable
     */
    public void setaPrivateVariable(int aPrivateVariable) {
        this.aPrivateVariable = aPrivateVariable;
    }


    /**
     * Get the value of aProtectedVariable
     *
     * @return the value of aProtectedVariable
     */
    public int getaProtectedVariable() {
        return aProtectedVariable;
    }

    /**
     * Set the value of aProtectedVariable
     *
     * @param aProtectedVariable new value of aProtectedVariable
     */
    public void setaProtectedVariable(int aProtectedVariable) {
        this.aProtectedVariable = aProtectedVariable;
    }


    /**
     * Get the value of aPublicVariable
     *
     * @return the value of aPublicVariable
     */
    public int getaPublicVariable() {
        return aPublicVariable;
    }

    /**
     * Set the value of aPublicVariable
     *
     * @param aPublicVariable new value of aPublicVariable
     */
    public void setaPublicVariable(int aPublicVariable) {
        this.aPublicVariable = aPublicVariable;
    }

}

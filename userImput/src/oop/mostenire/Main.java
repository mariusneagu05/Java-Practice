
package oop.mostenire;

/**
 *
 * @author MariusNeagu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Main t1 = new Main();
       Main t2 = new Main();
       
       if(!t1.equals(t2))
           System.out.println("Instantele nu sunt egale");
       if(t1 instanceof Object)
           System.out.println("instanta t1 este un Obiect");      
       /**
       * Vom demonsta acum mostenirea codului si eliminarea redundantei utilizari lui
       * pe clasele FiguraGeometrica si Patrulater
       */
       System.out.println("+++++++++++++++ REUTILIZAREA CODULUI +++++++++++++");
       Patrulater patrulater = new Patrulater();
       String definitiePatrulater = patrulater.getDefinitiePatrulater();
       System.out.println(patrulater.getDefinitieFiguraGeometrica());
       System.out.println(patrulater.getDefinitiePatrulater());
       System.out.println("+++++++++++ POLIMORPHISM ++++ RELATIA IS A++++++++++++++");
       /**
        * Vom demonstra acum polimorphismul prin care FiguraGeometrica ia atat forma de Patrulater
        * cat si de Triunghi, ambele figuri geometrice avand idenditati propri.
        */
       Triunghi triunghi = new Triunghi();
       System.out.println(triunghi.getDefinitieFiguraGeometrica());
       System.out.println(triunghi.getDefinitieTriunghi());
       System.out.println(patrulater.getDefinitiePatrulater());
       /**
        * Vom demonstra relatia HAS a printr-un desen care are pe el un triunghi si un patrulater
        * De asemenea subliniem ca FiguraGeometrica DELEAGA definirea completa fiilor ei.
        */
       PlansaDesen plansa = new PlansaDesen();
       System.out.println("+++++++Relatia HAS A - plansa desen are un triunghi si un patrulater ++++++++++");
       System.out.println(plansa.getDesen());
    }
    
}

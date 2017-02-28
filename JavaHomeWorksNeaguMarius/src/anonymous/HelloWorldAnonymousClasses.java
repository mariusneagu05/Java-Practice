/*
 * In this program the anonymous classes frenchGreeting and 
 * spanishGreeting are changed with named local classes
 * 
 */
package anonymous;

/**
 * Change Anonymous classes with named local classes
 * @author MariusNeagu
 */
public class HelloWorldAnonymousClasses {

    //inner interface HelloWorld
    interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
    }
  
    //method sayHello()
    public void sayHello() {
        
        //local class EnglishGreeting implemented in the sayHello() method
        class EnglishGreeting implements HelloWorld {
            String name = "world";
            @Override
            public void greet() {
                greetSomeone("world!");
            }
            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }
        //local class FrenchGreeting implemented in the sayHello() method
        class FrenchGreeting implements HelloWorld {
            String name = "tout le monde";
            @Override
            public void greet() {
                greetSomeone("tout le monde!");
            }
            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        }
        //local class SpanishGreeting implemented in the sayHello() method
        class SpanishGreeting implements HelloWorld {
            String name = "mundo";
            @Override
            public void greet() {
                greetSomeone("mundo!");
            }
            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola " + name);
            }
        }
        //creating objects/instances for all the classes
        HelloWorld englishGreeting = new EnglishGreeting();
        HelloWorld frenchGreeting = new FrenchGreeting();
        HelloWorld spanishGreeting = new SpanishGreeting();
        
        //calling the local classes methods
        englishGreeting.greet();
        frenchGreeting.greet();
        frenchGreeting.greetSomeone("Pierre!");
        spanishGreeting.greet();
    }
    //main method
    public static void main(String[] args) {
        HelloWorldAnonymousClasses myApp = new HelloWorldAnonymousClasses();
        myApp.sayHello();
    }            
}
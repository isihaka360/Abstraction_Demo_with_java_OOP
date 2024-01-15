/**
 * Demo for abstraction
 * This is abbstract class with one abstract method
 */
public abstract class Demo {

    public abstract void display();

    
}
/*
 * This is concrete class with the definiton of the abstract method inherited from
 * the abstract class
 */
class ClassB extends Demo {

    

    public void display(){

        System.out.println("I'M CLASS A");
    }
    
}
/**
 * Here is where the object is defined
 * The main class consists of the main method for Execution
 */
class Main {

    public static void main(String[] args) {

        ClassB obj = new ClassB();
        obj.display();
        
    }
    
}

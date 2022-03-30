public class Species
{
    // Attributes ("State") of all Species objects
    String name;
    int age;
    int heightInInches;
    double weight;
    
    
    // Classes contain "instructions" on how Objects can be Created.
    // Similar to a birth method - how an individual species will be born
    // In Java - this method is called a "Constructor" method
    // Which creates a unique "instance" (example) of the Species Class
    
    // This constructor method is the default constructor method - technically
    // it does not need to be defined.  This method would be available by default
    // even without instruction
    public Species()
    {
        
    }
    
    public Species (String name, int age, int heightInInches, double weight)
    {
        this.name = name;
        this.age = age;
        this.heightInInches = heightInInches;
        this.weight = weight;
    }
    
    
    // Classes contain "instructions" on how Objects carry out certain "Behaviors".
    //These "instructions" are called "methods".
    // The methods ("Behaviors" or "actions") of the class will go here
    
    // To Speak is a "behavior" of the Species class - yes the animals can talk.  This is Disney!
    public void speak()
    {
        System.out.println("Hi, my name is " + name + ".");
        System.out.println("I am " + age + " years old.");
        System.out.println("I am " + heightInInches + " inches tall.");
    }
    
    
    // To Eat is another "Behavior" of the Giraffe class
    public void eat()
    {
        System.out.println(name + " is eating ...");
    }
    
    
    // To Walk is another "Behavior" of the Giraffe class
    public void walk()
    {
        System.out.println(name + " is walking ...");
    }
    
    
    // To Sleep is another "Behavior" of the Giraffe class
    public void sleep()
    {
        System.out.println(name + " is sleeping ...");
    }
 
    // Since this class does not have a main method,
    // nothing will happen when you run it.
}
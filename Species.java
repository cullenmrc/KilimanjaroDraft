public class Species
{
    // Attributes ("State") of all Species objects
    String name;
    int age;
    
    
    // Classes contain "instructions" on how Objects can be Created.
    // Similar to a birth method - how an individual species will be born
    // In Java - this method is called a "Constructor" method
    // Which creates a unique "instance" (example) of the Species Class
    
    
    public Species (String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    
    
    // Classes contain "instructions" on how Objects carry out certain "Behaviors".
    //These "instructions" are called "methods".
    // The methods ("Behaviors" or "actions") of the class will go here
    
    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }
    
    
    // To Speak is a "behavior" of the Species class - yes the animals can talk.  This is Disney!
    public void speak()
    {
        System.out.println("Hi, my name is " + name + ".");
        System.out.println("I am " + age + " years old.");
    }
    
    
    // To Eat is another "Behavior" of the Species class
    public void eat()
    {
        System.out.println(name + " is eating ...");
    }
    
    
    // To Walk is another "Behavior" of the Species class
    public void walk()
    {
        System.out.println(name + " is walking ...");
    }
    
    
    // To Sleep is another "Behavior" of the Species class
    public void sleep()
    {
        System.out.println(name + " is sleeping ...");
    }
    
    
    
    // The toString() method is found in the global "Object" class
    public String toString()
    {
        return "Name: " + name + "\nAge: " + age;
    }
 
    // Since this class does not have a main method,
    // nothing will happen when you run it.
}
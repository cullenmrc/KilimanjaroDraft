public class Giraffe extends Species
{
    // Attributes ("State") of all Giraffe objects
    int heightInInches;
    double weight;
    
    
    // Classes contain "instructions" on how Objects can be Created.
    // Similar to a birth method - how an individual giraffe will be born
    // In Java - this method is called a "Constructor" method
    // Which creates a unique "instance" (example) of the Giraffe Class
    
    
    /**
     * The Student object only stores grade and gpa. Notice
     * how the contructor takes all 4 variables and passes
     * two of them up to the Person superclass
     */
    public Giraffe(String name, int age, int heightInInches, double weight)
    {
        super(name, age, true);  // Passes to Superclass Species
        this.heightInInches = heightInInches;   // Stored in Giraffe object
        this.weight = weight;   // Stored in Giraffe object
    }
    
    
    // Classes contain "instructions" on how Objects carry out certain "Behaviors".
    //These "instructions" are called "methods".
    // The methods ("Behaviors" or "actions") of the class will go here
    
    public int getHeightInInches()
    {
    	return heightInInches;
    }
    
    public double getWeight()
    {
    	return weight;
    }
    
    
    /* 
    public void hoofTrim()
    {
        
    }
    
    */
 
    // Since this class does not have a main method,
    // nothing will happen when you run it.
    
    
}
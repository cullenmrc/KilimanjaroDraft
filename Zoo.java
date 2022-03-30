public class Zoo
{
    // The Main method is the entry point of all Java applications
    // Code is executed sequentially - line by line - within the Main method
    public static void main(String args[])
    {
        Species mySpecies = new Species("Mickey", 93, false);
        Giraffe motherGiraffe = new Giraffe("Kenya", 11, 160, 2500);
        Giraffe daughterOne = new Giraffe("Amira", 4, 150, 2301.75);
        Giraffe daughterTwo = new Giraffe("Mara", 1, 96, 1815.25);
        
        
        /**
         * With the giraffe, we have access to methods from the 
         * Species class and the Giraffe class.
         */
         
        System.out.println(motherGiraffe);
        System.out.println("Giraffe's height: " + motherGiraffe.getHeightInInches() + " inches");
        System.out.println("Giraffe's weight: " + motherGiraffe.getWeight() + " pounds");
        System.out.println("Is endangered?: " + motherGiraffe.isEndangered());
        System.out.println(" =================================================================== ");
        
        System.out.println(daughterOne);
        System.out.println("Giraffe's height: " + daughterOne.getHeightInInches() + " inches");
        System.out.println("Giraffe's weight: " + daughterOne.getWeight() + " pounds");
        System.out.println("Is endangered?: " + daughterOne.isEndangered());
        System.out.println(" =================================================================== ");
        
        System.out.println(daughterTwo);
        System.out.println("Giraffe's height: " + daughterTwo.getHeightInInches() + " inches");
        System.out.println("Giraffe's weight: " + daughterTwo.getWeight() + " pounds");
        System.out.println("Is endangered?: " + daughterTwo.isEndangered());
        System.out.println(" =================================================================== ");
        
        /**
         * With the species, we only have access to methods from 
         * the Species class.
         */
         
        System.out.println("Species Name: " + mySpecies.getName());
    }
}
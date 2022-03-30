public class Zoo
{
    // The Main method is the entry point of all Java applications
    // Code is executed sequentially - line by line - within the Main method
    public static void main(String args[])
    {
        Species mySpecies = new Species("Mickey", 93);
        Giraffe motherGiraffe = new Giraffe("Kenya", 11, 160, 2500);
        
        /**
         * With the giraffe, we have access to methods from the 
         * Species class and the Giraffe class.
         */
         
        System.out.println("Giraffe's Name: " + motherGiraffe.getName());
        System.out.println("Giraffe's Height: " + motherGiraffe.getHeightInInches());
        
        /**
         * With the person, we only have access to methods from 
         * the Person class.
         */
         
        System.out.println("Species Name: " + mySpecies.getName());
    }
}
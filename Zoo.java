public class Zoo
{
    // The Main method is the entry point of all Java applications
    // Code is executed sequentially - line by line - within the Main method
    public static void main(String args[])
    {
        // defines a variable named motherGiraffe with a data type of Giraffe
        Giraffe motherGiraffe;
        
        // the variable motherGiraffe now needs to be assigned a value
        // We assign the variable firstGiraffe a NEW Giraffe object
        motherGiraffe = new Giraffe();
        
        // Now lets ask motherGiraffe to speak
        // What happens when we compile and run the main method after asking
        // motherGiraffe to speak?
        motherGiraffe.speak();
    }
}
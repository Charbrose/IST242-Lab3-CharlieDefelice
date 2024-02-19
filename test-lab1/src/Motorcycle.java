// A class to test the Motorcycle class
public class Motorcycle {
    public static void main(String[] args) {
        // Create a brand object
        Brand b1 = new Brand("Honda");

        // Create a year object
        Year y1 = new Year(2020);

        // Create a model object
        Model m1 = new Model("CBR1000RR-R");

        // Create a motorcycle object using the brand, year, and model objects
        Motorcycle mc1 = new Motorcycle(b1, y1, m1);

        // Display the details of the motorcycle
        mc1.display();
    }
}
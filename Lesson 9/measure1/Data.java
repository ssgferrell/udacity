public class Data {
    /**
       Computes the average area of the given countries.
       @param objects an array of Country objects
       @return the average of the areas
    */
    public static double average(Country[] objects) {
        // TODO: Compute the average area
        double sum = 0;
        double average; 
        
        for (Country thisCountry : objects)
        {
            sum += thisCountry.getArea();
        }
        
        average = sum / objects.length;
        
        return average;
    }
}

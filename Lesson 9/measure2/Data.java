// BlueJ project: lesson9/measure2
public class Data {
    /**
       Computes the average area of the given countries.
       @param objects an array of Country objects
       @return the average of the areas
    */
    public static double average(Country[] objects) {
        double sum = 0;
        double average = 0;
        int arraySize = objects.length;
        
        for (Country obj : objects) {
            sum += obj.getArea();
        }
        if (arraySize > 0) {
            return sum / arraySize;
        }
        
        return average;
    }

    /**
       Computes the average fuel efficency of the given cars.
       @param objects an array of Car objects
       @return the average of the fuel efficiencies
    */
    public static double average(Car[] objects) {
        double sum = 0; 
        double average = 0;
        int arraySize = objects.length;
        
        for (Car thisCar : objects) {
            sum += thisCar.getFuelEfficiency();
        }
        
        if (arraySize > 0) {
            average = sum / arraySize;
        }
        return average;
    }
}

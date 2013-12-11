public class Data {
    /**
       Computes the average measure of the given objects.
       @param objects an array of Measurable objects
       @return the average of the measures
    */
    public static double average(Measurable[] objects) {
        // TODO: Compute the average measure
        double sum = 0;
        int arraySize = objects.length;
        double average = 0;
        
        for (Measurable obj : objects) {
            sum += obj.getMeasure();
        }
        
        if (arraySize > 0) {
            average = sum / arraySize;
        }
        
        return average;
    }
}
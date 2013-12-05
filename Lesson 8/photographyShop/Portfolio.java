// Do you need a Portfolio object to simulate
// the photography shop?
// Write a class Portfolio if you need a portfolio
// to implement your design.
import java.util.ArrayList;

public class Portfolio {
    private String completedAssignment;
    private Photographer photographer;
    
    public Portfolio(String photoName, Photographer photog) {

        completedAssignment = photoName;
        photographer = photog;
    }
    
    public String getPhotoName() {
        return completedAssignment;
    }
    
    public Photographer getPhotog() {
        return photographer;
    }
}

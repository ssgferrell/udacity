// What should an Assignment do?
// How do you want to use it for this program?
// You can put any code related to the Assignment class you
// want in here.

public class Assignment {
    private String name;
    private int priority;
    public Assignment(int priority, String description) {
        name = description;
        this.priority = priority;
    }
    /**
     * Gets the priority assigned to this Assignment. The higher the number the higher the priority.
     * @return Priority level.
     */
    public int getPriority() {
        return priority;
    }
    /**
     * Gets the name of this assignment. 
     * @return The Assignment's name.
     */
    public String getName() {
        return name;
    }
}

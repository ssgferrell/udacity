// TO-DO
// Fill in the methods in the manager class so
// that when the simulation runs, and simulates the
// story, the assignments are assigned to photographers
// in the correct order, and printed out with photographers
// signatures below them in the order in which they are completed.
import java.util.ArrayList;

public class Manager {
    // YOUR CODE HERE
    // What does the manager need to remember to do his/her job?
    private ArrayList<Photographer> employees;
    private ArrayList<Assignment> jobs;
    private ArrayList<Portfolio> allDone;
    
    public Manager() {
        // YOUR CODE HERE
        // How do you need to initialize the instance variables?
        employees = new ArrayList<Photographer>();
        jobs = new ArrayList<Assignment>();
        allDone = new ArrayList<Portfolio>();

    }

    /**
     * Called when it's time to hire a new photographer.
     */
    public void hire(String photogsName) {
        // YOUR CODE HERE
        // How will you keep track of the photographers you have hired?
        Photographer photog = new Photographer(photogsName);
        employees.add(photog);
    }

    /**
     * Called when it's time for the daily meeting where
     * the highest priority assignments are given to photographers.
     * Each photographer can take one assignment. The highest priority
     * assignment should be given out first and the highest priority
     * assignment should go to the photographer who was hired first.
     */
    public void giveOutAssignments() {
        int numberOfJobs = jobs.size();
        int numberOfEmployees = employees.size();
        
        if (numberOfJobs > 0 && numberOfEmployees > 0) {
            for (Photographer thisPhotog : employees) {
                int highPriority = 0;
                int indexOfHighest = -1;
                //Picture importantPhoto = new Picture();
                if (jobs.size() > 0) {
                    for (int thisJob = 0; thisJob < jobs.size(); thisJob++) {
                        int jobPriority = jobs.get(thisJob).getPriority();
                        if (jobPriority > highPriority) {
                            highPriority = jobPriority;
                            indexOfHighest = thisJob;
                        }
                    }
                    String highestPriority = jobs.get(indexOfHighest).getName();
                    //System.out.println(thisPhotog.getName() + " " + highestPriority); //test to see which assignments went to which photographers.
                    Portfolio completedJob = new Portfolio (highestPriority, thisPhotog);
                    allDone.add(completedJob);
                    
                    jobs.remove(indexOfHighest);
                } 
     
            }
        }
        else {
            System.out.println("There aren't any jobs today! Check for new assignments or hire new photographers and check back tomorrow!");
        }
    }

    /**
     * A Customer came up with a new assignment. The manager should
     * add it to the to-do list so that next time it's time to give
     * out assignments, the new assignment will be a possibility.
     * @param priority The priority 
     */
    public void newAssignment(int priority, String description) {
        // YOUR CODE HERE
        // How will you keep track of the unfinished assignments?
        Assignment newJob = new Assignment(priority, description);
        jobs.add(newJob); //can I do this in one step?
    }

    /**
     * It's the end of the story for now. Time to look at all the
     * work the company has done.
     */
    public void checkPortfolio() {
        // YOUR CODE HERE
        // You may need to display all the finished work when
        // this method is called, or you may have been displaying
        // the photos as you went. If you have already displayed
        // the photos, there is no need to do anything here.
        int x = 0;

        for (Portfolio p : allDone) {
            int y = 0; // y resets to 0 for every pass through the loop so the pictures display in a horizontal line
            String photoName = p.getPhotoName();
            Photographer photographer = p.getPhotog();
            String photogName = photographer.getName();
            Picture completedAssignment = new Picture(photographer.takePicture(photoName)); //creates a new Picture
            
            //draws picture
            completedAssignment.draw();
            completedAssignment.translate(x, 0);
            
            //changes Y to the height of the photo, makes a signature and prints it below the photo
            y = completedAssignment.getHeight();
            Text signature = new Text(x, y, photogName);
            signature.draw();
            
            // increases x by the current picture width so the pictures touch but do not overlap.
            x += completedAssignment.getWidth();
        }
    }
}

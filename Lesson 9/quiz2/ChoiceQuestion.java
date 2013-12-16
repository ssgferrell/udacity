import java.util.ArrayList;

/**
   A question with multiple choices.
*/
public class ChoiceQuestion extends Question
{
    ArrayList<String> choices;

    /**
       Constructs a choice question with no choices.
    */
    public ChoiceQuestion()
    {
        choices = new ArrayList<String>();
    }

    /**
       Adds an answer choice to this question.
       @param choice the choice to add
       @param correct true if this is the correct choice, false otherwise
    */
    public void addChoice(String choice, boolean correct)
    {
        // TODO: Add choice to choices.
        // Ignore the "correct" parameter for now
        choices.add(choice);
    }

    public void display()
    {
        // For now, just print the choices
        System.out.println(choices);
    }
}


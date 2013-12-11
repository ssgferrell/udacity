// BlueJ project: lesson9/scene2

import java.util.ArrayList;

public class Scene
{
    public static void main(String[] args)
    {
        // TODO: Change to an ArrayList<Drawable>

        ArrayList<Drawable> element = new ArrayList<Drawable>();
            element.add(new Car(100, 300));
            element.add(new Car(250, 300));
            element.add(new Car(250, 350));
            element.add(new House(100, 150, 100, 100));
            element.add(new House(250, 100, 150, 150));
            element.add(new Dog(200, 100, "Fido.jpg"));
            element.add(new Dog(100, 400, "Rex.jpg"));
            element.add(new Dog(200, 400, "Lucky.jpg"));

        // TODO: Change to a single loop
        for (Drawable d : element)
        {
            d.draw();
        }
    }
}

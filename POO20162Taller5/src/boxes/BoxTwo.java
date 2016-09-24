package boxes;

import java.util.Collection;

public abstract class BoxTwo
{

    // ----------------------------------------------------------------- ATTRIBUTES

    // ----------------------------------------------------------------- CONSTRUCTORS

    // ----------------------------------------------------------------- METHODS

    public abstract void add (Thing thing);

    public void add (Collection <Thing> things)     /* SO: This shit takes the elements of a collection of Thing
                                                       objects and adds them to something in some way using the method
                                                       add ( Thing ). The destination of those objects is given by
                                                       the add ( Thing ) implementation! */
    {
        for (Thing thing : things)
        {
            add(thing);
        }
    }

    public abstract boolean isInTheBox(Thing thing);
}

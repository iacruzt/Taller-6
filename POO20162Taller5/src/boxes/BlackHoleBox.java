package boxes;

import java.util.*;

public class BlackHoleBox extends BoxTwo
{

    // ----------------------------------------------------------------- ATTRIBUTES

    private Set < Thing > things;

    // ----------------------------------------------------------------- CONSTRUCTORS

    public BlackHoleBox ()
    {
        // Default constructor :D
        things = new HashSet < Thing > ();
    }

    // ----------------------------------------------------------------- METHODS

    public void add ( Thing thing )
    {
        things.add ( thing );
    }

    public boolean isInTheBox ( Thing thing )
    {
        return false;
    }


}

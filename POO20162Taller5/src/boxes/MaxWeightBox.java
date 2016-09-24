package boxes;

import java.util.*;

public class MaxWeightBox extends BoxTwo
{

    // ----------------------------------------------------------------- ATTRIBUTES

    private double maxWeight;
    private List < Thing > things;

    // ----------------------------------------------------------------- CONSTRUCTORS

    public MaxWeightBox ()
    {
        // Default constructor!
        things = new ArrayList < Thing > ();
    }

    public MaxWeightBox ( double newMaxWeight ) throws IllegalArgumentException
    {
        if ( newMaxWeight >= 0 )
        {
            this.setMaxWeight( newMaxWeight );
            things = new ArrayList < Thing > ();
        }
        else
        {
            throw new IllegalArgumentException ( " The maximum weight can't be negative! " );
        }
    }

    // ----------------------------------------------------------------- METHODS

    public void setMaxWeight ( double newMaxWeight )
    {
        this.maxWeight = newMaxWeight;
    }

    public double getMaxWeight ()
    {
        return this.maxWeight;
    }

    public double getCurrentWeight ()
    {
        double currentWeight;

        currentWeight = 0.0;
        for ( Thing aThing : things )
        {
             currentWeight = currentWeight + aThing.getWeight();
        }

        return currentWeight;
    }

    public void add ( Thing thing )
    {
        if ( ( thing.getWeight() + this.getCurrentWeight() ) <= this.getMaxWeight() )
        {
            things.add ( thing );
        }

    }

    public boolean isInTheBox ( Thing thing )
    {
        boolean isInTheBox;

        if ( things.contains( thing ) )
        {
            isInTheBox = true;
        }
        else
        {
            isInTheBox = false;
        }

        return isInTheBox;
    }

}

import java.util.ArrayList;

public class Box implements ToBeStored
{

    // -------------------------------------------------------------------- ATTRIBUTES

    private double maxWeight;
    private ArrayList <ToBeStored> things = new ArrayList <ToBeStored> ();

    // -------------------------------------------------------------------- CONSTRUCTORS

    public Box ()
    {
        // Default constructor here!
    }

    public Box ( double newMaxWeight )
    {
        this.setMaxWeight( newMaxWeight );
        this.things = new ArrayList <ToBeStored> ();
    }

    // -------------------------------------------------------------------- METHODS

    public double getMaxWeight()
    {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight)
    {
        this.maxWeight = maxWeight;
    }

    public double weight()
    {
        double totalWeight;

        totalWeight = 0.0;
        for ( ToBeStored thing : things )
        {
            totalWeight = totalWeight + thing.weight(); // "weight()" is a method that all objects of all classes
                                                        // implementing ToBeStored interface gotta have. This allows
                                                        // us to use it here in order to take advantage of
                                                        // polymorphism.
        }

        return totalWeight;
    }

    public boolean add ( ToBeStored thing )
    {
        boolean succesful;

        succesful = true;
        if ( ( this.weight() + thing.weight() ) > this.getMaxWeight() )
        {
            succesful = false;
        }
        else
        {
            things.add( thing );
        }

        return succesful;
    }

    public String toString ()
    {
        return ( "Box: " + things.size() + " things, total weight: " + this.weight() );
    }

}

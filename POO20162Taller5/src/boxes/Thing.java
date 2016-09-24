package boxes;

public class Thing
{

    // ----------------------------------------------------------------- ATTRIBUTES

    private double weight;
    private String name;

    // ----------------------------------------------------------------- CONSTRUCTORS

    public Thing ()
    {
        // Default constructor!
    }

    public Thing ( String newName )
    {
        this.setName ( newName );
    }

    public Thing ( String newName , double newWeight  ) throws IllegalArgumentException
    {
        if ( newWeight >= 0 )
        {
            this.setWeight ( newWeight );
            this.setName ( newName );
        }
        else
        {
            throw new IllegalArgumentException ( "Weight can't be negative!" );
        }
    }

    // ----------------------------------------------------------------- METHODS

    public void setWeight ( double newWeight )
    {
        this.weight = newWeight;
    }

    public double getWeight ()
    {
        return this.weight;
    }

    public void setName ( String newName )
    {
        this.name = newName;
    }

    public String getName ()
    {
        return this.name;
    }

    @Override
    public boolean equals ( Object another )
    {
        boolean equal;

        if ( another == null )
        {
            equal = false;
        }
        else if ( this.getClass() != another.getClass() )
        {
            equal = false;
        }
        else
        {
            Thing anotherThing = ( Thing ) ( another );

            if ( !( this.getName().equals(anotherThing.getName()) ) )
            {
                equal = false;
            }
            else
            {
                equal = true;
            }
        }

        return equal;
    }

    @Override
    public int hashCode ()
    {
        return this.getName().hashCode();
    }
}

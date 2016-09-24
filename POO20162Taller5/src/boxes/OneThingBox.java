package boxes;

public class OneThingBox extends BoxTwo
{

    // ----------------------------------------------------------------- ATTRIBUTES

    private Thing theThing;

    // ----------------------------------------------------------------- CONSTRUCTORS

    // ----------------------------------------------------------------- METHODS

    public void setTheThing ( Thing thing )
    {
        this.theThing = thing;
    }

    public Thing getTheThing ()
    {
        return this.theThing;
    }

    public void add ( Thing thing )
    {
        if ( this.getTheThing() == null )
        {
            this.setTheThing( thing );
        }
    }

    public boolean isInTheBox ( Thing thing )
    {
        return this.getTheThing().equals( thing );
    }

}

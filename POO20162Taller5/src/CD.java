public class CD implements ToBeStored
{

    // -------------------------------------------------------------------- ATTRIBUTES

    private String artist;
    private String title;
    private int publishingYear;
    private final double weight = 0.1;

    // -------------------------------------------------------------------- CONSTRUCTOR

    public CD ()
    {
        // Default constructor here!
    }

    public CD ( String newArtist, String newTitle, int newPublishingYear)
    {
        this.setArtist( newArtist );
        this.setTitle( newTitle );
        this.setPublishingYear( newPublishingYear );
    }

    // -------------------------------------------------------------------- METHODS

    public String getArtist()
    {
        return artist;
    }

    public void setArtist(String artist)
    {
        this.artist = artist;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public int getPublishingYear()
    {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear)
    {
        this.publishingYear = publishingYear;
    }

    public double getWeight()
    {
        return weight;
    }

    public double weight ()
    {
        return this.getWeight();
    }

    public String toString ()
    {
        return ( this.getArtist() + ": " + this.getTitle() + " (" + this.getPublishingYear() + ")" );
    }

}

public class Book implements ToBeStored
{

    // -------------------------------------------------------------------- ATTRIBUTES

    private String writer;
    private String title;
    private double weight;

    // -------------------------------------------------------------------- CONSTRUCTOR

    public Book()
    {
        // Default constructor here!
    }

    public Book(String newWriter, String newTitle, double newWeight)
    {
        this.setWriter(newWriter);
        this.setTitle(newTitle);
        this.setWeight(newWeight);
    }

    // -------------------------------------------------------------------- METHODS

    public String getWriter()
    {
        return writer;
    }

    public void setWriter(String writer)
    {
        this.writer = writer;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public String toString()
    {
        return (this.getWriter() + ": " + this.getTitle());
    }

    public double weight()
    {
        return this.getWeight();
    }

    // ----------------------------------------------------------------- TEST

    public static void main(String[] args)
    {
        Box box = new Box(10);
        Box bax = new Box (20);

        box.add(new Book("Fedor Dostojevski", "Crime and Punishment", 2));
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 45));

        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        bax.add( new Book ( "Tom Hanks", "How to be Tom Hanks", 10 ) );
        bax.add( box );
        /*
        box.add ( box ); This will cause a StackOverflow error. Why? Because we're calling box's toString method
                         below, and such method asks for box's weight, and to compute such a thing we gotta sum the
                         weight of each thing inside of box... And box is inside of it self, so we have to add box's
                         weight to it self, over, and over... It's a never rending operation!

                         [IT WOULD BE NICE TO TALK ABOUT THIS ON CLASS...]
        */

        System.out.println ( box );
        System.out.println ( bax ); // An instance of the Box class and contain (it's "add()" method allows it to)
                                    // only objects that implement ToBeStored... And all those objects are such that
                                    // they belong to a class that implements a method known as "weight()" (it
                                    // returns a double value). The box class has such a method, and therefore, can
                                    // implement (and so it does) the ToBeStored interface. That implies that a Box
                                    // instance can contain another Box instance!
    }
}

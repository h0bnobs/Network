
/**
 * Write a description of class EventsPost here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EventsPost extends Post
{
    private String description;

    /**
     * Constructor for objects of class EventsPost
     */
    public EventsPost(String text, String author)
    {
        super(author);
        description = text;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getDescription()
    {
        return description;
    }
}

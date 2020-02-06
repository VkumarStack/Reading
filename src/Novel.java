//*****************************************************************************************
//  Novel.java
//
//  Represents a novel, which, in addition to variables from ReadingMaterial, includes
//  the number of chapters, the current chapters, an indicator of whether or not the
//  text has pictures, and an indicator of whether or not the text is fiction.
//*****************************************************************************************
public class Novel extends ReadingMaterial
{
    private int numChapters;
    private int currentChapter;
    private boolean picturesPresent;
    private boolean isFiction;

    //----------------------------------------------------------------------------------
    //  Constructor that instantiates all ReadingMaterial variables as well as
    //  the number of chapters, an indicator of whether or not there are pictures,
    //  and an indicator of whether or not the text is fiction.
    //----------------------------------------------------------------------------------
    public Novel(String name, String author, String publisher, String datePublished, int numPages, int numChapters, boolean picturesPresent, boolean isFiction)
    {
        super(name, author, publisher, datePublished, numPages);
        this.numChapters = numChapters;
        currentChapter = 1;
        this.picturesPresent = picturesPresent;
        this.isFiction = isFiction;
    } // end eight-argument constructor with call to super

    //----------------------------------------------------------------------------------
    //  Indicates how one feels from reading the novel, with different messages
    //  depending on whether or not the novel is fiction.
    //----------------------------------------------------------------------------------
    public String read()
    {
        if (isFiction)
        {
            return "You read the story tensely, wondering what will happen next to the main character.";
        } // end if
        else
        {
            return "You read the text, absorbing the knowledge from it.";
        } // end else
    } // end method read

    //----------------------------------------------------------------------------------
    //  Increments the chapter, with a check to ensure that the maximum number of
    //  chapters isn't exceeded.
    //----------------------------------------------------------------------------------
    public void nextChapter()
    {
        if (currentChapter < numChapters)
        {
            currentChapter++;
        } // end if
    } // end method nextChapter

    //----------------------------------------------------------------------------------
    //  Standard getters
    //----------------------------------------------------------------------------------
    public int getNumChapters()
    {
        return numChapters;
    } // end getNumChapters
    public int getCurrentChapter()
    {
        return currentChapter;
    } // end getCurrentChapter
    public boolean getPicturesPresent()
    {
        return picturesPresent;
    } // end getPicturesPresent
    public boolean getIsFiction()
    {
        return isFiction;
    } // end getIsFiction

    //----------------------------------------------------------------------------------
    //  toString method that displays all instance variables for Novel.
    //----------------------------------------------------------------------------------
    public String toString()
    {
        String output = super.toString();
        output += "Number of Chapters: " + numChapters + "\n";
        output += "Current Chapter: " + currentChapter + "\n";
        if (isFiction)
        {
            output += "Fiction\n";
        } // end if
        else
        {
            output += "Nonfiction\n";
        } // end else
        if (picturesPresent)
        {
            output += "Contains pictures\n";
        } // end if
        else
        {
            output += "Does not contain pictures\n";
        } // end else
        return output;
    } // end toString
} // end class Novel
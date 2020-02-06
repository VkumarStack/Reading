//*****************************************************************************************
//  ReadingMaterial.java
//
//  Represents an abstract reading material, containing the material's name, author,
//  publisher, date of publishing, pages, and current page.
//*****************************************************************************************
public abstract class ReadingMaterial
{
    protected String name;
    protected String author;
    protected String publisher;
    protected String datePublished;
    protected int numPages;
    protected int currentPage;

    //----------------------------------------------------------------------------------
    //  Constructor that instantiates name, author, publisher, date published, and
    //  number of pages. It also sets the current page to one.
    //----------------------------------------------------------------------------------
    public ReadingMaterial(String name, String author, String publisher, String datePublished, int numPages)
    {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.datePublished = datePublished;
        this.numPages = numPages;
        currentPage = 1;
    } // end five-argument constructor

    //----------------------------------------------------------------------------------
    //  Abstract method representing the feeling that one may have from reading the
    //  material.
    //----------------------------------------------------------------------------------
    public abstract String read();

    //----------------------------------------------------------------------------------
    //  Increments the current page of the text, with a check to ensure that the maximum
    //  number of pages isn't exceeded.
    //----------------------------------------------------------------------------------
    public void turnPage()
    {
        if (currentPage < numPages)
        {
            currentPage++;
        } // end if
    } // end method turnPage

    //----------------------------------------------------------------------------------
    //  Standard getters
    //----------------------------------------------------------------------------------
    public String getName()
    {
        return name;
    } // end getName
    public String getAuthor()
    {
        return author;
    } // end getAuthor
    public String getPublisher()
    {
        return publisher;
    } // end getPublisher
    public String getDatePublished()
    {
        return datePublished;
    } // end getDatePublished
    public int getNumPages()
    {
        return numPages;
    } // end getNumPages
    public int getCurrentPage()
    {
        return currentPage;
    } // end getCurrentPage

    //----------------------------------------------------------------------------------
    //  toString method that displays all of the instance variables.
    //----------------------------------------------------------------------------------
    public String toString()
    {
        String output = "";
        output += "Name: " + name + "\n";
        output += "Author: " + author + "\n";
        output += "Publisher: " + publisher + "\n";
        output += "Date Published: " + datePublished + "\n";
        output += "Pages: " + numPages + "\n";
        output += "Current Page: " + currentPage + "\n";
        return output;
    } // end toString
} // end class ReadingMaterial
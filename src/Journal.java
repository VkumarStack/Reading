//*****************************************************************************************
//  Journal.java
//
//  Represents a journal, which, in addition to variables from ReadingMaterial, includes
//  the journal title, the journal's version, the volume, the issue, and an indicator
//  of whether or not the journal is scientific.
//*****************************************************************************************
public class Journal extends ReadingMaterial
{
    private String journalTitle;
    private double version;
    private int volume;
    private int issue;
    private boolean isScientific;

    //----------------------------------------------------------------------------------
    //  Constructor that instantiates all ReadingMaterial variables as well as
    //  the journal title, version, volume, issue, and an indicator of whether or not
    //  it is scientific.
    //----------------------------------------------------------------------------------
    public Journal(String name, String author, String publisher, String datePublished, int numPages, String journalTitle, double version, int volume, int issue, boolean isScientific)
    {
        super(name, author, publisher, datePublished, numPages);
        this.journalTitle = journalTitle;
        this.version = version;
        this.volume = volume;
        this.issue = issue;
        this.isScientific = isScientific;
    } // end ten-argument constructor

    //----------------------------------------------------------------------------------
    //  Indicates how one feels from reading the novel, with different messages
    //  depending on whether or not the journal is scientific.
    //----------------------------------------------------------------------------------
    public String read()
    {
        if (isScientific)
        {
            return "You gaze at amazement at the wonders of science.";
        } // end if
        else
        {
            return "You game at amazement at the wonders of everything but science";
        } // end else
    } // end method read

    //----------------------------------------------------------------------------------
    //  Standard getters
    //----------------------------------------------------------------------------------
    public String getJournalTitle()
    {
        return journalTitle;
    } // end getJournalTitle
    public double getVersion()
    {
        return version;
    } // end getVersion
    public int getVolume()
    {
        return volume;
    } // end getVolume
    public int getIssue()
    {
        return issue;
    } // end getIssue
    public boolean getIsScientific()
    {
        return isScientific;
    } // end getIsScientific

    //----------------------------------------------------------------------------------
    //  toString method that displays all instance variables for Journal.
    //----------------------------------------------------------------------------------
    public String toString()
    {
        String output = super.toString();
        output += "Journal Title: " + journalTitle + "\n";
        output += "Version: " + version + "\n";
        output += "Volume #" + volume + ", Issue no. " + issue + "\n";
        if (isScientific)
        {
            output += "Scientific" + "\n";
        } // end if
        else
        {
            output += "Non-Scientific" + "\n";
        } // end else
        return output;
    } // end toString
} // end class Journal
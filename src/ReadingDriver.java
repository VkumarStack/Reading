//*****************************************************************************************
//  ReadingDriver.java
//
//  Demonstrates the Novel and Journal class.
//*****************************************************************************************
public class ReadingDriver
{
    public static void main(String[] args)
    {
        ReadingMaterial animalFarm = new Novel("Animal Farm", "George Orwell", "Penguin Books", "August 17, 1945", 105, 10, false, true);
        ReadingMaterial roomOfOnesOwn = new Novel("A Room of One's Own", "Virginia Woolf", "Penguin Books", "October 24, 1929", 137, 6, false, false);
        ReadingMaterial biodegrade = new Journal("Effects of Sterilizing Agents on the Biodegradation of a Bioplastic Material", "Maria E. Gonzalez", "Taylor & Francis", "2009", 13, "International Journal of Polymeric Materials", 1, 1, 58, true);

        ReadingMaterial[] library = new ReadingMaterial[3];
        library[0] = animalFarm;
        library[1] = roomOfOnesOwn;
        library[2] = biodegrade;

        for (ReadingMaterial text : library)
        {
            System.out.println(text.toString());
            System.out.println(text.read());
            System.out.println();
        } // end for
    } // end method main
} // end class ReadingDriver
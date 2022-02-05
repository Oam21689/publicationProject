//Student name: Olame Akim Muliri
//LSU ID: 898449565
//Lab Section:001

package publicationproject;


enum Genre{SCIENCE, ROMANCE, COMIC, CLASSIC, ATHLETIC, BEAUTY, FASHION, ENTERTAINMENT, THRILLER};

public class Publication implements Comparable<Publication>
{
    public String title;
    public Genre genre;
    public int edition;
    public int year;

    public Publication(String title, Genre genre, int edition, int year) 
    {
        
        this.title = title;
        this.genre = genre;
        this.edition = edition;
        this.year = year;
    }
    
    public String printInfo()
    {
        
        return title + " Edition (" + edition+ ") published in " + year;
    }
    
    public String printFooter()
    {
        
        return "All rightd reserved.\n--------------------";
        
    }
    
    

    @Override
    public int compareTo(Publication other) {
        
        if (genre.name().compareTo(other.genre.name()) != 0)
            return genre.name().compareTo(other.genre.name());
        else
            return title.compareToIgnoreCase(other.title);
    }
}

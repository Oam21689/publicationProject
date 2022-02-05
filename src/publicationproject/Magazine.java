//Author: Olame Akim Muliri


package publicationproject;

public class Magazine extends Publication
{
    private String publisher;

    public Magazine(String publisher, String title, Genre genre, int edition, int year)
    {
        super(title, genre, edition, year);
        this.publisher = publisher;
    }
    
    @Override
    public String printInfo()
    {
        return super.printInfo() +"\n"+ genre + " magazine by " + publisher +"\n"+ super.printFooter()+"\n";
    }
    
    
}

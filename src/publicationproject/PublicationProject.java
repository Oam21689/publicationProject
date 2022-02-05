//@author: Olame Akim Muliri

//Lab Section:001
package publicationproject;

import java.util.Collections;
import java.util.ArrayList;

public class PublicationProject {

    public static void main(String[] args) 
    {
        ArrayList<Publication> pubs = new ArrayList<>();
        
        pubs.add(new Book("John Carreyrou", "Bad Blood: Secrets and Lies in a Silicon Valley Startup", Genre.THRILLER, 1, 2018));
        
        pubs.add(new Book("Andriy Burkov", "The Hundred-Page Machine Learning Book", Genre.SCIENCE, 1,2019));
        
        pubs.add(new Magazine("Meredith Corporation", "Sports Illustrated", Genre.ATHLETIC, 633, 2020));
        
        pubs.add(new Magazine("Meredith Corporation", "People", Genre.ENTERTAINMENT, 466, 2020));
        
        Collections.sort(pubs);
        for(Publication p : pubs)
            System.out.print(p.printInfo());
        
    }
    
}

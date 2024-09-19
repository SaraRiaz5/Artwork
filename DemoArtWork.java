public class DemoArtWork{

public static void main(String args[]){

Artist artist = new Artist("Shahid Anwar");

Artwork artwork1 = new Artwork ("Life",2005,artist);

Artwork artwork2= new Artwork("Life",2005);

artwork2.setTitle("Life");
artwork2.setYear(2005);

artwork1.displayArtworkInfo();
artwork2.displayArtworkInfo();
}
}


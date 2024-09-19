public class Artist{

public String artistName;

Artist(String artistName1){
this.artistName=artistName;
}

public String getArtistName(){
return this.artistName;
}
public void displayArtistName(){
System.out.println("Artist Name:" +artistName);
}
}
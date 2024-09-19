public class Artwork{

private int year;
private Artist artist;
private String title;

public Artwork(String title1,int year1,Artist artist1){
this.title=title1;
this.year=year1;
this.artist=artist1;
}

public Artwork(String title1,int year1){
this.title=title1;
this.year=year1;
}

public String getTitle(){
return title;
}

public int getYear(){
return year;
}

public Artist getArtist(){
return artist;
}

public void displayArtworkInfo(){
System.out.println("Year:"+year);
System.out.println("Title:" +title);
artist.displayArtistName();
}

public void setTitle(String title1){
title=title1;
}

public void setYear(int year1){
year=year1;
}

}










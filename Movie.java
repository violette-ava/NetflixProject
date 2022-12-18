public class Movie extends Program {
    private String title;
    private String genre;
    private String Rating;
    private String availability;

    public Movie() {
        this.title = title;
        this.genre = genre;
        this.Rating = Rating; 
    } 

    public Movie(String title, String genre, String rating){
        this.title = title;
        this.genre = genre;
        this.Rating = rating; 
    }

    public String getGenre() {
        return genre;
    }
   
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRating() {
        return Rating;
    }
   
    public void setRating(String Rating) {
        this.Rating = Rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAvailability() {
        return availability;
    }

    public String checkAvailability(){
        return "Available";
    }

    public String toString(){
        super.toString();
        return "Title:"+title+" "+ "Genre:"+genre+" "+ "Rating:"+Rating;
    }



   




}

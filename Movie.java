public class Movie extends Netflix {
    private String title;
    private String genre;
    private String Rating;

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

    public void removeMovie(Movie c) {
    }



   




}

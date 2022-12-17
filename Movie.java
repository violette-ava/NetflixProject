public class Movie extends Program {
    private String title;
    private String genre;
    private String rating;

    public Movie() {
        this.title = title;
        this.genre = genre;
        this.rating = rating; 
    } 

    public Movie(String title, String genre, String rating){
        this.title = title;
        this.genre = genre;
        this.rating = rating; 
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        title = title;
    }




}

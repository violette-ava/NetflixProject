public class TVShow extends Program{
    private String Title;
    private int Seasons;
    private String Rating; 
    private int CurrentEpisode; 
    private String availability;

    public TVShow(){
        this.Title = Title;
        this.Seasons = Seasons;
        this.Rating = Rating;
        this.CurrentEpisode = 1;
    }

    public TVShow(String Title, int Seasons, String Rating){
        this.Title = Title;
        this.Seasons = Seasons;
        this.Rating = Rating;
        this.CurrentEpisode = CurrentEpisode; 
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getSeasons() {
        return Seasons;
    }

    public void setSeasons(int seasons) {
        Seasons = seasons;
    }

    public String getRating() {
       return Rating;
    }

    public void setRating(String Rating) {
        this.Rating = Rating;
    }

    public int CurrentEpisode() {
        return CurrentEpisode;
    }

    public void setCurrentEpisode(int currentEpisode) {
        CurrentEpisode = currentEpisode;
    }

    public String getAvailability() {
        return availability;
    }

    public String checkAvailability(){
        return "Available";
    }

    public String toString(){
        super.toString();
        return "Title:"+Title+" "+ "Seasons:"+ Seasons+" "+ "Rating:"+Rating;
     }



    






}

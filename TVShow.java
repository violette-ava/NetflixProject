public class TVShow extends Program{
    private String Title;
    private int Seasons;
    private String Rating; 
    private int CurrentEpisode; 

    public TVShow(){
        this.Title = Title;
        this.Seasons = Seasons;
        this.Rating = Rating;
        this.CurrentEpisode = 1;
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

    public void setRating(String rating) {
        Rating = rating;
    }

    public int CurrentEpisode() {
        return CurrentEpisode;
    }

    public void setCurrentEpisode(int currentEpisode) {
        CurrentEpisode = currentEpisode;
    }

    






}
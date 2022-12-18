import java.util.ArrayList;
import java.util.Scanner;



public class Netflix {
    private static ArrayList<Movie> movies = new ArrayList<>();
    private static ArrayList<TVShow> shows = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
  


    public static void main(String[] args){
        int choice = 1;
        while (choice > 0){
            System.out.println("Welcome to Netflix");
            System.out.println();
            System.out.println("What would you like to watch?");
            System.out.println();
            System.out.println("1) TV Show");
            System.out.println("2) Movie");
            System.out.println("3) List all TV Shows");
            System.out.println("4) List all Movies");
            System.out.println("5) Search for a Movie");
            System.out.println("6) Search for a TV Show");
            System.out.println("7) Exit Netflix");
            System.out.println("Choice: ");
            System.out.println();
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1: 
                System.out.println("TV Show Title?");
                String TVShowTitle = sc.nextLine();
                System.out.println("Number of seasons?");
                int numSeasons = sc.nextInt();
                sc.nextLine();
                System.out.println("Rating?\n Examples: PG, PG-13, R, M");
                String rating = sc.nextLine();
                System.out.println("What episode are you currently on?");
                int currentEpisode = sc.nextInt();
                sc.nextLine();
                TVShow tvs= new TVShow(TVShowTitle, numSeasons, rating, currentEpisode);
                shows.add(tvs);
                break;

                case 2:
                System.out.println("Movie Title?");
                String movieTitle = sc.nextLine();
                System.out.println("Movie Genre?");
                String genre = sc.nextLine();
                System.out.println("Movie Rating? \n Examples: PG, PG-13, R, M" );
                String r = sc.nextLine();
                Movie m = new Movie(movieTitle, genre, r);
                movies.add(m);
                break;

                case 3:
                System.out.println("Listing TV Shows...");
                for (int index = 0; index < shows.size(); index++) {
                    System.out.println(index + " " + shows.get(index)); 
                }
                break;

                case  4:
                System.out.println("Listing Movies...");
                for (int index = 0; index < movies.size(); index++) {
                    System.out.println(index + " " + movies.get(index)); 
                }
                break;

                case 5:
                boolean found = false;
                System.out.println("Enter Movie Name:");
                String name = sc.nextLine();
                for(int index = 0; index < movies.size(); index++){
                    Movie s = movies.get(index);
                    if(s.getTitle().equals(name)){
                    System.out.println(s);
                    found = true;
                }
                }
                break;

                case 6:
                boolean found2 = false;
                System.out.println("Enter TV Show Name:");
                String name1 = sc.nextLine();
                for(int i = 0; i < shows.size(); i++){
                    TVShow s = shows.get(i);
                    if(s.getTitle().equals(name1)){
                    System.out.println(s);
                    found = true;
                }
                }
                break;
                




            }//choices
        }//while loop
    }//main
}//class

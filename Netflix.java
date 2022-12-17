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
            System.out.println("5) Search for a Program");
            System.out.println("6) Add a Program");
            System.out.println("7) Delete a Program");
            System.out.println("8) Exit Netflix");
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
                System.out.println("Rating?");
                String rating = sc.nextLine();
                System.out.println("What episode are you currently on?");
                int currentEpisode = sc.nextInt();
                sc.nextLine();
                TVShow tvs= new TVShow(TVShowTitle, numSeasons, rating, currentEpisode);
                shows.add(tvs);
                break;

            }

        }
       
    
}
}
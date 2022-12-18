import java.util.ArrayList;
import java.util.Scanner;



public class Netflix {
    private static ArrayList<Movie> movies = new ArrayList<>();
    private static ArrayList<TVShow> shows = new ArrayList<>();
    private static ArrayList<Profile> profiles = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
  


    public static void main(String[] args){
        int choice = 1;
        while (choice > 0){
            System.out.println("Welcome to Netflix");
            System.out.println();
            System.out.println("1) Add a Profile");
            System.out.println("2) Add a TV Show");
            System.out.println("3) Add a Movie");
            System.out.println("4) List all TV Shows");
            System.out.println("5) List all Movies");
            System.out.println("6) Search for a Movie");
            System.out.println("7) Search for a TV Show");
            System.out.println("8) Check availability for a TV Show");
            System.out.println("9) Check availability for a Movie");
            System.out.println("10) Exit Netflix");
            System.out.println("Choice: ");
            System.out.println();
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){

                case 1: 
                System.out.println("Add a Profile");
                System.out.println("Enter Name: ");
                String name = sc.nextLine();
                System.out.println("Enter Age: ");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.println("Country?");
                String country = sc.nextLine();
                Profile s = new Profile(name, age, country);
                profiles.add(s);
                break;
                
                case 2: 
                System.out.println("TV Show Title?");
                String TVShowTitle = sc.nextLine();
                System.out.println("Number of seasons?");
                int numSeasons = sc.nextInt();
                sc.nextLine();
                System.out.println("Rating?\n Examples: PG, PG-13, R, M");
                String rating = sc.nextLine();
                TVShow tvs= new TVShow(TVShowTitle, numSeasons, rating);
                shows.add(tvs);
                System.out.println("Who's currently watching this?");
                for (int index = 0; index < profiles.size(); index++) {
                    System.out.println(index + " " + profiles.get(index)); 
                }
                System.out.println();
                System.out.println("Choice:");
                int ans = sc.nextInt();
                Profile p =profiles.get(ans);
                sc.nextLine();
                if(p.getAge() < 18 && tvs.getRating().equals("R")){
                    System.out.println("You may only view PG and PG-13 programs.");
                }
                else{
                    p.addProgram(tvs);
                }
                break;

                case 3:
                System.out.println("Movie Title?");
                String movieTitle = sc.nextLine();
                System.out.println("Movie Genre?");
                String genre = sc.nextLine();
                System.out.println("Movie Rating? \n Examples: PG, PG-13, R, M" );
                String r = sc.nextLine();
                Movie m = new Movie(movieTitle, genre, r);
                movies.add(m);
                System.out.println("Who's currently watching this?");
                for (int index = 0; index < profiles.size(); index++) {
                    System.out.println(index + " " + profiles.get(index)); 
                }
                System.out.println();
                System.out.println("Choice:");
                int input = sc.nextInt();
                Profile l =profiles.get(input);
                sc.nextLine();
                if(l.getAge() < 18 && m.getRating().equals("R")){
                    System.out.println("You may only view PG and PG-13 programs.");
                }
                else{
                    l.addProgram(m);
                }
                break;

                case 4:
                System.out.println("Listing TV Shows...");
                for (int index = 0; index < shows.size(); index++) {
                    System.out.println(index + " " + shows.get(index)); 
                }
                break;

                case 5:
                System.out.println("Listing Movies...");
                for (int index = 0; index < movies.size(); index++) {
                    System.out.println(index + " " + movies.get(index)); 
                }
                break;

                case 6:
                boolean found = false;
                System.out.println("Enter Movie Name:");
                String name1 = sc.nextLine();
                for(int index = 0; index < movies.size(); index++){
                    Movie n = movies.get(index);
                    if(n.getTitle().equals(name1)){
                    System.out.println(n);
                    found = true;
                }
                }
                break;

                case 7:
                boolean found2 = false;
                System.out.println("Enter TV Show Name:");
                String name2 = sc.nextLine();
                for(int i = 0; i < shows.size(); i++){
                    TVShow t = shows.get(i);
                    if(t.getTitle().equals(name2)){
                    System.out.println(t);
                    found = true;
                }
                }
                break;

                case 8:
               System.out.println("Which TV Show would you like to check?");
               for (int index = 0; index < shows.size(); index++) {
                System.out.println(index + " " + shows.get(index)); 
            }
            System.out.println();
            System.out.println("Choice:");
            int input1 = sc.nextInt();
            sc.nextLine();
            Program w = shows.get(input1);
            w.checkAvailability();
            System.out.println(w.checkAvailability());

            break;

            case 9:
            System.out.println("Which Movie would you like to check?");
               for (int index = 0; index < movies.size(); index++) {
                System.out.println(index + " " + movies.get(index)); 
            }
            System.out.println();
            System.out.println("Choice:");
            int input2 = sc.nextInt();
            sc.nextLine();
            Program h = shows.get(input2);
            h.checkAvailability();
            System.out.println(h.checkAvailability());
           break;






                


                




            }//choices

            
        }//while loop
    }//main
}//class

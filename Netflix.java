public class Netflix {

    import java.util.Scanner;
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
            choice = sc.nextInt();
            sc.nextLine; 
        }
       
    
}
}
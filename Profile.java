import java.util.ArrayList;
import java.util.Scanner;

public class Profile {
    private static ArrayList<Program> programs = new ArrayList<>();
    private String name;
    private int age;
    private String country;
   
    public Profile(){
        this.name = name;
        this.age = age;
        this.country = country; 
    }

    public Profile(String name, int age, String country){
        this.name = name;
        this.age = age;
        this.country = country; 

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void addProgram(Program p){
        programs.add(p);
    }

    

   

    

   


    
}

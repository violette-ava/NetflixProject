public class Program{
    private String availability;



    public Program(String availability) {
        this.availability = availability;
    }

    public Program(){
        this.availability = availability;
    }

    public void setAvailability(String a){
        availability = a;

    }

    public String getAvailability() {
        return availability;
    }

    public String checkAvailability(){
        return "Available";
    }

  

    public String toString(){
        return "Availability" +checkAvailability();
    }


    

}
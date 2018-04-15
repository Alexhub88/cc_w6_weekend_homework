package Guests;

public class Guest {

    private String name;
    private String stayStartDate;
    private String stayEndDate;

    public Guest(String name, String stayStartDate, String stayEndDate) {
        this.name = name;
        this.stayStartDate = stayStartDate;
        this.stayEndDate = stayEndDate;
    }

    public String getName(){
        return this.name;
    }

    public String getStartDate(){
        return this.stayStartDate;
    }

    public String getEndDate(){
        return this.stayEndDate;
    }

}

public class Person{
    
    String firstName;
    String lastName;
    
    public Person (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String toString(){
        return lastName + ", " + firstName;
    }
}

  public class UltimatePlayer extends Person {
  private int jerseyNumber;
  private static int num;
  private String position = "";
  
  public UltimatePlayer(String firstName, String lastName, String position) {
    super(firstName, lastName);
    if (position.equals("cutter")) {
      this.position = "cutter";
    }
    else 
      this.position = "handler";
    
    num++;
    jerseyNumber = num;

  }
  
  public String getPosition(){
    return position;
  }
  
  public String toString() {
    return super.toString() + "\n   Jersey #: " + jerseyNumber + "\n   Position: " + position;
  }
}
  
   public class Captain extends UltimatePlayer {
    
  boolean type;
  
  public Captain(String firstName, String lastName, String position, boolean type) {
      
    super(firstName, lastName, position);
    this.type = type;
  }
  public String toString() {
    String tactic;
    if (type) {
      tactic = "offense";
    }
    else {
      tactic = "defense";
    }
    return super.toString() + "\n   Captain: " + tactic;
  }
}
 
  public class Coach extends Person{
    
    String role;
    
    public Coach (String firstName, String lastName, String role){
        super(firstName,lastName);
        this.role = role;
    }
    
    public String toString(){
        return super.toString() + "\n   Role: " + role;
    }
}
      
import java.util.ArrayList;

public class UltimateTeam
{
  private ArrayList<UltimatePlayer> players;
  private ArrayList<Coach> coaches;
  
  public UltimateTeam(ArrayList<UltimatePlayer> players, ArrayList<Coach> coaches)
  {
    this.players = players;
    this.coaches = coaches;
  }
  
  public String getCutters()
  {
    String result = "";
    for(UltimatePlayer b: players)
    {
      if(b.getPosition() == "cutter")
      {
        result = result + b + "\n";
      }
    }
    return result;
  }
  
  public String getHandlers()
  {
    String end = "";
    for(UltimatePlayer j: players)
    {
      if(j.getPosition() == "handler")
      {
        end = end + j + "\n";
      }
    }
    return end;
  }
  
  public String toString()
  {
    String coachList = "";
    String playlist = "";
    for(Coach a: coaches)
    {
      coachList += a + "\n";
    }
    for(UltimatePlayer b: players)
    {
      playlist += b + "\n";
    }
    
    return "COACHES\n" + coachList + "\nPLAYERS\n" + playlist;
    
  }
}
    
  
  
public class MessageBoard_Software{
  public static void main (String [] args){
    
    MessageBoard a = new MessageBoard (10);
   //creating a message board of 10 messages
    
   
    addMessage("Hello");
    addMessage("How are you?");
    addmessage("I'm fine");
    addMessage("That's great!");
    
    displayOne(2);
    
    clear();
    
    displayAll();
    
    
  }
}
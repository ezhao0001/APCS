import java.io.*;
import java.util.ArrayList;

public class MessageBoard{
  
  private int max;
  private int total;
  ArrayList <String> messages; 
    
  public MessageBoard(int x)
    {
       messages = new ArrayList <String> (x);
       this.max = x;
    }
  
  public void changeMessage(int n, String m)
    {
      messages.set(n,m);
    }
  
  public void addMessage(String m){
    boolean space;  
    while (total < max){
        if (m.length() > 15 || m.length() < 100)
        {
            messages.add(m);
            total++;
            System.out.println("true");                   
        }
        else 
        {System.out.println("false");
        }
    }
  }
         
    public void clear(){
      for (String m: messages){  
      m = "";
      }
    }
    
    public void displayAll(){
      for (String m: messages){
      System.out.println(m);
    }
    }
    
    
    public void displayOne(int n){
      if (n < total){
        System.out.println(messages.get(n));
      }
    }
    
    public void getMessageLength(int n){
      int length = messages.get(n).length();
      System.out.println(length);
    }
    
    public int getCount(){
      return total;
    }
}
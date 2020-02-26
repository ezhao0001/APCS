public class Boxcarpt2{
  
    private String cargo = "";
    private int numUnits;
    private boolean repair;

    public Boxcar(){
        cargo="gizmos";
        numUnits=5;
        repair=false;
    }


    
    public Boxcar(String c, int u, boolean r){
      if(c.equals("gizmos")||c.equals("gadgets")||c.equals("widgets")||c.equals("wadgets")){
       cargo=c;
     }
      else{
      cargo="gizmos";
     }
      
     if( u > 10 ||  <0){
      numUnits=0;
     }
     else{
      numUnits=u;
     }
     
     repair=r;
     
     if(repair){
      numUnits=0;
     }
    }

    
    public String toString()
    {
     String service;
     if(repair)
     {
      service="in repair";
     }
     else{
      service="in service";
     }
        return numUnits + " "+cargo + " " + service;
    }

    
    public void loadCargo()
    {
     if(!repair&&numUnits<10)
     {
      numUnits++;
     }
    }

   
    public String getCargo()
    {
      return(cargo);
    }

    public void setCargo(String c)
    {
      if(c.equals("gizmos")||c.equals("gadgets")||c.equals("widgets")||c.equals("wadgets"))
      {
       cargo=c.toLowerCase();
     }
      else{
      cargo="gizmos";
     }
    }

   
    public boolean isFull()
    {
   if(numUnits==10){
    return true;
   }
      return false;
    }

   
    {
     repair=true;
     numUnits=0;
    }
}
  
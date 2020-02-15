    public class Fraction
{
  private int numerator;
  private int denominator;

  public Fraction()
  {
    numerator = 1;
    denominator = 1;
  }

  public Fraction(int n, int d)
  {
    if (n > 0){
      numerator = n;
    }

    else {
      numerator = 1;
    }

    if (d > 0) {
      denominator = d;
    }


    else {
      denominator = 1;    

    }


  }
  
  public String toString()
  {
    return numerator + "/" + denominator;
  }

  public String mixedNumber()
  {

    if (numerator >= denominator) {
    int frac = numerator / denominator;
    int mod = numerator % denominator;

    if (mod == 0) {
    return  Integer.toString(frac);
    }
    else {
    return frac + " " + mod + "/" + denominator;  
    }
    }
    else {
    return numerator + "/" + denominator;

    }
  }

 public void add(int n, int d)
  {

    if( n >0) {
    int a = numerator;
    if ( d > 0) {
    int b = denominator;
    if( n < 0)
         a = 1;
   if(d<0)
         b = 1;


    int c = n;


    if (n >= 0 && d >= 0) {
    numerator = (a*d + c*b);
    denominator=(b*d);
    }

   }
  }
 }
}
  
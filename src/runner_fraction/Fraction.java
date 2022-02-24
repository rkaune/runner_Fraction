/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runner_fraction;

/**
 *
 * @author rkaune
 */
public class Fraction
{
  //Variables
 
  private int numerator;
  private int denominator;
  private static int numfractions;
  private String fraction;
  private String fraction2;
 
  //Constructors
 
  public Fraction(){
    setNumerator(1);
    setDenominator(1);
    numfractions++;
  }
  public Fraction(int x, int y){
    if(x>0&&y>0){
    setNumerator(x);
    setDenominator(y);
    }
    if(x<=0){
      setNumerator(1);
    }else{
      setNumerator(x);
    }
    if(y<=0){
      setDenominator(1);
    }else{
      setDenominator(y);
    }
    numfractions++;
  }
 
  //Accessors
 
  public int getNumerator(){
    return numerator;
  }
  public int getDenominator(){
    return denominator;
  }
  static int getNumFractions(){
    return numfractions;
  }
  public String toString(){
    fraction = (getNumerator() + "/" + getDenominator());
    return fraction;
  }
  public String mixedNumber(){
    int count = 0;
    while(getNumerator()>=getDenominator()){
       int newnumerator = getNumerator()-getDenominator();
       setNumerator(newnumerator);
       newnumerator = 0;
       count++;
       if (getDenominator()==0)
        break;
    }
    System.out.println(getNumerator());
    if(getNumerator()==0){
      System.out.println("Single");
      String y = (count + "");
      return y;
    }
    if(count==0){
      fraction = (getNumerator() + "/" + getDenominator());
      return fraction;
    }else{
      fraction = (count + " " + getNumerator() + "/" + getDenominator());
      return fraction;
    }
  }
 
  //Mutators
 
  public void setNumerator(int n){
    if(n>0){
      numerator = n;
    }
  }
  public void setDenominator(int d){
    if(d>0){
      denominator = d;
    }
  }
  public void add(int n, int d){
    if(n>0&&d>0){
      int xy = getNumerator()*d;
      int yx = getDenominator()*n;
      int o = xy+yx;
      int q = getDenominator()*d;
      setNumerator(o);
      setDenominator(q);
    }
  }
  public void add(Fraction other){
    int newnumerator = getNumerator()*other.getDenominator();
    int newdenominator = getDenominator()*other.getNumerator();
    int b = newnumerator+newdenominator;
    int a = getDenominator()*other.getDenominator();
    setNumerator(b);
    setDenominator(a);
  }
  public void multiply(int n, int d){
    if(n>0&&d>0){
      int z = getNumerator()*n;
      int y = getDenominator()*d;
      setNumerator(z);
      setDenominator(y);
    }
  }
  public void multiply(Fraction other){
    int c = getNumerator()*other.getNumerator();
    int d = getDenominator()*other.getDenominator();
    setNumerator(c);
    setDenominator(d);
  }
}

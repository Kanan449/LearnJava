package day12_switch_ternary;
import java.util.*;

public class BurgerOrChicken {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    Float burchic= (float) 10.0;
    Float sda=(float)2.0;
    String in = s.next();
    
if (in.equals("burger")|| in.equals("chicken")) {
  System.out.println("output: "+burchic);
}
else if(in.equals("soda")) {
  System.out.println("output: "+sda);
}


  

    
  }
}
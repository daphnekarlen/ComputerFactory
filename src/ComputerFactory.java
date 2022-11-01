public class ComputerFactory {

    public char size;
    public int red;
    public int green;
    public int blue;
    public String shape;
    public String pattern;
    public boolean touchscreen;


    //constructor method!
  public ComputerFactory(char cfSize, int cfRed, int cfGreen, int cfBlue, String cfShape, String cfPattern, boolean cfTouchscreen){
      size=cfSize;
      red=cfRed;
      green=cfGreen;
      blue=cfBlue;
      shape=cfShape;
      pattern=cfPattern;
      touchscreen=cfTouchscreen;

  }

  public void printInfo(){
System.out.println("The computer is size"+size);
System.out.println("The computer is a " +shape);
System.out.println("The computer has design "+pattern);
if(touchscreen==true){
    System.out.println("The computer has touchscreen");
}
else{System.out.println("The computer does not have touchscreen");
}
System.out.println();

      }

  }


//public void printInfo(){
//System.out.println("The computer is size"+size);
//System.out.println("The computer is a " +shape);
//System.out.println("The computer has design "+pattern);
//System.out.println("The computer has touchscreen" + touchscreen);





package br.com.emichelsx.mavencheckstyleexample;

/**
 * class with explicit style code errors
 */
public class DemoCheckStyle {

  public static void main(String[] args){

    var test = 1;

    /*
    if(true)     {

    }

    try{
      var foo = "x";
    } catch (Exception e){

    }

    try{

    } catch (Exception e){
      System.err.println("one error");

    }
*/
    if (true)
      System.out.println();



  }
}

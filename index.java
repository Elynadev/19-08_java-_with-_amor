public class index {
    public static void main (String[]args){
        System.out.println("bon bon");


// EX02

  String str1 =" bon";
   String str2="jour";
  String str3 = str1 + str2;
  System.out.println(str3);
boolean diff =str1.equals(str2);
// String dif = str1.equals(str2);
System.out.println(diff);
// System.out.println(dif);
  int a= 5;
      int b=a +6;
      int c= b-3;
      System.out.println(a);
      System.out.println();
      boolean compa= (a>b) && (b<c);
       System.out.println(compa);
       if ( a >b &&  b < c){
        System.out.println(" la condition est vrai");
       }else{
        System.out.println(" la condition est fausse");
       };

       
     //exercice 4
     int intVar=2 ;
     double  var2 = intVar ;
     short shortvar = (short)var2;
     System.out.println(var2);
       System.out.println(shortvar);

      (intVar>3)?"valeur vrai":"valeurfaux";
      boolean 
    // int x= 1 ;
    // float y = 3;
    // int z = y ;
    // boolean comp =x ==z ;
    // System.out.println( x +z);
    //  if( comp == true){
    //     System.out.println( "x est supérieur à y ");
    //  } else{
    //    System.out.println( "x n'est supérieur à y ");
    //  }

  String langue  = "Fr";
      switch (langue) {
          case "Fr":
              System.out.println("France");
              break;//permet de sortir des que le cas est verifé
          case "US":
              System.out.println("USA");
              break;

          default:// quand aucun cas n'est verifier
              break;
      }

    }

    }
    
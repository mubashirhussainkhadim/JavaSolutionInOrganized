
public class StringMethodInJava {
   public static void main (String[] args) {
	   String name = "Mubashir";
	   String FullName = "   Mubashir Hussain   ";
//	   
	   int value = name.length();
	   String Lstring = name.toLowerCase();
	   String UString = name.toUpperCase();
	   String Tstrinf = FullName.trim();
//	   
//	   
	   System.out.println(Lstring);
	   System.out.println(UString);
	   System.out.println(value);
	   System.out.println(FullName);
	   System.out.println(Tstrinf);
     
	   
	   System.out.println(name.substring(1));
	   System.out.println(name.substring(1,4));
	   System.out.println(name.replace("i","e"));
	   System.out.println(name.replace("r", "rr"));
       if (name.startsWith("Ma")) {
    	   System.out.println("you are fool");
       } 
       if (name.endsWith("hir")) {
        System.out.println("Mubashir is A java Programmer");
   }
       
       System.out.println(name.charAt(0));
       System.out.println(name.charAt(1));
       System.out.println(name.charAt(2));
       System.out.println(name.charAt(3));
       System.out.println(name.charAt(4));
       System.out.println(name.charAt(5));
       System.out.println(name.charAt(6));
       System.out.println(name.charAt(7));

       for (int i = 0 ; i < name.length(); i++ ) {
    	   System.out.println(name.charAt(i));
       }
       System.out.println(name.indexOf("r"));
       System.out.println(name.lastIndexOf(""));

}
}
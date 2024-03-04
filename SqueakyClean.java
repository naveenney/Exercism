package exercism;

public class SqueakyClean {

 static String clean(String identifier) 
	 {
     StringBuilder res= new StringBuilder();
    for (int i=0;i<identifier.length();i++) {
     char ch=identifier.charAt(i);
     if (Character.isLetterOrDigit(ch)||ch==' ') {
     switch(ch){
         case ' ': 
        	 res.append('_');
             break;
         case '4': 
        	 res.append('a');
             break;
         case '3': 
        	 res.append('e');
             break;
         case '0': 
        	 res.append('o');
             break;
         case '1': 
        	 res.append('l');
             break;
         case '7': 
        	 res.append('t');
             break;
         default: 
        	 res.append(ch);
     }   
 }
     if(ch=='-'&&i<identifier.length() ){
         ch=identifier.charAt(i+1);
         res.append(Character.toUpperCase(ch));
         i++;
     } 
 }
 return res.toString();
  
        
  
}

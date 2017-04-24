/**
Reverse an array without affecting special characters
Given a string, that contains special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’),
reverse the string in a way that special characters are not affected.
**/
public class ReverseArray
{
  public static String reverse(String a){
    char[] c =a.toCharArray();
    int l = 0;
    int r = a.length()-1; 
    while(l != r){
      if(!String.valueOf(c[l]).matches("[^A-Za-z0-9]") && !String.valueOf(c[r]).matches("[^A-Za-z0-9]"))
         {
			char temp = c[r];
           	c[r] = c[l];
        	c[l] = temp;
        	l++;
        	r--;
         }
      else{
      	if(String.valueOf(c[l]).matches("[^A-Za-z0-9]"))
            l++;

      	if(String.valueOf(c[r]).matches("[^A-Za-z0-9]")) 
        	r--;
      }
    }
    return new String(c);
  }
  
  public static void main(String[] args)
  {
    String str = "a,b$c";
    System.out.println("Expected:  c,b$a");
    System.out.println("Actual:   "+ reverse(str));
    str = "Ab,c,de!$";
        System.out.println("Expected: ed,c,bA!$");
    System.out.println("Actual:   "+ reverse(str));
  }
}

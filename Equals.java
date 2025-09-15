package stringClass_MemoryModel;

//Use equals() to compare content, == only checks memory reference.
public class Equals {
	    public static void main(String[] args) {
	        String a = "Data";
	        String b = new String("Data");

	        System.out.println(a == b);        // false (different references)
	        System.out.println(a.equals(b));   // true  (compares content)
	    }
}
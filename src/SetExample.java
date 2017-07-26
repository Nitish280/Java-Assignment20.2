import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
/*
 * here we are creating program to to copy all the 
 * elements from set2 to set1 so that the set1 
 * becomes the union of set1 and set2
 */
public class SetExample {
	public static void main(String args[]) {
		
		  
        //here Set which stores some Name
        Set<String> set1 = new HashSet<String>();
        set1.add("Nitish");
        set1.add("Vishal");
        set1.add("Vikash");
        set1.add("Abhishek");
        //here set which stores some different name from set1
        Set<String> set2 = new HashSet<String>();
        set2.add("Nitish");
        set2.add("Vishwas");
        set2.add("bhawani");
        set2.add("Mithun");
        
       System.out.println("Set1:" + set1);//print statement
       System.out.println("Set2:" + set2);//print statement
       
       //here we are adding all the elements of
       //set2 to set1 by the addAll function
       set1.addAll(set2);
       
       System.out.println("set1:" + set1);//print statement
        
      


}
}

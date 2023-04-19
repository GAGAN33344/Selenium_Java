package JavaPrograms;

public class SplitString {

	public static void main(String[] args) {
          String s = "Gaganpreet S Mann";
        		  //desired output should be GSM
          String Splitted[]=s.split(" "); //now splitted string have Gaganpreet, S, Mann at 0,1,2 indexes
          for(int i=0; i<Splitted.length; i++)
          {
        	  System.out.print(Splitted[i].charAt(0));
          }
	}
}

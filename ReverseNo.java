import java.util.*;
class ReverseNo {
    public static void main(String[] args) {

	Scanner s=new Scanner(System.in);
	System.out.println("enter number");
        int no=s.nextInt();
	int rev=0;
    	int rem;
    
    while (no!=0)
    {
        rem=no%10;
        rev=rev*10+rem;
        no=no/10;
    }
        System.out.println(rev);
    }
}
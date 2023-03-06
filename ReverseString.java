
class ReverseString 
{
    public static void main(String[] args) 
    {
	String Name="avaJbuHtiG";
	int lang=Name.length();
        String rev="";
	for(int i=lang-1;i>=0;i--)
	{
        rev=rev+Name.charAt(i);
	}
    
        System.out.println(rev);    
    }
}
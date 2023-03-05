import java.util.*;
class MulTable{
    public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter Table");
   // int a=s.nextInt();
    int table=s.nextInt();
    for(int i=1;i<=10;i++){
    System.out.println(table+"*"+i+"="+i*table);
    } 
    }
}
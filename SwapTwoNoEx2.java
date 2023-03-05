class SwapTwoNoEx2 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
    
        a=a+b; //a=30
        b=a-b; //b=30-20
        a=a-b; //a=30-20
        
             int c=300;
             int d=600;
             c=c+d;
             d=c-d;
             c=c-d;
      
        
        System.out.println("a"+a);
        
        System.out.println("b"+b);
        
        
        System.out.println("c"+c);
        
        System.out.println("d"+d);
    }
}
package com.atyume.servlet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome" );
        App res=new App();
        System.out.println(res.GetStr());
    }
    public String GetStr(){
        String str = "Hello World";
        return str;
    }
}

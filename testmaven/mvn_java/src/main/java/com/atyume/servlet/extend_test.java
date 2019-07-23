package com.atyume.servlet;

public class extend_test {
    public static void main( String[] args )
    {
        System.out.println( "Welcome to UCAR" );
        extend_test res=new extend_test();
        System.out.println(res.GetStr());
        UCAR obj=new Zuche();
        obj.godo();
        show(new Soldcar());
    }
    public static void show(UCAR a)  {
        a.godo();
        // 类型判断
        if (a instanceof Zuche)  {
            Zuche c = (Zuche) a;
            c.work();
        } else if (a instanceof Soldcar) {
            Soldcar c = (Soldcar) a;
            c.work();
        }
    }
    public String GetStr(){

        String str = "Hello UCAR";
        return str;

    }
}

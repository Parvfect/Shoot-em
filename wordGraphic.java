import java.io.*;
class wordGraphic
{
    delay obj=new delay();
    void word(String a)throws IOException
    {
        char x;
        for(int i=0;i<a.length();i++)
        {
            x=a.charAt(i);
            System.out.print(x);
            obj.main();
        }
        System.out.println();
    }
}
        
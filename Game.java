import java.io.*;
class Game
{
    //0 space
    //1 Player one
    //2 Computer
    //3 Wall
    
    int pr=3,pc=0,cr=3,cc=5;

    void showBoard(int a[][])throws IOException
    {
        int i,j,flag;
        System.out.print("\f");
        System.out.println("               |-------|-------|-------|-------|-------|-------|");
        for(i=0;i<7;i++)
        {
            System.out.print("               ");
            for(j=0;j<6;j++)
            {
                flag=a[i][j];
                if(a[i][j]==0)
                {
                    System.out.print("        ");
                }
                else if(a[i][j]==1)
                {
                    System.out.print("   "+(char)0x022A+"    ");
                }
                else if(a[i][j]==2)
                {
                    System.out.print("   "+(char)0x0230+"    ");
                }
                else if(a[i][j]==3)
                {
                    System.out.print("--------");
                }
            }
            System.out.println("\n               |                                               |");
            //System.out.println();         
        }
        System.out.println("               |-------|-------|-------|-------|-------|-------|");
    }
}


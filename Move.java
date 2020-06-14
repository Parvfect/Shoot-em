import java.io.*;
class Move
{
    int php=100,chp=100,m=0;
    int pos=60,posc=6;
    int x=0,y=0,x1=posc/10,y1=posc%10;
    int b[][]={{0,0,0,0,0,2},{0,0,0,0,0,0},{3,3,0,0,3,3},{0,0,0,0,0,0},{3,3,0,0,3,3},{0,0,0,0,0,0},{1,0,0,0,0,0}};
    int s;
    void main(int a,int b,int c,int d, int e)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));                    
        Game ob=new Game();
        a=2;
        //ob.showBoard(b);          
        yup(a,b,c,d,e);
    }

    void yup(int a,int l,int c,int d,int e)throws IOException
    { 
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
        delay obk=new delay();
        while(php>0&&chp>0)
        {                      
            x=pos/10;
            y=pos%10;
            Game obj=new Game();     
            Move ob=new Move();
            System.out.println("SHOOT\nFLASH\n NADE\nSPECIAL ITEM\n      W \n    A    D\n      S");               
            String z=br.readLine();
            switch(z)
            {
                case "w":
                case "W":
                {
                    if(b[5][0]==1||b[5][1]==1||b[5][4]==1||b[5][5]==1||b[3][0]==1||b[3][1]==1||b[3][4]==1||b[3][5]==1||b[0][0]==1||b[0][1]==1||b[0][2]==1||b[0][3]==1||b[0][4]==1||b[0][5]==1)
                    {
                        System.out.println("You cannot move forward");
                        //yup();
                    }
                    else
                    {
                        b[x][y]=0;
                        x--;
                        b[x][y]=1;
                        pos=10*x+y;                       
                        obj.showBoard(b);
                    }
                }
                break;
                case "d":
                case "D":
                {
                    if(b[0][5]==1||b[6][5]==1||b[5][5]==1||b[4][5]==1||b[3][5]==1||b[2][5]==1||b[1][5]==1||b[2][3]==1||b[4][3]==1) 
                    {
                        System.out.println("You cannot move right");
                        //yup();
                    }
                    else
                    {
                        b[x][y]=0;
                        y++;
                        b[x][y]=1;
                        pos=10*x+y;
                        obj.showBoard(b);    
                    }
                }
                break;
                case "a":
                case "A":
                {
                    if(b[0][0]==1||b[1][0]==1||b[2][0]==1||b[3][0]==1||b[4][0]==1||b[5][0]==1||b[6][0]==1||b[2][2]==1||b[4][2]==1)
                    {
                        System.out.println("You cannot move left");
                    }
                    else
                    {

                        b[x][y]=0;
                        y--;
                        b[x][y]=1;
                        pos=10*x+y;
                        obj.showBoard(b);    
                    }
                }
                break;
                case "s":
                case "S":
                {
                    if(b[6][0]==1||b[6][1]==1||b[6][2]==1||b[6][3]==1||b[6][4]==1||b[6][5]==1||b[3][0]==1||b[3][1]==1||b[3][4]==1||b[3][5]==1||b[1][0]==1||b[1][1]==1||b[1][4]==1||b[1][5]==1)
                    {
                        System.out.println("You cannot move backwards");
                    }
                    else
                    {

                        b[x][y]=0;
                        x++;
                        b[x][y]=1;
                        pos=10*x+y;
                        obj.showBoard(b);    
                    }
                }
                break;
                case "SHOOT":
                case "Shoot":
                case "shoot":
                {
                    if(a==1&&(x==x1||y==y1))
                    {
                        chp-=20;
                        System.out.println("Bullet hit Computer health  "+chp+"\n User health  "+php);
                    }
                    else if(a==2&&(x==x1||y==y1))
                    {
                        chp-=40;
                        System.out.println("Bullet hit Computer health  "+chp+"\n User health  "+php);
                    }
                    else if(a==3&&(x==x1||y==y1))
                    {
                        chp-=80;
                        System.out.println("Nullet hit Computer health  "+chp+"\n User health  "+php);
                    }
                    else
                    System.out.println("Bullet missed!");
                } 
                break;
                case "Flash":
                case "FLASH":
                case "flash":
                {
                    if(l==1)
                    {
                        System.out.println("You have used flashbang, the computer is blinded and cannot shoot");
                        l++;
                    }
                }
                break;
                case "nade":
                case "NADE":
                case "Nade":
                {
                    if(c==1)
                    {
                        if(b[x+1][y+1]==2||b[x][y+1]==2||b[x+1][y]==2||b[x-1][y-1]==2||b[x][y-1]==2||b[x-1][y]==2||b[x+2][y+2]==2||b[x][y+2]==2||b[x+2][y]==2||b[x-2][y-2]==2||b[x][y-2]==2||b[x-2][y]==2||b[x+3][y+3]==2||b[x][y+3]==2||b[x+3][y]==2||b[x-3][y-3]==2||b[x][y-3]==2||b[x-3][y]==2)
                        chp-=40;
                    }
                }
                break;
                case "Special item":
                case "Spc item":
                {
                    if(e==1)
                    {
                        chp-=chp/2;
                    }
                    else if(e==2)
                    {
                        php+=php/2;
                    }
                    else
                    System.out.println("You dont have");
                }
                default:
                {
                    System.out.println("Wow you are stupid");
                }
            }
            s=(int)Math.random()*100;
            if(x==x1||y==y1)
            {
                if(l==2)
                {
                    l++;
                }
                else
                {
                    php-=20;
                    System.out.println("The computer shot and it hit,\n  your health now is  \n "+php); 
                    obk.main();                obk.main();                obk.main();                obk.main();                obk.main();                obk.main();
                }
            }
            else
            {
                if(s<=25)
                {
                    if(b[5][0]==1||b[5][1]==1||b[5][4]==1||b[5][5]==1||b[3][0]==1||b[3][1]==1||b[3][4]==1||b[3][5]==1||b[0][0]==1||b[0][1]==1||b[0][2]==1||b[0][3]==1||b[0][4]==1||b[0][5]==1)
                    continue;
                    else
                    {
                        b[x1][y1]=0;
                        x--;
                        b[x1][y1]=2;
                        posc=10*x+y;
                    }
                }
                else if(s>25&&s<=50)
                {   
                    if(b[6][0]==1||b[6][1]==1||b[6][2]==1||b[6][3]==1||b[6][4]==1||b[6][5]==1||b[3][0]==1||b[3][1]==1||b[3][4]==1||b[3][5]==1||b[1][0]==1||b[1][1]==1||b[1][4]==1||b[1][5]==1)
                    continue;
                    else 
                    {                           
                        b[x1][y1]=0;
                        x++;
                        b[x1][y1]=2;
                        posc=10*x+y;
                    }
                }
                else if(s>50&&s<=75)
                {
                    if(b[0][0]==1||b[1][0]==1||b[2][0]==1||b[3][0]==1||b[4][0]==1||b[5][0]==1||b[6][0]==1||b[2][2]==1||b[4][2]==1)
                    continue;
                    else
                    {
                        b[x1][y1]=0;
                        y--;
                        b[x1][y1]=2;
                        posc=10*x+y;
                    }
                }
                else
                {
                    if(b[0][5]==1||b[6][5]==1||b[5][5]==1||b[4][5]==1||b[3][5]==1||b[2][5]==1||b[1][5]==1||b[2][3]==1||b[4][3]==1) 
                    continue;
                    else
                    {
                        b[x1][y1]=0;
                        y++;
                        b[x1][y1]=2;
                        posc=10*x+y;
                    }
                }
            }                                                                        
        }
    }
}

/*break;
case shoot:
{

default:
yup();
v
}
}
void shoot(int a,i
}
}
 */

        

import java.io.*;
class Menu
{
    delay s=new delay();
    wordGraphic obj=new wordGraphic();
    S ob=new S();
    StartUp osum=new StartUp();    
    Move ooo=new Move();

    public static void main()throws IOException    
    {
        Menu obj=new Menu();
        obj.MainMenu();
    }

    void MainMenu()throws IOException    
    {
        int gun=0,flash=0,nade=0,spcc=0,armour=0;
        int c;
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        osum.main();
        do
        {
            obj.word("Welcome to the main menu.\nTo jump into a game press 1.\nTo see high scores enter 2.\nTo exit press 3.");
            try
            {
                c=Integer.parseInt(br.readLine());
            }catch(NumberFormatException nfe)
            {
                c=0;
            }
            System.out.println("\f");
            switch(c)
            {
                case 1:
                {   obj.word("To see the rules enter 1 \n To skip enter 2");
                    int z=Integer.parseInt(br.readLine());
                    System.out.print("\f");
                    if(z==1)
                    {

                        obj.word("Before you start a game, here are the rules.\nYou will be first given 150 pellets which is the in game currency.\nUsing those you can buy a gun,armour and special items.\nAFter that, you will be asked to choose a level.\nThere are three levels, that is, easy intermidiate and rajnikant.\nYou will start in the game with your gun of choice.\nYou can either move,shoot in which bullets go straight and an enemy is hit,\nYou can throw a grenade or you can use a special item.\nThe game goes on until either you or the computer dies.\n The number of rounds can be decided by the user.\n We encourage you to try our hardest level.\nThat is all now hwave fun!");
                    }                               
                    int pellet=150;
                    obj.word("\fTo enter shop press 1\nTo start game enter 2");
                    z=Integer.parseInt(br.readLine());
                    System.out.print("\f");
                    if(z==1)
                    {
                        obj.word("\f");                               
                        ob.shop(pellet,gun,flash,nade,spcc,armour);
                        ooo.main(gun,flash,nade,spcc,armour);
                    }
                    else 
                        ooo.main(gun,flash,nade,spcc,armour);
                    }
                break;
                case 2:
                {
                    obj.word("\f Here are the high scores");
                }
                break;
                case 3:
                break;
                default:
                obj.word("Wrong choiceee");
            }

        }while(c!=3);
    }
}
        
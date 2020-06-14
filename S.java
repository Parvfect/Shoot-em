import java.io.*; 
class S
{
    void shop(int a,int b,int c,int d,int e,int f)throws IOException    
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        wordGraphic obj=new wordGraphic();
        delay ob=new delay();
        String x;
        do
        {   
            obj.word("Here you can choose either to buy a gun(gu),armour(ar),grenades(gr) or special items(spc), or you can go back to the main menu(mm)");
            x=br.readLine();
            obj.word("\f");                
            switch(x)
            {
                case "gu":
                case "GU":
                {
                    obj.word("Welcome to the gun menu!\nYou have an option to choose either\n (1)A pistol - price 50p, damage 20\n(2)A rifle price 100p, damage 40\n(3)A sniper price 200p,damage 80");
                    c=Integer.parseInt(br.readLine());
                    System.out.println("\f");                    
                        switch(c)
                        {
                            case 1:
                            {
                                if(b==1)
                                {
                                    obj.word("You already have a pistol");                                    
                                }
                                else
                                {
                                    if(a>50)
                                    {
                                        a-=50;
                                        obj.word("You have bought a pistol, 50 pellets have been deducted from your balance,your new balance is  "+a);
                                        System.out.println("\f");                                        
                                    }
                                    else 
                                    {
                                        obj.word("You do not have enough money for this ");                                        
                                    }
                                }
                                        
                                
                            }
                            break;
                            case 2:
                            {
                                if(b==2)
                                {
                                    obj.word("You already have a rifle");                                    
                                }
                                else
                                {
                                        if(a>100)
                                    {
                                        a-=100;
                                        obj.word("You have bought a rifle, 100 pellets have been deducted from your balance, your new balance is "+a);
                                        System.out.println("\f");                                        
                                    }
                                    else 
                                    {
                                        obj.word("You do not have enough money for this ");                                        
                                    }
                                }   
                            }
                            break;
                            case 3:
                            {
                                if(b==3)
                                {
                                    obj.word("You already have a sniper");                                    
                                }
                                else
                                {
                                    if(a>200)
                                    {
                                        a-=200;
                                        obj.word("You have bought a sniper, 200 pellets have been deducted from your balance");
                                        System.out.println("\f");                                        
                                    }
                                    else 
                                    {
                                        obj.word("You do not have enough money for this ");                                        
                                    }
                                }
                            }
                            break;
                            default:
                            obj.word("Wrong choice sorrry");                            
                        }
                        break;
                }
                case "ar":
                case "AR":
                {
                    obj.word("Armour protects you in situations. It reduces the damage by 25%. It costs 100 pellets. To buy enter 1.");
                    int l=Integer.parseInt(br.readLine());
                    if(l==1)
                    {   if(f>0)
                        {
                            obj.word("You already have armour");
                            
                        }
                        else 
                        {
                                if(a>100)
                            {
                                a-=100;                        
                                obj.word("You have bought armour, 100 pellets have been removed form your balance, your new balance is "+a);
                                System.out.println("\f");
                                
                            }
                            else 
                                {
                                    obj.word("You do not have enough money for this ");
                                    
                                }
                        }
                    }
                }
                break;
                case "gr":
                case "GR":
                {
                    obj.word("You can either buy a flashbang(30p) or a grenade(50p).\nA flashbang removes the abilty of the opponent to shoot for 1 round.\nA grenade is applicable within three block range and does 60 damage.");
                    obj.word("To buy Flashbang enter 1 or to buy Grenade enter 2");
                    int sade=Integer.parseInt(br.readLine());
                    d=0;e=0;
                    if(sade==1)
                    {
                        if(a>30)
                        {
                            if(c>0)
                            {
                                obj.word("You already have one");
                                
                            }
                            a-=30;
                            obj.word("You have succesfully bought a flashbang.\n30 pellets have been deducted from your balance.Your new balance is "+a);
                            System.out.println("\f");
                            c=1;
                            
                        }
                        else 
                            {
                                obj.word("You do not have enough money for this ");
                                
                            }
                        
                    }
                    else if(sade==2)
                    {
                        if(a>50)
                        {
                            if(d>0)
                            {
                                obj.word("You already have one");
                                
                            }
                            a-=50;
                            obj.word("You have succesfully bought a grenade.\n50 pellets have been deducted from your balance,your new balance is "+a);                        
                            System.out.println("\f");
                            
                        }
                        else 
                            {
                                obj.word("You do not have enough money for this ");
                                
                            }
                    }
                    else 
                    {
                        obj.word("Wrong choice");
                        
                    }
                    System.out.println("\f");
                }
                break;
                case "spc":
                case "SPC":
                {
                    obj.word("here you can but a health potion or a poison.\nA health potion gives you half your health back and poison removes half the opponent's health.\nHealth 1 150p\nPoison 2 200p");                
                    int z=Integer.parseInt(br.readLine());
                    System.out.println("\f");
                    if(z==1)
                    {
                        if(e==1)
                        {
                            obj.word("You already have one");
                            
                        }
                        else
                        {
                            if(a>150)
                            {
                                a-=150;
                                obj.word("You have bought potion.\n150 pellets have been deducted from your balance");
                                System.out.println("\f");
                                e=1;
                                
                            }
                            else 
                            {
                                obj.word("You do not have enough money for this ");
                                
                            }
                        }
                    }
                    else if(z==2)
                    {
                        if(e==2)
                        {
                            obj.word("You already have one");
                            
                        }
                        else
                        {    
                            if(a>200)
                            {
                                a-=200;
                                obj.word("You have bought poison.\n200 pellets have been deducted from your balance");
                                System.out.println("\f");
                                e=2;
                                
                            }
                            else 
                                {
                                    obj.word("You do not have enough money for this ");
                                    
                                }
                        }
                    }
                    else
                    {
                        obj.word("Wrong choice");
                        System.out.println("\f");
                        
                    }
                }
                break;
                case "mm":
                case "MM":
                
                break;
                default:
                {
                    obj.word("Wrong choice");
                    System.out.println("\f");
                    
                }
            }
         }while(x=="gu"||x=="GU"||x=="ar"||x=="AR"||x=="spc"||x=="SPC"||x=="gr"||x=="GR");         
    }
}
        
        
    

    

               
           
                  
               
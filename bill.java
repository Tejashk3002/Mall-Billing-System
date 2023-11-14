 import java.io.*;
import java.util.Date;
class bill
{public static void main(String args[])throws IOException
    {int x,i,s,n,k,f,w,p;long j,p1;double fiv1=0.0,fiv2=0.0,g,fiv3=0.0,fiv4=0.0,dis=0.0,tamt=0.0 ,cm=0.0,f1=0.0,h=0.0,kg=0.0,f2=0.0,f3=0.0,f4=0.0,f5=0.0,f6=0.0,f8=0.0,s8=0.0,t1=0.0,t2=0.0,t3=0.0,i8=0.0;String ld,s0,y,name;String d;
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        Date date=new Date();
        System.out.println("*********************************************************************************************************************************************************************************");
        System.out.println("\t\t\t\t\t******************************");
        System.out.println("\t\t\t\t\t WELCOME TO THE CENTRAL MALL");
        System.out.println("\t\t\t\t\t ---------------------------");
        System.out.println("\t\t\t\t\t******************************");
        System.out.println("*********************************************************************************************************************************************************************************");
        System.out.println("\nEnter your name");
        name=in.readLine();
        name=name.toUpperCase();
        System.out.println("\nEnter your contact number");
        p1=Long.parseLong(in.readLine());
        do
        { System.out.println("Enter the floor in which you have purchased\n For purchasing Groceries in the first floor press 1 \n For purchasing Digital Products in the second floor press 2 \n For Purchasing Clothes the third floor press 3 \n For Playing Games in the fourth floor press 4\n For Food Court in the fifth floor press 5");
            k=Integer.parseInt(in.readLine());
            switch(k)
            {
                case 1:
                do
                {System.out.println("Welcome to Grocery Shop");
                    System.out.println("Sl no. \tName of the Product \tCost per kg \n 1.\t Carrot \t\t Rs 15.0 \n 2.\t Tomato \t\t Rs 20.0 \n 3.\t Onion \t\t\t Rs 30.0\n 4.\t Mango\t\t\t Rs 80.0\n 5.\t Apple\t\t\t Rs 120.0\n 6.\t Grapes\t\t\t Rs 60.0");
                    System.out.println("Enter the serial number of the product to be purchased with the number of kgs");
                    f=Integer.parseInt(in.readLine());
                    kg=Double.parseDouble(in.readLine());
                    if(f==1)
                        f1=15.0*kg;
                    else if(f==2)
                        f2=20.0*kg;
                    else if(f==3)
                        f3=30.0*kg;
                    else if(f==4)
                        f4=80.0*kg;
                    else if(f==5)
                        f5=120.0*kg;
                    else if(f==6)
                        f6=60.0*kg;
                    else
                        System.out.println("Invalid choice");
                    f8=f1+f2+f3+f4+f5+f6;
                    System.out.println("Enter 1 to continue to shop in first floor else press any other number to exit this floor");
                    w=Integer.parseInt(in.readLine());
                } while(w==1);
                break;
                case 2:   do
                {System.out.println("Welcome to the Digital Store");
                    System.out.println("Sl no. \t Name of the product \tCost per piece \n 1.\t Mobile \t\t Rs 15000.0 \n 2.\t Washing machine \t Rs 40000.0 \n 3.\t Television \t\t Rs 65000.0\n 4.\t Refrigarator\t\t Rs 80000.0\n 5.\t Laptop\t\t\t Rs 30000.0\n 6.\t speakers\t\t Rs 50000.0");
                    System.out.println("Enter the serial number of the product to be purchased with the number of pieces");
                    f=Integer.parseInt(in.readLine());
                    p=Integer.parseInt(in.readLine());
                    if(f==1)
                        f1=15000.0*p;
                    else if(f==2)
                        f2=40000.0*p;
                    else if(f==3)
                        f3=65000.0*p;
                    else if(f==4)
                        f4=80000.0*p;
                    else if(f==5)
                        f5=30000.0*p;
                    else if(f==6)
                        f6=50000.0*p;
                    else
                        System.out.println("Invalid choice");
                    s8=f1+f2+f3+f4+f5+f6;
                    System.out.println("Enter 2 to continue to shop in second floor else press any other number to exit this floor");
                    w=Integer.parseInt(in.readLine());
                }while(w==2);
                break;
                case 3:   do
                {System.out.println("Welcome to Show Off ");
                    System.out.println("Press \n 1.for Men's section \n 2.for Women's section ");
                    s=Integer.parseInt(in.readLine());
                    if(s==1)
                    {
                        System.out.println("Sl no. \t Name of the product \tCost per piece \n 1.\t Formal Shirt \t\t Rs 750.0 \n 2.\t Jeans pant \t\t Rs 1500.0 \n 3.\t T-Shirt \t\t Rs 650.0\n 4.\t Blazer \t\t Rs 3000.0\n 5.\t Shorts\t\t\t Rs 450.0\n 6.\t Waist Coat\t\t Rs 1500.0");
                        System.out.println("Enter the serial number of the product to be purchased with the number of pieces");
                        f=Integer.parseInt(in.readLine());
                        p=Integer.parseInt(in.readLine());
                        if(f==1)
                            f1=750.0*p;
                        else if(f==2)
                            f2=1500.0*p;
                        else if(f==3)
                            f3=650.0*p;
                        else if(f==4)
                            f4=3000.0*p;
                        else if(f==5)
                            f5=450.0*p;
                        else if(f==6)
                            f6=1500.0*p;
                        else
                            System.out.println("Invalid choice");
                        t1=f1+f2+f3+f4+f5+f6;
                    }

                    else if(s==2)
                    {
                        System.out.println("Sl no. \t Name of the product \tCost per piece \n 1.\t Saree  \t\t Rs 3500.0 \n 2.\t Chudidar \t\t Rs 1500.0 \n 3.\t Jeans Pant \t\t Rs 1250.0\n 4.\t Skirt \t\t\t Rs 600.0");
                        System.out.println("Enter the serial number of the product to be purchased with the number of pieces");
                        f=Integer.parseInt(in.readLine());
                        p=Integer.parseInt(in.readLine());
                        if(f==1)
                            f1=3500.0*p;
                        else if(f==2)
                            f2=1500.0*p;
                        else if(f==3)
                            f3=1250.0*p;
                        else if(f==4)
                            f4=600.0*p;

                        else
                            System.out.println("Invalid choice");
                        t2=f1+f2+f3+f4;
                    }
                    else
                        System.out.println("Invalid choice");
                    t3=t1+t2;

                    System.out.println("Enter 3 to continue to shop in the third floor else press any other number to exit this floor");
                    w=Integer.parseInt(in.readLine());
                }while(w==3);
                break;
                case 4:
                do
                {System.out.println("Welcome to Games Arcade");
                    System.out.println("Sl no. \t Name of the game \tCost per hour \n 1.\t Air Hockey \t\t Rs 150.0 \n 2.\t Bowling \t\t Rs 350.0 \n 3.\t Laser Tag\t\t Rs 500.0\n 4.\t Car racing\t\t Rs 400.0\n 5.\t Zombie shooter\t\t Rs 300.0\n 6.\t Play Station \t\t Rs 200.0");
                    System.out.println("Enter the serial number of the game to be played,number of people playing and the the duration in hours ");
                    f=Integer.parseInt(in.readLine());
                    p=Integer.parseInt(in.readLine());
                    h=Double.parseDouble(in.readLine());
                    if(f==1)
                        f1=150.0*p*h;
                    else if(f==2)
                        f2=350.0*p*h;
                    else if(f==3)
                        f3=500.0*p*h;
                    else if(f==4)
                        f4=400.0*p*h;
                    else if(f==5)
                        f5=300.0*p*h;
                    else if(f==6)
                        f6=200.0*p*h;
                    else
                        System.out.println("Invalid choice");
                    i8=f1+f2+f3+f4+f5+f6;
                    System.out.println("Enter 4 to continue to shop in fourth floor else press any other number to exit this floor");
                    w=Integer.parseInt(in.readLine());
                }while(w==4);
                break;
                case 5:  
                do
                {System.out.println("Welcome to Food Court ");
                    System.out.println("Press \n 1.for McDonald's \n 2.for Dominos \n 3.for Rajadhani");
                    s=Integer.parseInt(in.readLine());
                    if(s==1)
                    {
                        System.out.println(" Welcome to McDonald's");
                        System.out.println("Menu :");
                        System.out.println("Sl no. \t Name of the product \t\tCost per each \n 1.\t Maharaja Mc Burger \t\t Rs 350.0 \n 2.\t Mc Aloo Tikki \t\t\t Rs 60.0 \n 3.\t Mexican Cheezy Fries \t\t Rs 129.0\n 4.\t Veg.Meal(Burger,Fries and Coke) Rs 250.0\n 5.\t Coke\t\t\t\t Rs 90.0");
                        System.out.println("Enter the serial number of the product to be purchased with the number of pieces");
                        f=Integer.parseInt(in.readLine());
                        p=Integer.parseInt(in.readLine());
                        if(f==1)
                            f1=350.0*p;
                        else if(f==2)
                            f2=60.0*p;
                        else if(f==3)
                            f3=129.0*p;
                        else if(f==4)
                            f4=250.0*p;
                        else if(f==5)
                            f5=90.0*p;
                        else if(f==6)
                            f6=1500.0*p;
                        else
                            System.out.println("Invalid choice");
                        fiv1=f1+f2+f3+f4+f5;
                    }

                    else if(s==2)
                    {
                        System.out.println(" Welcome to Dominos");
                        System.out.println("Menu :");
                        System.out.println("Sl no. \tName of the product \t\tCost per each \n 1.\tPepper Paneer Pizza \t\t Rs 350.0 \n 2.\tVeg Extravaganza Pizza \t\t Rs 450.0 \n 3.\tMexican Green Wave Pizza \t Rs 385.0\n 4.\tCheezy garlic Breadsticks \t Rs 139.0\n 5.\tPepsi\t\t\t\t Rs 60.0");
                        System.out.println("Enter the serial number of the product to be purchased with the number of pieces");
                        f=Integer.parseInt(in.readLine());
                        p=Integer.parseInt(in.readLine());
                        if(f==1)
                            f1=350.0*p;
                        else if(f==2)
                            f2=450.0*p;
                        else if(f==3)
                            f3=385.0*p;
                        else if(f==4)
                            f4=139.0*p;
                        else if(f==5)
                            f5=60.0*p;
                        else
                        {System.out.println("Invalid choice");}
                        fiv2=f1+f2+f3+f4+f5;
                    }
                    else if(s==3)
                    {System.out.println(" Welcome to Rajadhani");
                        System.out.println("Menu :");
                        System.out.println("Sl no. \tName of the product \t\tCost per each \n 1.\tGujarati Thali \t\t\t Rs 550.0 \n 2.\tNorth Indian meal \t\t Rs 450.0 \n 3.\tSouth Indian meal \t\t Rs 300.0\n 4.\tHot n Sour Soup \t\t Rs 150.0\n 5.\tMushroom manchuri \t\t Rs 260.0");
                        System.out.println("Enter the serial number of the product to be purchased with the number of pieces");
                        f=Integer.parseInt(in.readLine());
                        p=Integer.parseInt(in.readLine());
                        if(f==1)
                            f1=550.0*p;
                        else if(f==2)
                            f2=450.0*p;
                        else if(f==3)
                            f3=300.0*p;
                        else if(f==4)
                            f4=150.0*p;
                        else if(f==5)
                            f5=260.0*p;

                        else
                            System.out.println("Invalid choice");
                        fiv3=f1+f2+f3+f4+f5;
                    }
                    else
                        System.out.println("Invalid choice");
                    fiv4=fiv1+fiv2+fiv3;

                    System.out.println("Enter 5 to continue to buy in the fifth floor else press any other number to exit this floor");
                    w=Integer.parseInt(in.readLine());
                }while(w==5);
                break;

                default:System.out.println("Inappropriate choice");
            }
            System.out.println("Enter 0 to shop again or any other number to display the final bill");
            n=Integer.parseInt(in.readLine());
        } while(n==0);

        cm=f8+s8+t3+i8+fiv4;
        g=(15/100.0)*cm;
        g=Math.round(g);

        System.out.println("Please participate in the lucky draw to get exciting discounts or gifts on your purchase");
        System.out.println("If you want to participate then press Yes otherwise press No");
        ld=in.readLine();
        y="Yes";
        s0="No";
        if(ld.equalsIgnoreCase(y))
        {System.out.println("If you win the lucky draw you win 10% discount ");
            x=(int)(Math.random());
            for(j=1;j<=1000000;j++)
            {for(i=1;i<=5000;i++)
                {
                }
            }

            if(x==0)
            {System.out.println("Congratulations!!!! you have won the lucky draw");
                dis=(10/100.0)*cm;
                dis=Math.round(dis);
            }
            else
            {System.out.println("Thank you for participating,unfortunately you have lost the lucky draw ");
                System.out.println("Dont feel bad because you have won a gift and that gift is a surprise as you have to enter a number between 0 and 9");
                int z=Integer.parseInt(in.readLine());

                if (z==0)
                    System.out.println("Yay !!!!! You have won  a bag");
                else if (z==1)
                    System.out.println("Yay !!!!! You have won  a watch");
                else if (z==2)
                    System.out.println("Yay !!!!! You have won  a basket");
                else if (z==3)
                    System.out.println("Yay !!!!! You have won  a glasses");
                else if (z==4)
                    System.out.println("Yay !!!!! You have won  a pair of shoes");
                else if (z==5)
                    System.out.println("Yay !!!!! You have won  a earphone");
                else if (z==6)
                    System.out.println("Yay !!!!! You have won  a speaker");
                else if (z==7)
                    System.out.println("Yay !!!!! You have won  a headphone");
                else if (z==8)
                    System.out.println("Yay !!!!! You have won  a bottle");
                else if (z==9)
                    System.out.println("Yay !!!!! You have won  a chocolates");
            }
        }

        else if(ld.equalsIgnoreCase(s0));
        {System.out.println();}

        tamt=(cm+g)-dis;
        for(j=1;j<=1000000;j++)
        {for(i=1;i<=5000;i++)
            {
            }
        }

        System.out.print("Please wait for some time till the bill is getting generated.............\t");

        for(j=1;j<=10000000;j++)
        {for(i=1;i<=500;i++)
            {
            }
        }
        System.out.println("\n\n\n\n\n");
        System.out.println("____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
        System.out.println("*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*");
        System.out.println("\t\t\t\t\t\t\t   CENTRAL MALL");

        System.out.println("\t\t\t\t\t\t\tGSTIN:27A9T98J98841Z5");
        System.out.println("\t\t\t\t\t _________________________________________________");
        System.out.println("\t\t\t\t\t\tDate:"+date.toString());
        System.out.println("\t\t\t\t\t\tCUSTOMER NAME:"+name);
        System.out.println("\t\t\t\t\t\tPHONE NUMBER :"+p1);
        System.out.println("\t\t\t\t\t _________________________________________________");

        System.out.println("\t\t\t\t\t Particulars\t\t\t\tAmount");
        System.out.println("\t\t\t\t\t 1st floor-Grocery Shop\t\t\tRs "+f8);
        System.out.println("\t\t\t\t\t 2nd floor-Digital Shop\t\t\tRs "+s8);
        System.out.println("\t\t\t\t\t 3rd floor-Show Off\t\t\tRs "+t3);
        System.out.println("\t\t\t\t\t 4th floor-Play Arena\t\t\tRs "+i8);
        System.out.println("\t\t\t\t\t 5th floor-Food Court\t\t\tRs "+fiv4);
        System.out.println("\t\t\t\t\t GST\t\t\t\t\tRs "+g);
        System.out.println("\t\t\t\t\t Dicount\t\t\t\tRs "+dis);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t GRAND TOTAL AMOUNT\t\tRUPEES: "+tamt);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t THANK YOU\n\t\t\t\t\t\t     PLEASE VISIT AGAIN :)");
        System.out.println("*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*");
        System.out.println("____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");

    }}


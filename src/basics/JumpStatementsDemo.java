package basics;

//jump statements are used to alter the normal flow of execution of the program abruptly.
//break statement: Used to stop the flow of the program based upon a condition.
//continue statement: it is used to skip the current iteration and move to the next iteration.


public class JumpStatementsDemo {
    public static void main(String[] args)
    {
        //break statement
        System.out.println("break statement!");
        for (int index = 0; index <= 5; index++)
        {
            if (index == 4)
            {
                break;
            }
            System.out.println(index);
        }

        //continue statement
        System.out.println("continue statement!");
        for(int index=0;index<5;index++)
        {
            if(index==2)
            {
                continue;
            }
            System.out.println(index);
        }
       //labelled jump statements in Java: java doesnt have go to statement hence labelled jump statements are used.
        for(int i=0;i<=3;i++)
        {
            one:
            {
                two:
                {
                    three:
                    {
                        System.out.println("i=" + i);
                        if(i==0)
                            break one;
                        if(i==1)
                            break two;
                        if(i==3)
                            break three;
                    }
                    System.out.println("After Label Three");
                }
                System.out.println("After Label Two");
            }
            System.out.println("After Label One");
        }

        //example 2 labelled break statement
        outer:
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(j==2)
                {
                    break outer;
                }
                System.out.println(i+" "+j);
            }
        }

        //example 3 labelled continue statement

        outer:
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(j==2)
                {
                    continue outer;
                }
                System.out.println(i+" "+j);
            }
        }
    }
}

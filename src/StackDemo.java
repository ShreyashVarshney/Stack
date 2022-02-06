import java.util.Scanner;
public class StackDemo
{
    int ar[];
    int top;
    StackDemo()
    {
        ar=new int[5];
        top=-1;
    }
    void push()
    {
        System.out.println("Push fn is working");
        if(top==ar.length-1)
        {
            System.out.println("Stack full/Overflow");
        }
        else
        {
            System.out.println("Enter any data");
            Scanner sc2=new Scanner(System.in);
            int item=sc2.nextInt();
            top=top+1;
            ar[top]=item;
        }


    }
    void pop()
    {
        System.out.println("Pop fn is working");
    }
    void view()
    {
        System.out.println("Veiw fn is working");
        if(top==-1)
        {
            System.out.println("Stack empty/underflow");
        }
        else
        {

            System.out.println("--Stack elements--");
            for(int i=top;i>=0;i--)
            {
                System.out.println(ar[i]);
            }
        }
    }
    public static void main(String args[])
    {
        StackDemo obj=new StackDemo();
        while(true)
        {
            System.out.println("\nPress 1 for Push");
            System.out.println("Press 2 for Pop");
            System.out.println("Press 3 for View");
            System.out.println("Press 4 for Exit");
            System.out.println("Enter your choice");
            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();

            switch(choice)
            {
                case 1:
                    obj.push();
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.view();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("WRONG option");

            }

        }


    }
}
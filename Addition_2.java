// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// class Addition_2
// {
//     public static void main(String args[])throws IOException
//     {
//         BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
//         int a,b;
//         System.out.println("Enter the value of a ");
//         a=Integer.parseInt(br.readLine());
//         System.out.println("Enter the value of b ");
//         b=Integer.parseInt(br.readLine());
//         System.out.println("The sum of "+a+" and "+b+" is "+(a+b));
//     }

// }

// import java.util.Scanner;
// class Addition_2
// {
//     public static void main(String args[])
//     {
//         Scanner sc= new Scanner(System.in);
//         int a, b, sum, mul;
//         System.out.print("Enter the value of a: ");
//         a=sc.nextInt();
//         System.out.print("Enter the value of b: ");
//         b=sc.nextInt();
//         sum=a+b;
//         System.out.println("The sum of "+a+" and "+b+" is "+sum);
//     }
// }

import java.util.Scanner;
class Addition_2
{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Addition_2 obj= new Addition_2();
        int x,y;
        int a=5;
        System.out.println("Enter the first value of x: ");
        x=sc.nextInt();
        System.out.println("Enter the second value of y: ");
        y=sc.nextInt();
        int mul = x*y;
        System.out.println("The multiplication result is "+ mul);
        obj.dummy(a);
    }

    void dummy(int a)
    {
        if(a==6)
        System.out.println("The value of a is " + a);
        else
        System.out.println("The value did not match");
    }
    
}
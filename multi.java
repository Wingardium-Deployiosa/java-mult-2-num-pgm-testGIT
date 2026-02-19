import java.util.*;
class Main{
    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("WELCOME TO MULTIPLICATION SIMULATOR");
        System.out.println("Enter first number : ");
        int firstnum = sc.nextInt();
        System.out.println("Enter Second number : ");
        int secondnum = sc.nextInt();
        System.out.println();
        System.out.println("The result is"+" "+firstnum*secondnum);
    }
}
import java.util.Scanner;
public class string{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        System.out.print("String: "+str);
        System.out.print("Length of the string is "+ str.length()+"\n");
        System.out.print("String in Uppercase is "+str.toUpperCase());
        System.out.print("String in Lowercase is "+str.toLowerCase());
        System.out.print("String Reversed is "+sb.reverse());
        

        sc.close();
    }
}
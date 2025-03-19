import java.util.*;
public class stringbufferhandling
{
    public static void main(String[] args)
    {
        StringBuffer sb1= new StringBuffer();
        System.out.println("CAPACITY OF StringBuffer object sb1 : "+sb1.capacity());
        StringBuffer sb2= new StringBuffer("Hello");
        System.out.println("CAPACITY OF StringBuffer object sb2 : "+sb2.capacity());
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a string : ");
        String inputString=scanner.nextLine();
        StringBuffer reversedBuffer=new StringBuffer(inputString);
        reversedBuffer.reverse();
        String reversedUpperCase=reversedBuffer.toString().toUpperCase();
        System.out.println("Reversed string in uppercase : "+reversedUpperCase);

    }
}

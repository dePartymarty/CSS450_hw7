import java.util.Scanner;
import java.net.Socket;
import java.io.PrintStream;
import java.net.InetAddress;


public class chatClient
{

   public static void main(String args[]) throws Exception
   {
      String name;

      Scanner scan = new Scanner(System.in);

      Socket s = new Socket("127.0.0.1", 2222);

      Scanner scan1 = new Scanner(s.getInputStream());

      System.out.println(scan1.nextLine()); 

      name = scan.nextLine();

      PrintStream p = new PrintStream(s.getOutputStream());
  

      p.println(name); 

   }
}   
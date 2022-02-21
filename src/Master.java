   import com.sun.security.jgss.GSSUtil;
   import jdk.internal.access.JavaNetUriAccess;

   import java.util.Arrays;
   import java.util.HashMap;
   import java.util.Map;
   import java.util.Scanner;

   public class Master {


    public static void main(String[] args) {

        boolean stop=false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your kod");

        while (!stop) {
            String data = scan.nextLine();
            DataCheck1 test = new DataCheck1();


            if (data.contains(".") || data.contains("-")) {
               String ToEnglish = test.morse(data);
               if(ToEnglish=="Invalid kod"){
                   System.out.println("Your kod has " + ToEnglish);
                   stop=true;
               }
               else

                System.out.println("Your kod is " + ToEnglish);
            }
            else if(data!=null && data!=""){

               String SS = test.ReadChar(data);
                if(SS=="Invalid data"){
                    System.out.println("Your kod has " +SS);
                    stop=true;
                }
                else

                System.out.println(SS);

            }
            else{
                System.out.println("Invalid input");
                stop=true;
            }




        }
    }

}









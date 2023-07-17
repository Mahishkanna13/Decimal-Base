import java.util.Scanner;

public class DecimaltoBase {
    public static String BaseConversion(int decimal,int base)
    {
        String result="",reverse="";
        while(decimal>0)
        {
            if(decimal>=base)
            {
                result+=decimal%base;
            }
            else {
                result+=decimal;
            }
            decimal=decimal/base;
        }
        for(int i=result.length()-1;i>=0;i--)
        {
            reverse+=result.charAt(i);
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int decimal= scanner.nextInt();
        int base= scanner.nextInt();
        System.out.println(BaseConversion(decimal,base));
    }
}

import java.util.Scanner;
public class L10q3
{
        public static int convertBinaryToDecimal(String binaryString)
        {
            int decimalValue = 0;
            int power = 0;

            for (int i = binaryString.length() - 1; i >= 0; i--)
            {
                char binaryDigit = binaryString.charAt(i);

                if (binaryDigit == '0')
                {
                    decimalValue += 0;
                }
                else if (binaryDigit == '1')
                {
                    decimalValue += Math.pow(2, power);
                }
                else
                {
                    throw new IllegalArgumentException("Invalid binary string: " + binaryString);
                }
                power++;
            }
            return decimalValue;
        }
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a binary string: ");
            String binaryString = scanner.nextLine();
            try
            {
                int decimalValue = convertBinaryToDecimal(binaryString);
                System.out.println("Decimal of "+binaryString+" is " + decimalValue);
            }
            catch (IllegalArgumentException e)
            {
                System.out.println(e.getMessage());
            }
            scanner.close();
        }
}
import java.util.*;
public class Stringq3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        if (containsOnlyDigits(input))
        {
            int sum = calculateSumOfDigits(input);
            System.out.println("Sum of digits: " + sum);
        }
        else if (containsOnlyCharacters(input))
        {
            int vowelCount = countVowels(input);
            int consonantCount = input.length() -
            vowelCount;
            System.out.println("Vowel count: " +
            vowelCount);
            System.out.println("Consonant count: " +
            consonantCount);
        }
        else if (containsBothCharactersAndDigits(input))
        {
            int characterCount = countCharacters(input);
            int digitCount = countDigits(input);
            System.out.println("Character count: " +
            characterCount);
            System.out.println("Digit count: " +
            digitCount);
        }
        else
        {
            System.out.println("Invalid input.");
        }
        scanner.close();
    }
    private static boolean containsOnlyDigits(String input)
    {
        return input.matches("\\d+");
    }
    private static boolean containsOnlyCharacters(String input)
    {
        return input.matches("[a-zA-Z]+");
    }
    private static boolean containsBothCharactersAndDigits(String input) {
        return input.matches("[a-zA-Z0-9]+");
    }
    private static int calculateSumOfDigits(String input)
    {
        int sum = 0;
        for (char c : input.toCharArray())
        {
            sum += Character.getNumericValue(c);
        }
        return sum;
    }
    private static int countVowels(String input)
    {
        int count = 0;
        String vowels = "AEIOUaeiou";
        for (char c : input.toCharArray())
        {
            if (vowels.indexOf(c) != -1)
            {
                count++;
            }
        }
        return count;
    }
    private static int countCharacters(String input)
    {
        int count = 0;
        for (char c : input.toCharArray())
        {
            if (Character.isLetter(c))
            {
                count++;
            }
        }
        return count;
    }
    private static int countDigits(String input)
    {
        int count = 0;
        for (char c : input.toCharArray())
        {
            if (Character.isDigit(c))
            {
                count++;
            }
        }
        return count;
    }
}

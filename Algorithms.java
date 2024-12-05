import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s; //odds
    public static void main(String[] args) throws FileNotFoundException {
        f = new File("Numbers.txt");
        int odds = odds();
        int evens = evens();
        int twoDigit = twoDigit();
        int bigger500 = bigger();
        int greatest = greatest();
        int lowest = lowest();
        int sum = sum();
        int amount = amount();
        double mean = sum/amount;
        System.out.println(odds);
        System.out.println(evens);
        System.out.println(twoDigit);
        System.out.println(bigger500);
        System.out.println(greatest);
        System.out.println(lowest);
        System.out.println(sum);
        System.out.println(mean);
        s.close();  //close() closes the stream or ends the reading of the file
    
    }
    //implement evens, twodigit, greatest, least and sum
    public static int odds() throws FileNotFoundException{
        s = new Scanner(f);
        int odds = 0;
        while (s.hasNext()) {           //hasnext scans if there is another item in the file, nextint checks the token as an int
            if (s.nextInt() % 2 != 0)
                odds++;
        }
        return odds;
    }

    public static int evens() throws FileNotFoundException{
        s = new Scanner(f);
        int evens = 0;
        while (s.hasNext()) {           
            if (s.nextInt() % 2 == 0)
                evens++;
        }
        return evens;
    }

    public static int twoDigit() throws FileNotFoundException{
        s = new Scanner(f);
        int twoDigit = 0;
        String tempString = "";
        while (s.hasNext())
        {
            tempString = s.next();
            if (tempString.length() <= 2)
            {
                twoDigit++;
            }
        }
        return twoDigit;
    }

    public static int bigger() throws FileNotFoundException{
        s = new Scanner(f);
        int bigger500 = 0;
        while (s.hasNext())
        {
            if (s.nextInt() > 500)
                bigger500++;
        }
        return bigger500;
    }

    public static int greatest() throws FileNotFoundException{
        s = new Scanner(f);
        int greatNum = 0;
        while (s.hasNext())
        {
            int current = s.nextInt();
            if (current > greatNum)
                greatNum = current;
                
        }
        return greatNum;
    }
    
    public static int lowest() throws FileNotFoundException{
        s = new Scanner(f);
        int lowNum = Integer.MAX_VALUE;
        while (s.hasNext())
        {
            int current = s.nextInt();
            if (current < lowNum)
                lowNum = current;
                
        }
        return lowNum;
    }

    public static int sum() throws FileNotFoundException{
        s = new Scanner(f);
        int sum = 0;
        while (s.hasNext())
        {
            int val = s.nextInt();
            sum += val;
        }
        return sum;
    }

    public static int amount() throws FileNotFoundException{
        s = new Scanner(f);
        int amount = 0;
        while (s.hasNext())
        {
            amount ++;
        }
        return amount;
    }
    //greatest, add a tempstring for the previous int and compare to the next int
}
import java.util.HashMap;
import java.util.HashSet;

public class QuanLyChuoi 
{
    private static HashMap<String, Integer> charOfStrings = new HashMap<>();

    public static int demSoKyTu(String string)
    {
        if (charOfStrings.containsKey(string))
        {
            return charOfStrings.get(string);
        }
        else
        {
            HashSet<String> temp = new HashSet<>();
            int count = 0;
            for (int i = 0; i < string.length(); i++)
            {
                if (!temp.contains( String.valueOf(string.charAt(i))))
                {
                    count++;
                    temp.add(String.valueOf(string.charAt(i)));
                }

            }
            charOfStrings.put(string, count);
            return count;
        }
    }
}
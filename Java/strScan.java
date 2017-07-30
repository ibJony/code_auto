import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class UniqueChar2 {
    
    public static void main (String args[])
    {
        boolean result=false;
        String inputstring="Alive is awesome";
        System.out.println("String method 2 answer "+ method2(inputstring));
    }
    
    public static boolean method2(String input)
    {
        for(int i=0; i < input.length();i++)
        {
            char charcterofinputstring=input.charAt(i);
            int count=0;
            for(int j=i; j < input.length();j++)
            {
                if (charcterofinputstring==input.charAt(j))
                count++;
            }
            if(count > 1)
            return false;
        }
        return true;
    }
}
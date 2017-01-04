package by.intexsoft.lesson04;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest
{
    public static void main(String[] args) throws Exception
    {
        Set<String> set = new HashSet<String>();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("жень-шень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");

        for(String s : set)
            System.out.println(s);
    }
}

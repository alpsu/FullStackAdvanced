package by.intexsoft.lesson04;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest
{
    public static void main(String[] args) throws Exception
    {
        Set<String> set = new HashSet<String>();
        set.add("�����");
        set.add("�����");
        set.add("�����");
        set.add("�����");
        set.add("����");
        set.add("�������");
        set.add("����-����");
        set.add("���������");
        set.add("����");
        set.add("���������");

        for(String s : set)
            System.out.println(s);
    }
}

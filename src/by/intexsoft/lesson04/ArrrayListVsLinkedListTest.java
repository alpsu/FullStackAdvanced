package by.intexsoft.lesson04;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ArrrayListVsLinkedListTest
{
    public static void main(String[] args) throws Exception
    {
        // ArrayList
        System.out.println("ArrayList");
        ArrayList arrayList = new ArrayList();
        insert100000(arrayList);
        get100000(arrayList);
        set100000(arrayList);
        remove100000(arrayList);
        System.out.println("\nLinkedList");
        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert100000(linkedList);
        get100000(linkedList);
        set100000(linkedList);
        remove100000(linkedList);
    }

    public static void insert100000(List list)
    {
        Date currentTime = new Date();
        for (int i = 0; i < 100000; i++)
            list.add(i);
        Date endTime = new Date();
        System.out.println("Insert 100000 - " +(endTime.getTime() - currentTime.getTime()));
    }

    public static void get100000(List list)
    {
        Date currentTime = new Date();
        for (int i = 0; i < 100000; i++)
            list.get(i);
        Date endTime = new Date();
        System.out.println("Get 100000 - " +(endTime.getTime() - currentTime.getTime()));
    }

    public static void set100000(List list)
    {
        Date currentTime = new Date();
        for (int i = 0; i < 100000; i++)
            list.set(i, i);
        Date endTime = new Date();
        System.out.println("Set 100000 - " +(endTime.getTime() - currentTime.getTime()));
    }

    public static void remove100000(List list)
    {
        Date currentTime = new Date();
        for (int i = 0; i < 100000; i++)
            list.remove(0);
        Date endTime = new Date();
        System.out.println("Remove 100000 - " +(endTime.getTime() - currentTime.getTime()));
    }
}

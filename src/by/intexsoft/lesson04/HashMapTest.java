package by.intexsoft.lesson04;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest
{
    public static void main(String[] args) throws Exception
    {
        Map<String, String> map = new HashMap<String, String>();
        map.put("�����", "�����");
        map.put("�����", "�����");
        map.put("�����", "�����");
        map.put("�����", "�����");
        map.put("����", "����");
        map.put("�������", "����");
        map.put("����-����", "������");
        map.put("���������", "�����");
        map.put("����", "������");
        map.put("���������", "�������");

        for (Map.Entry<String, String> pair : map.entrySet())
        {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }
}

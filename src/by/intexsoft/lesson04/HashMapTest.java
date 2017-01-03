package by.intexsoft.lesson04;

/* HashMap из 10 пар
—оздать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз Ц €года, банан Ц трава, вишн€ Ц €года, груша Ц фрукт, дын€ Ц овощ, ежевика Ц куст, жень-шень Ц корень, земл€ника Ц €года, ирис Ц цветок, картофель Ц клубень.
¬ывести содержимое коллекции на экран, каждый элемент с новой строки.
ѕример вывода (тут показана только одна строка):
картофель Ц овощ
*/

import java.util.HashMap;
import java.util.Map;

public class HashMapTest
{
    public static void main(String[] args) throws Exception
    {
        //Ќапишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();
        map.put("арбуз", "€года");
        map.put("банан", "трава");
        map.put("вишн€", "€года");
        map.put("груша", "фрукт");
        map.put("дын€", "овощ");
        map.put("ежевика", "куст");
        map.put("жень-шень", "корень");
        map.put("земл€ника", "€года");
        map.put("ирис", "цветок");
        map.put("картофель", "клубень");

        for (Map.Entry<String, String> pair : map.entrySet())
        {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }
}

import java.lang.*;
import java.util.*;

class AL
{
    public static void main(String arg[])
    {
        ArrayList <String>obj = new ArrayList<String>();

        obj.add("January");
        obj.add("February");
        obj.add("March");
        obj.add("Nishikant");
        obj.add("April");
       // obj.add(2,"New");
        obj.add("May");
        obj.add("Nishikant");
        obj.add("Nishikant");
        obj.add("Nishikant");


        System.out.println("Arraylist contains : "+obj);
        System.out.println("Size is : "+obj.size());

        int i = 0;
        System.out.println("Elements are using for loop : ");
        for( i = 0; i < obj.size(); i++)
        {
            System.out.println(obj.get(i));
        }

        String str;
        int Cnt = 0;
        for( i = 0; i < obj.size(); i++)
        {
            str = obj.get(i);
            if(str.equals("Nishikant"))
            {
                Cnt++;
            }
        }
        System.out.println("Nishikant occurs at "+ Cnt + "times in arraylist");


        if(obj.contains("April"))
        {
            System.out.println("Element is there");
        }

        int ret = obj.indexOf("April");
        System.out.println("Element is at : "+ret);

        System.out.println("Element at index 3 is  : "+obj.get(3));

        obj.remove(3);
        obj.remove("April");
        System.out.println("Updated list is : "+obj);

        Iterator iobj = obj.iterator();
        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }

        obj.clear();
        System.out.println("Updated list is : "+obj);

    }
}
package test;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class SampleCodes {
    @Test
    public void findFibonocci()
    {
        {
            int count =10;
            int a=0,b=0,c=1;
            for (int i=0;i<10;i++)
            {
                a=b;
                b=c;
                c=a+b;
                System.out.println(a);
            }
        }
    }
    @Test
    public void findDuplicates()
    {
    String a="i am testing for for duplicates";
    String[] b=a.split(" ");
    Set<String> setex=new HashSet<String>();
    StringBuffer sb=new StringBuffer();
        for (String temp:b)
    {
        if(setex.contains(temp)) {
            System.out.println(temp);
            sb.append(temp);
        }
        else
            setex.add(temp);
    }
        System.out.println(sb);
        System.out.println("setex:"+setex);
}
}
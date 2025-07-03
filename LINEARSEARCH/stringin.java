package LINEARSEARCH;

public class stringin {
    public static void main(String[] args)
    {
        String name="Anas";
        char target='s';
        search(name,target);
    }
    static boolean search(String name,char target)
    {
        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i)==target)
            {
                System.out.println("AT INDEX:"+i);
                return true;

            }
        }
        return false;
    }

}

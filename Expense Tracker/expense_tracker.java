import java.io.*;
import java.util.*;
class expense_tracker
{
    Map<String,Double> hm= new HashMap<String,Double>() ;
    public static void main(String args[])
    {
         System.out.println(new File("expense.txt").getAbsolutePath());
        expense_tracker obj=new expense_tracker();
        try{
        BufferedReader br =new BufferedReader(new FileReader("expense.txt") );
        String line;
        while((line=br.readLine()) !=null)
        {
            obj.createMap(line);
        }
        obj.tracker();
        br.close();
    }
    catch(IOException e)
    {
       
        System.out.println("Error regarding input");
    }
}
public void createMap(String input)
{
    try{
    String category=input.substring(input.indexOf(',')+1,input.lastIndexOf(','));
    double price=Double.parseDouble(input.substring(input.lastIndexOf(',')+1));
    boolean flag=hm.containsKey(category);
    if(flag)
    {
        price = price+ hm.get(category);
        hm.put(category,price);
    }
    else
    {
       hm.put(category,price);
    }
}catch(Exception e)
{System.out.println(e.getMessage());}
}
public void tracker()
{
    String max="";double total=0;
        for(Map.Entry<String,Double> entry :hm.entrySet())
        {
         System.out.println(entry.getKey()+":"+entry.getValue());
            if(max=="")
            {
                max=entry.getKey();
            }
            else if(entry.getValue()> hm.get(max))
            {
                max=entry.getKey();
            }
            total=total+entry.getValue();
        }
        System.out.println("Total expense:"+total);
        System.out.println("Biggest category:"+max);

}
}
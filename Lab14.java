import java.util.*;
class BlueRayDisk
{
   public String title;
   public String director;
   public int yor;
   public double cost;
   BlueRayDisk(String ti, String dir, int year, double money)
   {
       title = ti;
       director = dir;
       yor = year;
       cost = money;
   }
    @Override
    public String toString()
    {
        return "[$" +cost+" - "+ yor +" - "+ title +", "+director+ "]";
    }
}
class Node
{
    public BlueRayDisk data;
    public Node next;
    Node()
    {
       next=null;
    }
    Node(BlueRayDisk data)
    {
        this.data=data;
    }
}
class BlueRayCollection
{
    private Node head;
    BlueRayCollection()
    {
        head = null;
    }
    public void add(String ti, String dir, int year, double cost)
    {
        BlueRayDisk brd = new BlueRayDisk(ti,dir,year,cost);
        Node temp = new Node(brd);
        if(temp.next == null)
        {
            head = temp;
        }
        else
        {
            Node current = head;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=temp;
        }
    }
    public void showAll() {
        Node c = head;
        if(c!=null) {
            System.out.println(c.data.toString());
        }
        while(c.next!=null) {
            c = c.next;
            System.out.println(c.data.toString());
        }
    }
}
public class Lab14
{
    public static void main(String[]args)
    {
        BlueRayCollection beta = new BlueRayCollection();
        Scanner jerry = new Scanner(System.in);
        Scanner ike = new Scanner(System.in);
        Scanner mike = new Scanner(System.in);
        Scanner barry = new Scanner(System.in);
        Scanner bike = new Scanner(System.in);
        int i = 1;
        while(i != 0)
        {
            System.out.println("0: Quit");
            System.out.println("1: Add BlueRay to Collection");
            System.out.println("2: See collection");
            i = jerry.nextInt();
            if(i == 1)
            {
                System.out.println("What is the title?");
                String title = bike.nextLine();
                System.out.println("Who is the director?");
                String director = ike.nextLine();
                System.out.println("On what year did it release?");
                int yor = mike.nextInt();
                System.out.println("How much did it cost?");
                double cost = barry.nextDouble();
                beta.add(title,director,yor,cost);
            }
            else if(i == 2)
            {
                beta.showAll();
            }
        }
    }


}

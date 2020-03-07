
public class BagDemo {
    

    public static void main(String[] args) {
        
    
    ArrayBag trail = new ArrayBag(20);
    
   trail.add(100);
   trail.add(1);
   trail.add(200);
   trail.add(2022);
   trail.add(3);
   
   
   trail.remove(2022);
   printBag(trail);
   
    
}
    public static void printBag(ArrayBag bag) {
        System.out.println("Number of elements in the bag : "
                + bag.numItems());
        Object[] elements = bag.toArray();
        for(int i=0; i<bag.numItems(); i++)
            System.out.print(elements[i]+" ");
        System.out.println();
    }
}

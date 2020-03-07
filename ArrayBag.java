public class ArrayBag implements Bag {
    
    private Object[] items;
    private int numItems = 0;
    private final static int MAX_SIZE = 100;
    
    public ArrayBag(){
        items = new Object[MAX_SIZE];
    }
    
    public ArrayBag(int size){
        if(size < 0){
            System.out.println("Enter Valid Number");
        }
       else     
       items = new Object[size];
    }
    
    public boolean add(Object item){
        if(item == null){
            return false;
        }
            if(items.length == numItems ){
                return false; 
        }
            else 
                items[numItems] =item;
                numItems++;
                return true;
            
    }
    
    public boolean remove(Object item){
      
        for(int i=0; i < items.length;i++){
            if(items[i].equals(item)){
                for(int j = i; j < items.length -1; j++)
                items[j]= items[j+1];
                
                 return true;
            }
           
            else {
               System.out.println(item + " not found!");
                return false;
            }
        }
        return true;
    }
    
         
    
    
    public boolean contains(Object item){
      int i = 0;
	while (i<=numItems){
	if (items[i] == item){
	return true;
       }
	i++;
}
return false;
    }
    
    public boolean containsAll(Bag otherBag){
        if(otherBag == null || otherBag.numItems() ==0){
            return false;
        }
            Object[] otherItems = otherBag.toArray();
            for(int i = 0; i < otherItems.length; i++){
                if( !contains(otherItems[i]))
                 return false;
               
        }
            return true;
    }
    
    
    public int numItems(){
      int counter = 0;
        for (int i = 0; i < items.length; i ++){
    if (items[i] != null)  counter++;
        }
        
        return counter;
    
    
    }
    public Object grab(){
       return items[(int) Math.random()];
    }
    
    public Object[] toArray(){
        Object[] newArray = items.clone();
        return newArray;
    }
    
    

    
}

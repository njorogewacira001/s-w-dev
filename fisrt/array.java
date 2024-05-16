package fisrt;

public class array {
    private int [] items;
    private int count;

    public array (int length){
        items = new int[length];
    }

    public void insert(int item){
        items[count] = item;
    }

    public void removeAt(int index) {

        if (index < 0 || index >= count) 
            throw new IllegalArgumentException();
        
        for(int i = index; i< count; i ++) 
            items[i] = items[i + 1];
            
        count--;
            
                   
    }

    public int indexOf(int item ){
        for(int i = 0; i < count; i ++)
            if (items[i]== item) 
                return i;
        return - 1;
                
           
        

    }

    public void print () {
        for (int i = 0; i < count ; i ++)
            System.out.println(items[i]);

        
    }

        
}

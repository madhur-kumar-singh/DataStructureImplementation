import java.util.ArrayList;

public class heap {
    ArrayList<Integer> al;
    heap(){
        al=new ArrayList<>();

    }
    //to find size
    public int size(){
        return al.size();
    }
    //to find it is empty or not
    public boolean isEmpty(){
        return al.size()==0;
    }
    \//to display
    public void display(){
        System.out.println(al);
    }
    //to display only first element as queue show first in first out
    public int peek(){
        return al.get(0);
    }// to add in priority queue
    public void add(int ali){
        al.add(ali);
        upHeapify(al.size()-1);
    }
    // for checking the condition for heapify
    private void upHeapify(int child){
        int parent=(child-1)/2;
        if(al.get(parent)>al.get(child))
        {
            swap(child,parent);
            upHeapify(parent);
        }

    }
    // for swaping
    private void swap(int child,int parent){
        int temp=al.get(child);
        al.set(child,al.get(parent));
        al.set(parent,temp);
        }
}

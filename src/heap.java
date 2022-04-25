import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

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
    //to display
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
    // for swapping
    private void swap(int child,int parent){
        int temp=al.get(child);
        al.set(child,al.get(parent));
        al.set(parent,temp);
    }//deleting the root element
    public int pop(){
        int  ans=peek();
        al.set(0,al.get(al.size()-1));
        al.remove(al.size()-1);
        downHeapify(0);
        return ans;
    }
    //for converting min to max use Collections.reverseOrder()
    private void downHeapify(int p){
        int c1=2*p+1;
        int c2=2*p+2;
        int min_number=p;
        if(al.get(c1)<al.get(p))
            min_number=c1;
        if(al.get(c2)<al.get(p))
            min_number=c2;
        if(min_number!=p)
            swap(min_number,p);
        downHeapify(min_number);
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> pa=new PriorityQueue<>(Collections.reverseOrder());
    }
}

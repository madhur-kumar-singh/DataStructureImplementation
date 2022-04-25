import java.util.ArrayList;

public class heap {
    ArrayList<Integer> al;
    heap(){
        al=new ArrayList<>();

    }
    public int size(){
        return al.size();
    }
    public boolean isEmpty(){
        return al.size()==0;
    }
    public void display(){
        System.out.println(al);
    }
    public int peek(){
        return al.get(0);
    }
    public void add(int ali){
        al.add(ali);
        upHeapify(al.size()-1);
    }
    private void upHeapify(int child){
        int parent=(child-1)/2;
        if(al.get(parent)>al.get(child))
        {
            swap(child,parent);
            upHeapify(parent);
        }

    }
    private void swap(int child,int parent){
        int temp=al.get(child);
        al.set(child,al.get(parent));
        al.set(parent,temp);
        }
}

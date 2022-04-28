import java.util.ArrayList;

public class hashing {
    class Node{
        String key;
        Integer value;
        Node next;
        public Node(String k,int v){
            key=k;
            value=v;
        }
    }
    ArrayList<Node> bucket;


    public hashing(){
        bucket=new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            bucket.add(null);
        }
    }
    public void put(String k,int v){
        int bucket_number=hashFn(k);
        Node nn=new Node(k,v);
        Node head=bucket.get(bucket_number);
        nn.neext=head;
        bucket.set(bucket_number,nn);
    }
    public int hashFn(String k){
        int l=k.hashCode();
        return l%bucket.size();
    }
    public int get(String k){
        int bucket_num=hashFn(k);
        Node head= bucket.get(bucket_num);
        while(head!=null){
            if(head.key.equals(k)){
                return head.value;
            }
            head=head.next;
        }
        return -1;
    }
}

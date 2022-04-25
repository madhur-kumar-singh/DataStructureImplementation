import java.util.PriorityQueue;
// k largest element using heap
public class KLargestElement {
    public static void main(String[] args) {
        int [] arr={20,30,61,50,10,55,57,40};
        int k=3;
        Largest_k(arr,k);
    }
    public static  void Largest_k(int[] arr,int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for(int i=0;i< arr.length;i++){
            pq.add(arr[i]);
            if(pq.size()>k)
                pq.poll();
        }
        System.out.println(pq);
    }
}

import java.util.HashMap;

public class longestConsecutiveString {
    public static void main(String[] args) {
        int[] arr1={2,12,9,16,10,5,3,20,25,11,1,8,6};
        longest(arr1);
    }
    public static void longest(int [] arr1){
        HashMap<Integer,Boolean>   map=new HashMap<>();


        for(int alu:arr1)
        {
            map.put(alu,true);
            if(map.containsKey(alu-1)){8
                map.put(alu,false);
            }
            if(map.containsKey(alu+1))
                map.put(alu+1,false);
        }
        for(int ali:arr1){
            if(map.get(ali))
            {
                int start=ali;
                while(map.containsKey(start)){
                    System.out.print(start+" ");
                    start++;
                }
                System.out.println();
            }
        }
    }
}

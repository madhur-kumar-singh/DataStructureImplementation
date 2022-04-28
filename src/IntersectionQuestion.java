import java.util.HashMap;

public class IntersectionQuestion {
    public static void main(String[] args) {
        int[] arr1={10,20,20,30,10,40,20};
        int[] arr2={20,40,30,10,40,20};
        Intersection(arr1,arr2);

    }
    public static void Intersection(int[] arr1,int[] arr2){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ali:arr1){
            int pre=map.getOrDefault(ali,0);
            map.put(ali,pre+1);
//            if(map.containsKey(ali)){
//                map.put(ali,map.get(ali)+1);
//            }
//            else{
//                map.put(ali,1);
  //          }
        }
        System.out.println(map);
        for(int ali:arr2){
            if(map.containsKey(ali) && map.get(ali)>0){
               map.put(ali,map.get(ali)-1) ;
                System.out.println(ali);
            }
        }
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class hashMap {
    public static void main(String[] args){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Madhur",50);
        map.put("Shetaan",100);
        map.put("Satyam",70);
        map.put("La",60);
        System.out.println(map);
        System.out.println(map.get("Madhur"));
        Set<String> keys=map.keySet();
        for(String key:keys){
            System.out.println(key);
        }
        ArrayList<String> al_key=new ArrayList<>(keys);
        for(String key:al_key)
            System.out.println(key);

    }
}

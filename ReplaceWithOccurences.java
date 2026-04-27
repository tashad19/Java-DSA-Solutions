import java.util.*;
 
public class ReplaceWithOccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
            
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
                map.putIfAbsent(arr[i], new ArrayList<>());
                map.get(arr[i]).add(i);
            }
            
            boolean valid = true;
            
            for(int key : map.keySet()){
                // System.out.println(key + ": " + map.get(key));
                if(map.get(key).size()%key!=0) valid = false;
            }
            
            if(valid == true){
                int[] ans = new int[n]; 
                
                int x = 1; // start from 1
                for(int key : map.keySet()){
                    for(int i=0; i<map.get(key).size(); i++){
                        if(i%key==0 && i!=0) x++;
                        
                        int idx = map.get(key).get(i);
                        ans[idx] = x;
                    }
                    x++;
                }
                
                for(int num : ans) System.out.print(num + " ");
                System.out.println();
                
            } else {
                System.out.println("-1");
            }
        }
    }
}